package shoppingCart.test

import shoppingCart.TotalCost
import org.scalatest._

class TestTotalCost extends FlatSpec {

  //Test function that gets price of an item

  "Price of an Apple" should "be 0.6" in {
    assert(TotalCost.getPrice("Apple") === 0.6)
  }
  "Price of an Orange" should "be 0.25" in {
    assert(TotalCost.getPrice("Orange") === 0.25)
  }
  "Price of a not priced item" should "be 0" in {
    assert(TotalCost.getPrice("Mango") === 0)
  }
  "Price of Apple" should "be 0.6 irrespective of Case" in {
    assert(TotalCost.getPrice("aPPle") === 0.6)
  }

  // Checks Total Cost when the input is empty

  "Total cost when input empty" should " be 0.00" in {

    val items = List()
    assert(TotalCost.getTotalCost(items) === 0.00)

  }

  //Test to calculate total cost for all valid items

  "Total cost of all valid items" should "be 1.95" in {

    val items = List("Apple", "Apple", "Orange", "Orange", "Orange")
    assert(TotalCost.getTotalCost(items) === 1.95)

  }

  //Test to calculate total cost for  valid and some invalid items

  "Total cost of some valid  and invalid items" should "be 1.7" in {

    val items = List("Apple", "Apple", "Mango", "Grape", "Orange", "Orange")
    assert(TotalCost.getTotalCost(items) === 1.7)

  }

}
