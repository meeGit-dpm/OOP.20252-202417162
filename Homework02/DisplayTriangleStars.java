import java.util.Scanner;

public class DisplayTriangleStars{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int n = Integer.valueOf(scanner.nextLine());

        for(int i = 1; i <= n; i++){
            printSpace(n - i);
            printStar(2 * i - 1);
        }
    }

    public static void printStar(int size){
        for(int i = 0; i < size; i++){
            System.out.print("*");
        }

        System.out.println("");
        
    }

    public static void printSpace(int size){
        for(int i = 0; i < size; i++){
            System.out.print(" ");
        }
    }
}