# ShoppingCartCheckout
Requirement 1

Step 1: Shopping cart
? You are building a checkout system for a shop which only sells apples and
oranges.
? Apples cost 60p and oranges cost 25p.
? Build a checkout system which takes a list of items scanned at the till and outputs
the total cost
? For example: [ Apple, Apple, Orange, Apple ] => £2.05
? Make reasonable assumptions about the inputs to your solution; for example, many
candidates take a list of strings as input

 
Solution-:

1) Create Test Cases 'TestTotalCost' File based on requirement 1.

   Test cases to -:

                  a) check price of an Item
                  b) check Count of an Item
                  c) check total Cost of the input items

2) Created two scala object files 'Main' and 'TotalCost'

3) Initialised  sample input in Main object file

4) In 'TotalCost' Object file created   -:
  
      a) map function to assign item price to item
      b) Function to get price for an item
      d) Function to calculate total cost by summing up the cost of each distinct item from the list.

-------------------------------------------------------------------------------------------------------------

Requirement 2

Step 2: Simple offers
? The shop decides to introduce two new offers
? buy one, get one free on Apples
? 3 for the price of 2 on Oranges
? Update your checkout functions accordingly

Solution Steps -:           

1) Create Test Cases in 'TestTotalCostWithOffers' File based on requirement 1.

   Teste cases to -:

                  a) Check Buy One Get one offer for apple
                  b) check three for the price of two offer for orange
                  c) check total Cost of the input items with offers
                 

2) Updated 'Main' object file to display Total Cost with offers and added 'TotalCostWithOffers' object file


3) In 'TotalCostWithOffers' Object, 
    
   created   -:
  
      a) Generic higher order function to compute Buy One Get One and Three for two offer calculations
      b) Pattern Matching to calculate specific offers based on input item.
      c) Function to calculate total cost with offers :- 
          logic :- 
             Substarcting Total savings made by offer (which is calculated by summing up saving of each distict items in list) from Total cost without offer.
         
        ie-:  Total cost with offer = Total cost without offer - Savings by offer.

         
