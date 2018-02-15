package shoppingCart.test
import shoppingCart.TotalCostWithOffers
import org.scalatest.FlatSpec


class TestTotalCostWithOffers extends FlatSpec {


  // Checks the total cost with offers when the input is empty

  " When input is empty price" should " be 0" in {
    val items = List()
    assert(TotalCostWithOffers.getTotalCostWithOffer(items) === 0)
  }

  //Testing Buy One get One for Apple

  "Price of 2 Apple" should "be the price of one = 0.6 " in {
    val items = List("Apple", "Apple")
    assert(TotalCostWithOffers.getTotalCostWithOffer(items) === 0.6)
  }


  //Testing three for two

  "Price of 3 orange" should "be the price of two = 0.5" in {
    val items = List("Orange", "Orange", "Orange")
    assert(TotalCostWithOffers.getTotalCostWithOffer(items) === 0.5)
  }


  //Test to calculate total cost for all valid items

  "Price of 2 Apples and 3 oranges" should "be 1.1" in {
    val items = List("Apple", "Apple", "Orange", "Orange", "Orange")
    assert(TotalCostWithOffers.getTotalCostWithOffer(items) === 1.1)
  }


  //Test to calculate total cost for  valid and some invalid items

  "Price of 2 Apples and 2 oranges and 1 Grape(invalid item)" should "be 1.1" in {
    val items = List("Apple", "Apple", "Grape", "Orange", "Orange")
    assert(TotalCostWithOffers.getTotalCostWithOffer(items) === 1.1)
  }


}