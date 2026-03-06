import java.util.Scanner;

public class SortArray {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");

        Integer[] arr = new Integer[input.length];

        for(int i = 0; i < input.length; i++){
            arr[i] = Integer.valueOf(input[i]);
        }
        
        sortArray(arr);

        System.out.println("Sorted array: ");
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Sum: " + sumArray(arr));
        System.out.println("Average: " + averageArray(arr));
        

    }
    
    public static void sortArray(Integer[] arr){
        int s = arr.length;
        for(int i = 0; i < s; i++){
            for(int j = 0; j < s - i - 1; j++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static int sumArray(Integer[] arr){
        int sum = 0;
        for(int i : arr){
            sum += i;
        }
        return sum;
    }

    public static double averageArray(Integer[] arr){
        return (double)sumArray(arr)/(arr.length);
    }

}
