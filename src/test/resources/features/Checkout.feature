@Checkout
  Feature: Checkout Dashboard
   Background:
     Given user is logged in the shopping area
   Scenario Outline: Order checkout
     When user clicks on item with name "<Item>"
     And user clicks on the add to cart button
     And user clicks on the shopping cart button
     And user clicks on checkout button
     And user enters order information as "<FirstName>","<LastName>",and"<ZipCode>"
     And user clicks on continue button
     Then user sees the item name matches that of the "<Item>"
     Examples:
       | Item                     | FirstName | LastName | ZipCode |
       | Sauce Labs Backpack      | Michael   | Smith    | 12345   |
       | Sauce Labs Bike Light    | Liza      | Bernel   | 07504   |
       | Sauce Labs Fleece Jacket | Alex      | Averin   | 08098   |