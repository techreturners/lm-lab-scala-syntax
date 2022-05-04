package com.techreturners

import com.techreturners.classes.ScalaClassesObjects
import com.techreturners.collections.ScalaCollections
import com.techreturners.currying.ScalaCurrying
import com.techreturners.functionsandmethods.ScalaFunctionsAndMethods
import com.techreturners.patternmatching.ScalaPatternMatching
import com.techreturners.types.ScalaTypes

object AppDemo {

  // In Scala much like Java, C#, C++ we can define a
  // main method which is where the application will
  // begin running:
  // https://docs.scala-lang.org/tour/basics.html
  def main(args: Array[String]): Unit = {
    println("Sample Scala Demo App Reviewing the Scala Syntax")

    ScalaTypes.printInfo()
    ScalaFunctionsAndMethods.printInfo()
    ScalaClassesObjects.printInfo()
    ScalaCollections.printInfo()
    ScalaPatternMatching.printInfo()
    ScalaCurrying.printInfo()
  }


}
