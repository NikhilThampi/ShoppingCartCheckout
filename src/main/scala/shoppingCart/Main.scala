package shoppingCart

object Main {

  def main(args: Array[String]): Unit = {
    // Input Items list

    val items = List("Apple", "Apple", "Orange", "Apple", "Orange", "Orange", "Orange")

    // Displaying input items

    println("Input Items: [" + items.mkString(",") + "]	")

    //Step 1 - Displaying Total cost

    println("Total Cost : £" + TotalCost.getTotalCost(items))

  }
}
