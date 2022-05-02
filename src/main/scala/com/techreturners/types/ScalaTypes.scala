package com.techreturners.types

object ScalaTypes {

  // Here's some variables declared with their type
  // Declaring them as a val means their value CANNOT
  // be changed. EG. anInteger = 9 would not compile
  // Much like a 'const' in JavaScript
  val anInteger: Int = 7
  val aBoolean: Boolean = false

  // Declaring variables as 'var' means
  // they CAN be changed
  var anotherInteger: Int = 6
  anotherInteger = 28

  // Scala can also infer the type such as
  // the following code would infer that the type
  // of the variable is a String
  val anInferredString = "Some string"

  // Scala also has the type 'Any' which is the supertype of all types
  // That means we can have a collection that can contain multiple different
  // types (a bit like you can do with JavaScript)
  val list: List[Any] = List(
    "a string",
    732,  // an integer
    'c',  // a character
    true, // a boolean value
    9.76 // a float value
  )
}
