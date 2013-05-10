package noob.fold

object Fold {

  // Fill in the implementations by replacing ??? with code that works.
  // You can use `test` in sbt to check your work, or `console` to try out your functions.

  // PART 1: Associative Folding

  // (1.1) Find the sum of a list of integers using `fold`. The sum of an empty list is zero. 
  def sum(ns:List[Int]):Int = 
    ns.fold(???)(???)

  // (1.2) Concatenate a list of strings using `fold`.
  def concat(ns:List[String]):String = 
    ???

  // PART 2: Non-associative Folding

  // (2.1) Fold up a list using `foldLeft` and construct another list with the same elements. Here 
  // you need to distinguish which argument is which because the accumulator is of a different type. 
  // What does this mystery function do?
  def mystery1[A](as:List[A]):List[A] =
    as.foldLeft(List.empty[A])(???)

  // (2.2) Now try it with `foldRight`. What does this function do? 
  // What can we say about the difference between `foldLeft` and `foldRight`?
  def mystery2[A](as:List[A]):List[A] =
    ???

  // PART 3: Common operations in terms of fold. 

  // (3.1) Implement `length` in terms of a fold.
  def length[A](as:List[A]):Int =
    ???

  // (3.2) Implement `filter` in terms of a fold.
  def filter[A](as:List[A])(f:A => Boolean):List[A] = 
    ???

  // (3.3) Implement `map` in terms of a fold. 
  def map[A,B](as:List[A])(f:A => B):List[B] = 
    ???

  // (3.4 - harder) Implement `distinct` in terms of fold. You can use `contains(a)` to determine 
  // whether an element exists in a list. Don't worry about efficiency.
  def distinct[A](as:List[A]):List[A] = 
    ???

}


