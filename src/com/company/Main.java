package com.company;

import com.company.libraryFunctions.getInputData;
import com.company.animals.cat;
import java.util.ArrayList;


public class Main {

    private static ArrayList<cat> catList = new ArrayList<>();

    public static void main(String[] args) {
        //getInputData.menu();
        //int animalID, String name, String species, int age
        cat myCat = new cat(1, "Mikey", "cat", 14);
        cat myOtherCat = new cat(2, "fudge", "cat", 6);


    }

}
