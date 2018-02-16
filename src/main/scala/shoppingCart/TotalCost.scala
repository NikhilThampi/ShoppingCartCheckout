package shoppingCart

import scala.math.BigDecimal.RoundingMode

object TotalCost {

  // Assigning price to items

  val priceMap = Map("apple" -> 0.60, "orange" -> 0.25)

  //function to get price per item

  def getPrice(item: String): Double = {
    priceMap.getOrElse(item.toLowerCase, 0.0).toDouble
  }


  //Function to find the total cost

  def getTotalCost(items: List[String]): Double = {


    val totalCost = items.map(item => getPrice(item)).sum

    //returns Total cost rounded value

    BigDecimal(totalCost).setScale(2, RoundingMode.HALF_EVEN).toDouble

  }

}
