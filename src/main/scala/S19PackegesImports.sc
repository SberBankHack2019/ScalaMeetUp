// import clauses are for accessing members
// (classes, traits, functions, etc.) in other packages

object Users {
  class UserCl
}

import Users._
val u = new UserCl
