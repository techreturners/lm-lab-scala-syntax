package com.techreturners.currying

// Currying is the technique of translating the evaluation of a function that takes multiple
// arguments into evaluating a sequence of functions, each with a single argument.
// Its very common to curry functions in other languages such as JavaScript.
// It is made possible by being able to assign functions to variables.
//
// This link provides an example of a practical application of currying
// https://lukajcb.github.io/blog/scala/2016/03/08/a-real-world-currying-example.html

// Here is another give video outlining practical applications of currying. Although
// JavaScript it provides a good tutorial of the structure. In fact it's been translated to Scala below
// https://www.youtube.com/watch?v=fvJ9yWqXcZI
object ScalaCurrying {

  val names = List("Susan", "Jeff", "Colin", "Revathi", "Elena", "Shradha")

  def filteringWithoutCurrying(names: Seq[String], nameToMatch: String) : Seq[String] = names.filter(name => name != nameToMatch)
  
  def printInfo(): Unit = {
    println("\n======")
    println("Reviewing currying - You can see these in the ScalaCurrying.scala file")
    println("======")

    // Notice that in both the examples below
    // we effectively hard-code the name we wish to filter out
    println(s"Name out the Colin's without currying: ${filteringWithoutCurrying(names, "Colin" )}")
    println(s"Name out the Elena's without currying: ${filteringWithoutCurrying(names, "Elena" )}")
  }

}
