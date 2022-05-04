package com.techreturners.classes

// Here we see a User class.
// The brackets after the class name indicate the constructor.
// Notice we've declared them as 'vals' that means they are public accessible
// but we cannot edit those values after creation.
// For example the following is invalid syntax
// val u = new User(1, "something")
// u.id = 2
class UserWithValConstruction(val id: Long, val userName: String, enemy: String = "Scar") {

  def displayUsername : String = s"Username: $userName"

  // Overriding the default toString method
  override def toString: String =
    s"($id, $userName)"

}
