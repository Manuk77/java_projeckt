package project;


import java.util.*;

public class Main {
    public static void main(String[] args) {


        Scanner scInt = new Scanner(System.in);
        Scanner scString = new Scanner(System.in);
        University polytechnic = new University("POLYTECHNIC");
        int choice;
        do{
            Menu();
            System.out.print("ENTER YOUR CHOICE ");
            choice = scInt.nextInt();
            System.out.println("\n");
            switch (choice){
                case 1:
                    polytechnic.insert(scInt,scString);
                    break;

                case 2:
                    polytechnic.display();
                    break;

                case 3:
                      System.out.print("ENTER THE NAME OF THE STUDENT WHICH YOU SEARCH ");
                      polytechnic.search(scString);
                      break;

                case 4:
                      polytechnic.delete(scString);
                    break;
                case 5:
                    polytechnic.update(scString, scInt);
                    break;
                default:
                    System.out.println("CURRENT CASE DOES NOT EXIST");
            }

        }while(choice != 6);



    }

    /**
     * this method displays the menu
     */
    public static void Menu(){

        System.out.println("1.INSERT");
        System.out.println("2.DISPLAY");
        System.out.println("3.SEARCH");
        System.out.println("4.DELETE");
        System.out.println("5.UPDATE");
        System.out.println("6.EXIT");

    }
}
