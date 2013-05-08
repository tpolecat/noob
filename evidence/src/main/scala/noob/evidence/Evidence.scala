package noob.evidence

import java.sql.ResultSet
import Numeric.Implicits._

object Evidence {

  // Here is a container for a value of [any] type `A`.
  case class Box[A](a: A) {

    // Most of the time our methods can be completely generic, like these:
    def map[B](f: A => B): Box[B] = Box(f(a))
    def flatMap[B](f: A => Box[B]): Box[B] = f(a) 

    // But sometimes we might want specialized methods that work only for certain types `A`. Solve 
    // each of these problems by removing the "??? //" and adding the proper evidence parameter. You 
    // can type `compile` to typecheck your code in sbt, or `console` to try out your code, or 
    // `test` to run the tests.

    // (1) Return the upper-cased version of this `Box`. 
    // Calls to this method should only compile if `A` is `String`.
    def toUpperCase: Box[String] = ??? // map(_.toUpperCase)

    // (2) Return the length of `a`. 
    // Calls to this method should compile only if `A` is some kind of `Seq`.
    def length: Int = ??? // a.length

    // (3) Does `Box("foo").length` work? If not, why not? Go back and fix it! 

    // (4) Call `close()` on `a`. 
    // Calls to this method should compile only if `A` has a `close()` method.
    def close(): Unit = ??? // a.close()

    // (5) Flatten a nested `Box[Box[B]`. 
    // Calls to this method should only compile if `A` is a `Box[B]` for some `B`.
    def flatten[B]: Box[B] = ??? // a

    // (6) Return the value of `a` if the filter passes, or `null` otherwise.
    // Calls to this method should compile only for nullable types `A`.
    def orNull(f: A => Boolean): A = ??? // if (f(a)) a else null
    
    // (7) Return the sum of two boxes.
    // Calls to this method should compile for any `Numeric` type `A`.
    def +(other:Box[A]): Box[A] = ??? // Box(a + other.a)

  }
  
  // (8) Construct a proof that `ResultSet` has a `close():Unit` method. 
  // Why might this be a useful thing to do?
  ??? // implicitly[...]

}

