package com.techreturners.patternmatching

// Scala pattern matching is much like switch statements
// in order languages. However we get extra abilities such
// as the ability to extract values from the match
// https://docs.scala-lang.org/tour/pattern-matching.html
object ScalaPatternMatching {

  // Here's a familiar looking pattern matching which looks very similar
  // to a switch statement. Also note the 'case _' is essentially
  // the 'default' case (nothing else matches and will always come last
  def patternMatching(position: Int) : String = {
    position match {
      case 1 => "You came first"
      case 2 => "You came second"
      case 3 => "You came third"
      case _ => "You didn't hit the podium this time"
    }
  }

  // Here's a more interesting pattern match. Using the concept of
  // object inheritance, both Birds and Fish inherit from the Animal type
  // We can match on the type of Animal that has been passed in to the method
  // and then also extract and use values from that match. Such as extracting the name
  def patternMatchingWithCaseClass(animal: Animal) : String = {
    animal match {
      case Bird(name) => s"That looks to be a Bird with the name of $name"
      case Fish(name) => s"That looks to be a Fish with the name of $name"
      case _ => "Absolutely no idea what type of animal that is"
    }
  }

  def printInfo(): Unit = {
    println("\n======")
    println("Reviewing scala pattern matching - You can see these in the ScalaPatternMatching.scala file")
    println("======")

    // Pattern matching is much like a switch statement within other languages
    println(s"The outcome of the race for coming position 2 is '${patternMatching(2)}'")
    println(s"The outcome of the race for coming position 9 is '${patternMatching(9)}'")

    // Pattern matching with case classes
    val aBird = Bird("Revali")
    val patternMatchedAnimal = patternMatchingWithCaseClass(aBird)
    println(s"We've matched the animal using pattern matching and produced this statement: '$patternMatchedAnimal'")
  }

}
