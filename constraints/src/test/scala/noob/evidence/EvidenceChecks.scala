package noob.evidence

import org.specs2._
import org.scalacheck._

import Evidence._

object EvidenceCheck extends Specification with ScalaCheck { def is =

  "A value of type Box[A] should..."                        ^
    "handle upperCase for String"   ! propUpperCase         ^
    "handle length for Seq[_]"      ! propLength            ^
    "handle length for String"      ! propLengthString      ^
    "handle flatten for Box[B]"     ! propFlatten           ^
    "handle orNull for nullable A"  ! propOrNull            ^
    "handle + for Int"              ! propAddInt            ^
    "handle + for Double"           ! propAddDouble         ^
                                                          end

  implicit def arbBox[A:Arbitrary]:Arbitrary[Box[A]] = Arbitrary {
    Arbitrary.arbitrary[A].map(Box(_))
  }

  val propUpperCase = prop { (b:Box[String]) => 
    b.toUpperCase == Box(b.a.toUpperCase) 
  }

  val propLength = prop { (b:Box[List[Int]]) => 
    b.length == b.a.length 
  } 

  val propLengthString = prop { (b:Box[String]) => 
    b.length == b.a.length 
  }

  val propFlatten = prop { (b:Box[Box[String]]) => 
    b.flatten == b.a 
  }

  val propOrNull = prop { (b:Box[String]) => 
    b.orNull(_.isEmpty) == Option(b.a).filter(_.isEmpty).orNull 
  }

  val propAddInt = prop { (a:Box[Int], b:Box[Int]) => 
    a + b == Box(a.a + b.a)
  }

  val propAddDouble = prop { (a:Box[Double], b:Box[Double]) => 
    a + b == Box(a.a + b.a) 
  }

}




