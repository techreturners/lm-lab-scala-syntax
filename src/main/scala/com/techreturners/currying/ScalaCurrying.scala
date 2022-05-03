package com.techreturners.currying

// A bit of an advanced subject - Currying.
// https://docs.scala-lang.org/tour/multiple-parameter-lists.html
// https://www.youtube.com/watch?v=txNAZXPSbiE
object ScalaCurrying {

  // Lets assume our intended purpose of the following code is to calculate the final
  // price of a product. In order to calculate the price of that product
  // it requires knowledge of a fixed service charge, VAT rate and the product price
  // It would make sense to create a method something like this:
  // NON CURRIED EXAMPLE
  def calculatePriceWithoutCurrying(vatRate: Double, serviceCharge: Double, productPrice: Double): Double =
    productPrice + productPrice * vatRate + serviceCharge

  // CURRIED EXAMPLE
  def calculatePriceWithCurrying(vatRate: Double)(serviceCharge: Double)(productPrice: Double): Double =
    productPrice + productPrice * vatRate + serviceCharge

  // Here we use the underscore to indicate we'll pass on the remaining parameters
  def calculatePriceWithVatApplied : Double => Double => Double = calculatePriceWithCurrying(0.2) _
  def calculatePriceWithServiceChargeAndVatApplied : Double => Double = calculatePriceWithVatApplied(10)


  def printInfo(): Unit = {
    println("\n======")
    println("Reviewing currying - You can see these in the ScalaCurrying.scala file")
    println("======")

    println(s"Here's the price without currying: ${calculatePriceWithoutCurrying(0.2, 10, 10)}")
    println(s"Here's another price without currying: ${calculatePriceWithoutCurrying(0.2, 10, 20)}")

    // However notice that we keep repeating the service charge and the VAT rate
    // Although the values are passed in we're still repeating them. Using currying
    // we could create a single purpose function that could calculate the product price without
    // having to remember the VAT rate or service charge. Also it means we'd only have one place to
    // change the rates if and when they change.
    println(s"Here's the price WITH currying: ${calculatePriceWithServiceChargeAndVatApplied(10)}")
    println(s"Here's another price WITH currying: ${calculatePriceWithServiceChargeAndVatApplied(20)}")
    println(s"And we can still use the original version if we need precise access: ${calculatePriceWithCurrying(0.2)(10)(10)}")
    println(s"And we could even try it with a different service charge: ${calculatePriceWithVatApplied(20)(10)}")


  }

}
