package shoppingCart

import scala.math.BigDecimal.RoundingMode

object TotalCostWithOffers {

  // Generic function

  def genericFn[T <: Any](f: (T, T) => T, op1: T, op2: T): T = {
    f(op1, op2)
  }

  //Function to find Total Cost with Offer

  def getTotalCostWithOffer(items: List[String]): Double = {
    // fetching distinct items
    val distinctItems = items.distinct


    //Total savings with offer = sum of offer calculation of each distinct item

    val totalSavingsWithOffer = items.distinct.map(item => CalculateOffer(item, TotalCost.getNoOfItems(items, item), TotalCost.getPrice(item))).sum

    // total cost with offer = Cost calculated without offer for all items - total amount saved by offer for offer items

    val totalCostWithOffer = TotalCost.getTotalCost(items) - totalSavingsWithOffer

    // returns total cost with offer rounded value

    BigDecimal(totalCostWithOffer).setScale(2, RoundingMode.HALF_EVEN).toDouble
  }

  //Calculates the price saved by offer for apple and orange

  def CalculateOffer(item: String, count: Int, priceOfOne: Double): Double = {

    item toLowerCase() match {

      // Buy one get One
      case "apple" => genericFn[Double]((x, y) => x * y, (count / 2), priceOfOne)

      //Three for the price of two
      case "orange" => genericFn[Double]((x, y) => x * y, (count / 3), priceOfOne)

      case _ => 0.0

    }
  }


}