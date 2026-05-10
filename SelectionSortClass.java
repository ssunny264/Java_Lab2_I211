/*
Sara Sunny
Selection Sort Class
Lab 2 Problem 1
 */
package sunny_lab2_prob1;

/**
 *
 * @author slbru
 */
import java.util.ArrayList;
import java.util.Arrays;

public class SelectionSort {
    private ArrayList<Integer> aList = new ArrayList<Integer>();
    private int array [] = new int [20];
    
    public void setArray(int [] array) {
        this.array = array;
    }
    public void setArrayList(ArrayList<Integer> aList){
        this.aList = aList;
    }
    
    public void ascendingArray(int [] array){
        for (int count = 0; count < array.length - 1; count++){
            int smallest = count; 
            for (int i = count+1; i<array.length; i++) {
                if (array[i] < array[smallest]){ 
                    smallest = i; 
                }
            }
            int sNum = array[smallest]; 
            array[smallest] = array[count];
            array[count] = sNum;
        }
        System.out.println("\nAscending sort");
        System.out.println(Arrays.toString(array));
    }
    public void descendingArray(int [] array) {
        for (int count = 0; count < array.length - 1; count++){
            int largest = count; 
            for (int i = count+1; i<array.length; i++) {
                if (array[i] > array[largest]){ 
                    largest = i; 
                }
            }
            int sNum = array[largest]; 
            array[largest] = array[count];
            array[count] = sNum;
        }
        System.out.println("\nDescending sort");
        System.out.println(Arrays.toString(array));
    }
    public void descendingArrayList(ArrayList<Integer>aList){
        for (int count = 0; count < aList.size()-1; count++){ 
            int largest = count; //assigns largest value to first element in arraylist
            for (int i = count+1; i<aList.size(); i++) { 
                if (aList.get(i) > aList.get(largest)){ //if i is larger than largest element
                    largest = i; //largest is assigned value of i
                }
            }
            int sNum = aList.get(count); 
            aList.set(count, aList.get(largest));
            aList.set(largest, sNum);
        }
        
        System.out.println("\nDescending ArrayList sort");
        for (int count = 0; count < aList.size(); count++){ //display sorted array
            System.out.printf(" %d", aList.get(count));
        }
        System.out.println();
    }
    public void ascendingArrayList(ArrayList<Integer>aList){
        for (int count = 0; count < aList.size()-1; count++){ 
            int smallest = count; //assigns largest value to first element in arraylist
            for (int i = count+1; i<aList.size(); i++) { 
                if (aList.get(i) < aList.get(smallest)){ //if i is larger than largest element
                    smallest = i; //largest is assigned value of i
                }
            }
            int sNum = aList.get(count); 
            aList.set(count, aList.get(smallest));
            aList.set(smallest, sNum);
        }
        
        System.out.println("\nAscending ArrayList sort");
        for (int count = 0; count < aList.size(); count++){ //display sorted array
            System.out.printf(" %d", aList.get(count));
        }
        System.out.println();
    }
}
