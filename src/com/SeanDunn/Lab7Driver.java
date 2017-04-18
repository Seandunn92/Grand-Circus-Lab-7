package com.SeanDunn;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;

//Sean Dunn Lab 7 for Grand Circus,  April 2017

public class Lab7Driver {

    public static void main(String[] args) throws java.io.FileNotFoundException, java.io.IOException   {

        Scanner scan = new Scanner(System.in);
        int userInt = -1;
        char userChar='Y';


        //Define the 4 arrays that reference different aspects of the student

        String [] firstNames = {"Joe", "Susan", "Mike", "Oliver", "Felix"};
        String [] lastNames = {"Plumber", "Strauson", "Fring", "North", "Feline"};
        String [] hometown = {"Detroit, MI" , "Atlanta, GA", "Tampa, FL", "New York City, NY", "Chicago, IL"};
        String [] favFood = {"Sloppy Joes", "Pizza", "Spaghetti", "Sushi", "Hamburgers"};



            // do this loop at least once, and continue until the user Wants to quit
            do {
                //prompt for the student
            System.out.println("Please enter the student number you want to check on(1-" +firstNames.length +")");
            try {
                //get the student reference number
                userInt = scan.nextInt();
                scan.nextLine();

                //Prompt for hometown or food
                System.out.println("What would you like to know about " +firstNames[userInt-1] +" " +lastNames[userInt-1] +
                "(h:hometown, f: favorite food:)");



                //get the character, while it's not h or f continue
                userChar = scan.nextLine().toLowerCase().charAt(0);
                while( userChar!='h' && userChar!= 'f' ){
                    System.out.println("Data does not exist, Please try again: (h: hometown, f: favorite food");
                    userChar = scan.nextLine().toLowerCase().charAt(0);
                }

                //print hometown or favorite food depending on userInput
                if(userChar == 'h'){
                    System.out.println(firstNames[userInt -1] + "is from " + hometown[userInt-1]);
                }
                else {
                    System.out.println(firstNames[userInt -1] + "'s favorite food is  " + favFood[userInt-1]);
                }




            }
            // The user didn't enter the expected Input, probably for Integer
            catch (InputMismatchException e){
                System.out.println("Invalid Input");
            }

            // Lab prompted for this to be a type of exception, not sure if it is used
            catch (IllegalArgumentException e){
                System.out.println("Illegal argument exception");
                }
                //user Enter a number that wasn't 1-5 as prompted
                catch(IndexOutOfBoundsException e){
                System.out.println("Student Index was out of bounds");
                }



            //Drive the progam until the user doesn't want to keep goin
            System.out.println("Continue? (Y/N)");
            userChar = scan.nextLine().charAt(0);
        }while(userChar == 'Y' || userChar =='y');

    }
}
