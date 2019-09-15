## Make Change Project
This is my first end of week project with Skill Distillery. The program will take a
price to be entered by the user. Then the user will be prompted to enter the
amount to be tendered.

The program will calculate total change to be returned and specific bills and
coins to return to the 'customer'.

example:
**********************************************************

                         Hello!           

              Welcome to "Java Jerry's".

We don't just sell coffee ;) but lots of ones and zeros!

**********************************************************

Enter the purchase price: $ 11.23
Enter your payment amount: $ 100

Thank you for your payment!
**********************************************************

Total Change: $ 88.77

Give back: 1 <--> fifty dollar bill(s)

Give back: 1 <--> twenty dollar bill(s)

Give back: 1 <--> ten dollar bill(s)

Give back: 1 <--> five dollar bill(s)

Give back: 3 <--> one dollar bill(s)

Give back: 3 <--> quarter(s)

Give back: 0 <--> dime(s)

Give back: 0 <--> nickel(s)

Give back: 2 <--> penny(s)

**********************************************************

### Overview

In the cash register we will calculate the amount of change returned to a
customer based on the purchase price and the amount tendered. We will also
notify the attendant how many of each piece of currency
($20 ,$10 ,$5 ,$1, .25c, .10c, .05c, .01c) is needed to make the
change for the customer. Change should be provided using the largest
bill and coin denominations as possible. Denominations that are not
used should not be displayed.

Hint: Mod operator

User Story #1
The user is prompted asking for the price of the item.

User Story #2
The user is then prompted asking how much money was tendered by the customer.

User Story #3
Display an appropriate message if the customer provided too little money or
the exact amount.

User Story #4
If the amount tendered is more than the cost of the item, display the number
of bills and coins that should be given to the customer.

Grading
This is a graded project. You are expected to have your project completed by
the start of class on Monday morning.

You will be given either a pass or fail based on whether your code works given
all of the following test conditions:

Amount: .67, Tendered: .50, Result: Error message
Amount: .67, Tendered: 1.00, Result: 1 quarter, 1 nickel, 3 pennies.
Amount: .59, Tendered: 1.00, Result: 1 quarter, 1 dime, 1 nickel, 1 penny.
Amount: 3.96, Tendered: 20.00, Result: 1 ten dollar bill, 1 five dollar bill,
1 one dollar bill, 4 pennies.
Amount: any amount less than 20.00, Tendered: anything greater than amount:
correct denominations for correct change.

### How to Run

Assuming you have Java already loaded on your machine:

Terminal:
Navigate to the file inside terminal, javac MakeChange.java, then
java MakeChange. The program will run and prompt the user (you) for input and
return values, etc.

Fancy editor (eclipse):

File, open, navigate to the file, and open. Run as java file and get results, etc.

### Technologies/Topics (I) Used

-MacBook Pro
-java version "1.8.0_221"
-terminal
-iTerm2
-Eclipse
-Atom

-Java Fundamentals


### Lessons learned

Lots of lessons learned with plenty of take aways. However, I'll note that my
biggest challenge was working with 'pennies' in this particular case. Originally,
the program had some other features to it. I took them out as they were above
requirements and kept a copy to build on top of. That being said, with
the number of pennies to be returned was functioning in a way that would return
one less penny than amount total. Somewhere in the calculations, it was dropping
a penny (double casting into int). I seemed to have gotten it working properly
but I will need to revisit my prior code and this code to compare so I fully
understand what's going on here. A penny may not be a lot but it adds up and
an improper result is not worthy! :).
