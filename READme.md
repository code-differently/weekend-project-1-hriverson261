# Weekend Project 1 #

## How it works 
- User is asked to enter their first name, coupon code, and their budget 
- After receiving user input receipt code is generated with first three letters of user name as well as randomly generated numbers between 100 and 999. 
- Receipt code, item prices, subtotal, tax, final total, and message of whether the customer can afford the order with the given budget is printed

## Sample Output
----WELCOME TO THE CODE'S MYSTERY SHACK----

Receipt code: NOE-654

Item 1: $22.0

Item 2: $35.0

Item 3: $55.0

Subtotal: $112.0

Tax applied to total: $8.0

----DISCOUNT CODE----

Discount: 15% Off 

Final Total: $120.0

You do not have enough. You need $116 to complete you order

## Java Concepts Used 
- The Random class was imported and used to generate visitID, itemPrice, and tax percentage
- The Math class was used to round (Math.round) the item prices, tax amount, and totals. The absolute value method(Math.abs) was also used to find the absolute value of the difference between budget and total amount
- Substring was used from the String class to generate the receipt code
- If/else statements were used to validate and determine whether a 15% discount would be applied to the order given the discount code. If/else statements were also used to determine whether the customer had enough money for the order given the budget
