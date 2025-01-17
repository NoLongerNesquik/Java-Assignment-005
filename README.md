# Java-Assignment-005 - Switch it Up

## Part 1: - Tracing the Code
As a new Java developer, you will be required to familiarize yourself with existing code before beginning to develop. That's what this section is about, developing your code tracing skills and familiarizing yourself with parts you may be able to use.
* Scan through all the existing code and note what you have to work with.
    * Method names
    * Variables
* Using Java terminology, break down every piece of the method **convertF2K**.
    * What is the access modifier?
      * The access modifier is Public.
    * Is it a class or object method, how do you know?
      * This is an object method because it is not using the class keyword and is not a constructor since it does not use the same name as the class name.
    * What is its return type?
      * The Return type of this method is a double.
    * What parameters does it require, and what are the parameter(s) datatype(s)?
      * This method has the parameter of a single double.
    * Describe for me how the body of the method executes (i.e. its flow of execution).
      * The only thing that this method is doing is returning the double of what the input would be if it was converted from Fahrenheit to Celsius.
* Using Java terminology, break down method **getUnitChoice**.
    * What is the access modifier?
      * The access modifier is Public.
    * Is it a class or object method, how do you know?
      * This is an object method because it is not using the class keyword and is not a constructor since it does not use the same name as the class name.
    * What is its return type?
      * The return type of this method is a String.
    * What parameters does it require, and what are the parameter(s) datatype(s)?
      * This method has no parameters.
    * Describe for me how the body of the method executes (i.e. its flow of execution).
      * This method prompts the user for an input that will change what method will be used to change the temperature.
    * How do the format specifiers differ than what you've seen before and what do they do?
      * The only new format specifier that I can see is %xs where x is an integer. From what I can tell, this will put x amount of spaces before or after a String where -x will put x spaces after the String and x will put x spaces before the String.

## Part 2: - Implement Missing Method: convertK2F
This Part is aimed at teaching you to use methods and code you have to add new functionality to existing code. In this case you will add the missing conversion method, but you don't need to know math :-)
* Hint: You can use existing methods!

## Part 3: - Switch it Up
Part 3 is all about learning how to use the **switch** conditional statement, or the **enhanced switch** statement. You've learned about **if/else** now you will learn about **switch**.
* Using the provided method and class variables, write a program in the **while** loop of the **main** method that:
    * Requests a temperature Unit to convert from
    * Requests a temperature Unit to convert to
    * Quits the program if Q is entered for either choice
    * Requests the double temperature value to convert
    * Uses a **switch** or **enhanced switch** conditional to call the proper conversion method.
    * Prints out the result as indicated below:

          Result 40.000000°C is 104.000000°F

## Part 4: Pull Request
Part 4, as usual, is repetition of duties you will be doing in industry.
* Make sure to use the Git tab at the bottom of IntelliJ to create a Fall_2022 feature branch
* Commit and Push your running code back to your GitHub account
* Issue a Pull request back to my Java-Assignment-005 repo
* Cut and Paste the Pull request URL into your Canvas assignment to turn it in.