package com.techreturners.types

object ScalaTypes {

  // Here's some variables declared with their type
  val anInteger: Int = 7
  val aBoolean: Boolean = false


  // Scala also has the type 'Any' which is the supertype of all types
  // That means we can have a collection that can contain multiple different
  // types (a bit like you can do with JavaScript
  val list: List[Any] = List(
    "a string",
    732,  // an integer
    'c',  // a character
    true, // a boolean value
    9.76 // a float value
  )
}
