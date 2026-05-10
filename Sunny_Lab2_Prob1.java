/*
Sara Sunny
Lab 02 - Problem 1
 */


/**
 *
 * @author slbru
 */
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Sunny_Lab2_Prob1 {

    public static void main(String[] args) {
        Random random = new Random();
        SelectionSort sort = new SelectionSort();
        Scanner input = new Scanner (System.in);
        
        int array [] = new int [20];
        ArrayList<Integer> aList = new ArrayList<Integer>();
        
        for (int count=0; count<array.length; count++) {
            array[count] = 1+random.nextInt(100);
        }
        sort.setArray(array);
        
        for (int count = 0; count<20; count++) {
            aList.add (1+random.nextInt(100));
        }
        sort.setArrayList(aList);
        
        int response = 0;
        
        System.out.println("Input the value next to your selection: ");
        System.out.println("Array - Ascending Sort: \t\t 1");
        System.out.println("Array - Descending Sort: \t\t 2");
        System.out.println("ArrayList - Ascending Sort: \t 3");
        System.out.println("ArrayList - Descending Sort: \t 4");
        System.out.println("Exit Application: \t\t 5");
        do {
        response = input.nextInt();
        
        switch (response) {
            case 1:
                sort.ascendingArray(array);
                break;
            case 2:
                sort.descendingArray(array);
                break;
            case 3:
                sort.ascendingArrayList(aList);
                break;
            case 4:
                sort.descendingArrayList(aList);
                break;
            case 5:
                System.out.println("GoodBye!");
        }
        System.out.println("Next choice: ");
        //response = input.nextInt();
        } while (response != 5); 
    }
    
}
