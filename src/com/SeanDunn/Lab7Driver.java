package com.SeanDunn;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;

public class Lab7Driver {

    public static void main(String[] args) throws java.io.FileNotFoundException, java.io.IOException   {

        Scanner scan = new Scanner(System.in);
        int userInput = -1;
        char userChar='Y';


        //Define the Students Data Structure

        String [] firstNames = {"Joe", "Susan", "Mike", "Oliver", "Felix"};
        String [] lastNames = {"Plumber", "Strauson", "Fring", "North", "Feline"};
        String [] hometown = {"Detroit, MI" , "Atlanta, GA", "Tampa, FL", "New York City, NY", "Chicago, IL"};
        String [] favFood = {"Sloppy Joes", "Pizza", "Spaghetti", "Sushi", "Hamburgers"};


            do {
            System.out.println("Please enter the student number you want to check on(1-" +firstNames.length +")");
            try {
                userInput = scan.nextInt();
                scan.nextLine();
                System.out.println("What would you like to know about " +firstNames[userInput-1] +" " +lastNames[userInput-1] +
                "(h:hometown, f: favorite food:)");


                userChar = scan.nextLine().toLowerCase().charAt(0);
                while( userChar!='h' && userChar!= 'f' ){
                    System.out.println("Data does not exist, Please try again: (h: hometown, f: favorite food");
                    userChar = scan.nextLine().toLowerCase().charAt(0);
                }

                if(userChar == 'h'){
                    System.out.println(firstNames[userInput -1] + "is from " + hometown[userInput-1]);
                }
                else {
                    System.out.println(firstNames[userInput -1] + "'s favorite food is  " + favFood[userInput-1]);
                }




            }
            catch (InputMismatchException e){
                System.out.println("Invalid Input");
            }
            catch (IllegalArgumentException e){
                System.out.println("Invalid Input");
                }
                catch(IndexOutOfBoundsException e){
                System.out.println("Student Index was out of bounds");
                }




            System.out.println("Continue? (Y/N)");
            userChar = scan.nextLine().charAt(0);
        }while(userChar == 'Y' || userChar =='y');

	// write your code here
    }
}
