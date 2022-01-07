package com.company.libraryFunctions;

import java.util.Scanner;

    public class getInputData {

        public static void menu(){
            int animalID = getNumber("Please enter Animal ID");
            String animalName = getString("Please enter name of animal");
            String species = getString("Please enter species");
            int age = getNumber("Please enter animal age");
        }

        public static int getNumber(String prompt){
            try {
                System.out.println(prompt);
                Scanner input = new Scanner(System.in);
                return input.nextInt();
            }
            catch (Exception e){
                System.out.println("An error occurred: " + e);
            }
            return -1;
        }

        public static String getString(String prompt){
            try{
                System.out.println(prompt);
                Scanner input = new Scanner(System.in);
                return input.nextLine();
            }
            catch(Exception e){
                System.out.println("An error occurred: " + e);
            }
            return"";
        }




}
