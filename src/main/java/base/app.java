

// Create a program that prompts for an input string and displays output that shows the input string and the number of characters the string contains.

//What is the input string? Homer
//Homer has 5 characters

//Be sure the output contains the original string.
//Use a single output statement to construct the output.
//Use a built-in function of the programming language to determine the length of the string.

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Korinne Ramcharitar
 */
package base;

package b
import java.util.Scanner;

public class App {
public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.println("What is the input");
    String name = input.nextLine();
    System.out.println(name + " has " + name.length() + " characters.");
}


}
