import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortArray {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();

        System.out.println("Enter a list of number: ");
        for(String s : scanner.nextLine().split(" ")){
            arr.add(Integer.valueOf(s));
        }
        
        sortArray(arr);

        System.out.println("Sorted array: ");
        System.out.println(arr);

        System.out.println("Sum: " + sumArray(arr));
        System.out.println("Average: " + averageArray(arr));
        

    }
    
    public static void sortArray(ArrayList<Integer> arr){
        Collections.sort(arr);
    }

    public static int sumArray(ArrayList<Integer> arr){
        int sum = 0;
        for(int i : arr){
            sum += i;
        }
        return sum;
    }

    public static double averageArray(ArrayList<Integer> arr){
        return (double)sumArray(arr)/(arr.size());
    }

}
