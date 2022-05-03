package com.techreturners.collections

// Scala has various types of collection
// Here's a bit more detail:
// https://www.baeldung.com/scala/collections
object ScalaCollections {

  // For example here is a Scala list
  val studentNames: List[String] = List("Rohan", "Andreas", "Rob", "John")

  // Scala also has a concept of Set's where duplicates are prevented
  val studentNamesSet : Set[String] = Set("Rohan", "Andreas", "Rob", "John", "John")

  def matchesAndreas(name: String) : Boolean = name == "Andreas"

  def printInfo(): Unit = {
    println("\n======")
    println("Reviewing collections - You can see these in the ScalaCollections.scala file")
    println("======")

    println(s"We can print the head of a list: ${studentNames.head}")
    println(s"We can also print the tail of a list: ${studentNames.tail}")

    // You can use the :: syntax to extract the head and tail of a list as well as the approaches above
    val headOfList :: tailOfList = studentNames
    println(s"Or we can even use special syntax to get the head ($headOfList) and tail ($tailOfList)")

    // Moving on to set's we can see that duplicates are not present
    println(s"Here's the SET of student names, notice the duplicate John is not present: $studentNamesSet")

    // Much like other functional languages we can pass functions to functions
    // This is particularly useful when working with collections. For example we might
    // pass a function to filter in order to filter out.
    // Here you see we pass the 'matchesAndreas' method to the 'filter' method
    val filteredNames = studentNames.filter(matchesAndreas)
    println(s"Filtered names after passing a function to filter: $filteredNames")
  }

}
