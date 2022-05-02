package com.techreturners.functionsandmethods

object ScalaFunctionsAndMethods {

  // Here we see a named function called 'doSomeAdding'
  // Notice how similar it is to how you might define
  // an arrow function in JavaScript
  val doSomeAdding = (a: Int, b: Int) => a + b

  // Scala methods are defined slightly different to functions.
  // Also notice we don't utilise the 'return' statement.
  // It isn't invalid to define the return statement but in
  // Scala it's rarely utilised. For example the method below could be written as
  // def doSomeMultiplication(a: Int, b: Int) : Int = return a * b
  def doSomeMultiplication(a: Int, b: Int) : Int = a * b

  // Functions and methods can also have blocks if they require more lines
  // and Scala will assume the ending blocks is the return statement
  def doSomeMethodWithMultipleLines(name: String) : String = {
    if( name == "Tech Returners") {
      s"Hi there $name team!"
    }
    else {
      s"Hello there $name"
    }
  }

  // You can also define default values for variables passed to a method
  def doSomeMethodWithDefaultValue(name: String = "there") = s"Hello $name"


  // Declaring a method as returning a 'Unit' means there is nothing to
  // return - Other languages would utilise the 'void' keyword to define
  // a method that does a job but does not return a result
  def printInfo(): Unit = {
    println("\n======")
    println("Reviewing scala functions and methods - You can see these in the ScalaFunctionsAndMethods.scala file")
    println("======")

    println(s"Here's a named function being called. The result of calling doSomeAdding is: ${doSomeAdding(7, 10)}")
    println(s"Here's a method being called. The result of calling doSomeMultiplication is: ${doSomeMultiplication(7, 10)}")

    println(s"Here's a multi-line method being called. The result of calling " +
      s"doSomeMethodWithMultipleLines is '${doSomeMethodWithMultipleLines("Marge")}'")

    println(s"Here's a method being called where the parameter has a default value. The result of calling " +
      s"doSomeMethodWithDefaultValue is '${doSomeMethodWithDefaultValue()}'")
  }
}
