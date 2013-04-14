package noob.fold

import org.specs2._
import org.scalacheck._

object QuoteCheck extends Specification with ScalaCheck { def is =

  "sum"      ! prop { (ns:List[Int])    => Fold.sum(ns) == ns.sum }                    ^
  "concat"   ! prop { (ss:List[String]) => Fold.concat(ss) == ss.flatten.mkString }     ^
  "mystery1" ! prop { (ns:List[Int])    => Fold.mystery1(ns) == ns.reverse }            ^
  "mystery2" ! prop { (ns:List[Int])    => Fold.mystery2(ns) == ns }                    ^
  "length"   ! prop { (ns:List[Int])    => Fold.length(ns) == ns.length }               ^
  "filter"   ! prop { (ns:List[Int])    => Fold.filter(ns)(even) == ns.filter(even) }   ^
  "map"      ! prop { (ss:List[String]) => Fold.map(ss)(_.length) == ss.map(_.length) } ^
  "distinct" ! prop { (ss:List[String]) => Fold.distinct(ss) == ss.distinct }

  def even(n:Int) = (n % 2) == 0 

}




