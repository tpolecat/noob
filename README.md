noob
-----

A set of 20-minute talks and exercises for **noob hour** at PDXScala. The goal is to have a set of fill-in exercises with predefined tests, so we can talk through the subject and everyone can fill in code as we go.

So far there is:

* `fold/` - an introduction to folding over lists.

Some ideas:

* Intro to typeclasses? Monoid?

Longer talks?

* Implement monads for `Id[A]`, `A => B` (this is `Reader[A,B]`), and `A => M[B]` (this is `Kleisli[M,A,B]`). Then show how `Reader[A,B]` is actually `Kleisli[Id,A,B]`. Replace `Id` with something else and see what happens.






