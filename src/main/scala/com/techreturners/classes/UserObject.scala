package com.techreturners.classes

// Objects are singleton
// Once defined they can be imported anywhere
// Objects are introduced here: https://docs.scala-lang.org/tour/basics.html
// and further explained here: https://docs.scala-lang.org/tour/singleton-objects.html
object UserObject {

  private var counter: Int = 0

  def incrementAndGetCount() : Int = {
    counter+=1
    counter
  }

}
