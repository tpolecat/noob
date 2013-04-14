package noob.fold

import org.scalacheck.Properties
import org.scalacheck.Prop.forAll

object QuoteCheck extends Properties("Fold") {

  property("sumL") = 
    forAll((ns: List[Int]) => Fold.sumL(ns) == ns.sum )
  
  property("sumR") = 
    forAll((ns: List[Int]) => Fold.sumR(ns) == ns.sum )
  
  property("concat") = 
    forAll((ss:List[String]) => Fold.concat(ss) == ss.flatten.mkString)

  property("mystery1") = 
    forAll((ns:List[Int]) => Fold.mystery1(ns) == ns.reverse)

  property("mystery2") = 
    forAll((ns:List[Int]) => Fold.mystery2(ns) == ns)

  property("filter") = {
    def even(n:Int) = (n % 2) == 0
    forAll((ns:List[Int]) => Fold.filter(ns)(even) == ns.filter(even))
  }

  property("map") = {
    forAll((ss:List[String]) => Fold.map(ss)(_.length) == ss.map(_.length))
  }

}




