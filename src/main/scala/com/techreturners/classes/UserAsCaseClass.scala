package com.techreturners.classes

// Case classes are fun :) https://docs.scala-lang.org/tour/case-classes.html
// Case classes are immutable. That means their instance variables like
// the id and username below cannot be changed after being instantiated
// I think of them as syntactic sugar for a class that has used 'val' for
// for all its instance variables
// They also compare the values of the instance variables when comparing two
// case classes
case class UserAsCaseClass(id: Long, username: String)
