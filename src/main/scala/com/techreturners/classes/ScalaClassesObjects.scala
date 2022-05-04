package com.techreturners.classes

// Much of the examples here are covered during the Scala tour on classes
// https://docs.scala-lang.org/tour/classes.html
object ScalaClassesObjects {

  def printInfo(): Unit = {
    println("\n======")
    println("Reviewing classes, traits and objects - You can see these in the User.scala,  files")
    println("======")

    val userOne = new UserWithVarConstruction(id = 1, "mufasa")
    println(s"Calling method from user class.... ${userOne.displayUsername}")
    // Because we utilised the 'var' keyword for the instance variables
    // they are publicly accessible and we can publicly change them
    userOne.id = 28
    println(s"User Id of u1 after updating is: ${userOne.id}")

    val userTwo = new UserWithValConstruction(id = 2, "simba")
    // u2.id = 28 <-- This wouldn't compile because we declared the values as 'val'
    println(s"User Id of u2 is: ${userTwo.id}")

    // If neither val nor var is used then Scala assumes the member variable is private
    // For example
    // userTwo.enemy would not compile because the 'enemy' variable is not var or val

    val userSameValuesOne = new UserWithValConstruction(1, "nala")
    val userSameValuesTwo = new UserWithValConstruction(1, "nala")
    println("Now comparing classes - take the following two users")
    println(s"User One: $userSameValuesOne")
    println(s"User Two: $userSameValuesTwo")

    // The way two objects are compared, when using the class to define the object,
    // does not compare the values of the object - this will return false
    println(s"Testing if the two objects are equal: ${userSameValuesOne == userSameValuesTwo }")


    // The next two users are created using case classes.
    // Case classes are immutable  that means we couldn't do:
    // userOneSameValuesAsCaseClass.id = 7
    // also notice we don't need the 'new' aspect when using a case class
    val userOneSameValuesAsCaseClass = UserAsCaseClass(1, "timon")
    val userTwoSameValuesAsCaseClass = UserAsCaseClass(1, "timon")
    // but when we compare them it will compare the values
    println(s"Now testing if the two objects as case classes are equal: ${userOneSameValuesAsCaseClass == userTwoSameValuesAsCaseClass }")

    // Here we see the use of a Scala object.
    // Notice we create two variables
    // but even though they are separate variables
    // when we call the function on the second object we
    // get an updated count
    val userAsObject = UserObject
    val secondUserAsObject = UserObject
    println(s"Getting count from an object: ${userAsObject.incrementAndGetCount()}")
    println(s"Getting count from a different object: ${secondUserAsObject.incrementAndGetCount()}")

  }

}
