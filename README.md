MAT Software Team Coding Challenge
Overview
This project is a solution to the MAT Software Team Coding Challenge, where the objective is to write an application that finds the 3 longest unique palindromes in a supplied string. The application reports the palindrome, its starting index, and its length, in descending order of length.

Features
Find Palindromes: Identifies the longest unique palindromes in a string.

Detailed Output: For each palindrome, the program outputs the text, the starting index, and the length.

Efficient Solution: Uses an optimized algorithm to find palindromes in a given string.

Example
Input String:
nginx
Copy
Edit
sqrrqabccbatudefggfedvwhijkllkjihxymnnmzpop
Example Output:
yaml
Copy
Edit
Text: hijkllkjih, Index: 23, Length: 10
Text: defggfed, Index: 13, Length: 8
Text: abccba, Index: 5, Length: 6
Requirements
Java (version 8 or later)

Maven (for project management and dependencies)

Installation
Clone the repository:

bash
Copy
Edit
git clone https://github.com/DishantJadhav/MAT-Software-Team-Coding-Challenge.git
Navigate to the project directory:

bash
Copy
Edit
cd MAT-Software-Team-Coding-Challenge
Build the project (if using Maven):

bash
Copy
Edit
mvn clean install
How to Run
Compile and run the Main.java class to see the output.

bash
Copy
Edit
java org.example.Main
Tests
You can find the tests for the palindrome finding logic in the test folder. Run them using your favorite testing framework, such as JUnit.
