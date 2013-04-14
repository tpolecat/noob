package noob.fold

import org.specs2._
import org.scalacheck._

object QuoteCheck extends Specification with ScalaCheck { def is =

  "sumL"     ! prop { (ns: List[Int]) => Fold.sumL(ns) == ns.sum } ^
  "sumR"     ! prop { (ns: List[Int]) => Fold.sumR(ns) == ns.sum } ^
  "concat"   ! prop { (ss:List[String]) => Fold.concat(ss) == ss.flatten.mkString } ^
  "mystery1" ! prop { (ns:List[Int]) => Fold.mystery1(ns) == ns.reverse } ^
  "mystery2" ! prop { (ns:List[Int]) => Fold.mystery2(ns) == ns } ^
  "filter"   ! prop { (ns:List[Int]) => Fold.filter(ns)(even) == ns.filter(even) } ^
  "map"      ! prop { (ss:List[String]) => Fold.map(ss)(_.length) == ss.map(_.length) }

  def even(n:Int) = (n % 2) == 0 

}




