package noob.fold

object Fold {

  // Fill in the implementations by replacing ??? with code that works.
  // You can run ~test in your sbt console to check your work as you go.

  // PART 1: Folding with symmetric functions

  // Sum the given `List[Int]` starting from the left. The sum of an empty list 
  // is zero. 
  def sumL(ns:List[Int]):Int = 
    ns.foldLeft(???)(???)

  // Sum the given `List[Int]` starting from the right.
  def sumR(ns:List[Int]):Int = 
    ???

  // Concatenate the given `List[String]` into a single string.
  // Does it matter which way you go?
  def concat(ss:List[String]):String = 
    ???

  // PART 2: Folding with asymmetric functions

  // Fold up a list by constructing another list with the same elements as the
  // original list. Here you need to distinguish which argument is which because 
  // the accumulator is of a different type. What does this function do?
  def mystery1[A](as:List[A]):List[A] =
    as.foldLeft(List.empty[A])(???)

  // Now try it with `foldRight`. What does this function do? What can we say 
  // about the difference between `foldLeft` and `foldRight`>
  def mystery2[A](as:List[A]):List[A] =
    ???

  // PART 3: Common operations in terms of fold. 

  // Implement `filter` in terms of fold.
  def filter[A](as:List[A])(f: A => Boolean):List[A] = 
    ???

  // Implement `map` in terms of fold. 
  def map[A,B](as:List[A])(f: A => B):List[B] = 
    ???

  // Implement `distinct` in terms of a fold. This function should remove
  // duplicates, returning a list in which only the first occurrence of an
  // element occurs. Don't worry about complexity; O(N^2) is fine. As a bonus,
  // use a more complex accumulator to implement `distinct` in O(N log N) time.
  def distinct[A](as:List[A]):List[A] = 
    ???

}


