package com.techreturners

import com.techreturners.types.ScalaTypes

object AppDemo {

  def main(args: Array[String]): Unit = {
    println("Sample Scala Demo App Reviewing the Scala Syntax\n")
    println("======")
    println("Reviewing types - You can see these in the ScalaTypes.scala file")
    println("======")
    println(s"Here's an integer: ${ScalaTypes.anInteger}")
    println(s"Here's a boolean: ${ScalaTypes.aBoolean}")
    println(s"Next you'll see us print a collection of variables with all different types")
    ScalaTypes.list.foreach(element => println(s"Value '${element}' has type '${element.getClass}'"))
  }


}
