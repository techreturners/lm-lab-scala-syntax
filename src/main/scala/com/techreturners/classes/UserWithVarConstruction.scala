package com.techreturners.classes

// Here we see a User class.
// The brackets after the class name indicate the constructor
// Notice we've declared them as 'vars' that means they are public accessible
// It also means we can change them public
// For example the following is valid syntax
// val u = new User(1, "something")
// u.id = 2
class UserWithVarConstruction(var id: Long, var userName: String) {

  def printUsername : String = s"Username: $userName"

}
