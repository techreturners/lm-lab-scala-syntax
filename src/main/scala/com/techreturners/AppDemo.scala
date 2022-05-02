package com.techreturners

import com.techreturners.types.ScalaTypes

object AppDemo {

  // In Scala much like Java, C#, C++ we can define a
  // main method which is where the application will
  // begin running:
  // https://docs.scala-lang.org/tour/basics.html
  def main(args: Array[String]): Unit = {
    println("Sample Scala Demo App Reviewing the Scala Syntax\n")

    ScalaTypes.printTypes()
  }


}
