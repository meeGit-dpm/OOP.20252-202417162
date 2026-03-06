import java.util.Scanner;
import java.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

public class DaysOfMonths {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> validMonth = new ArrayList<>(List.of("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December",
                                                            "Jan.", "Feb.", "Mar.", "Apr.", "May", "June", "July", "Aug.", "Sept.", "Oct.", "Nov.", "Dec.",
                                                            "Jan", "Feb", "Mar", "Apr", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"));

        int yy, mm;
        int dd = 0;
        while(true){
            System.out.println("Enter the year: ");
            String year = scanner.nextLine();

            System.out.println("Enter the month: ");
            String month = scanner.nextLine();

            if(checkYear(year) == true && checkMonth(month, validMonth) == true){
                yy = Integer.valueOf(year);

                try{
                    mm = Integer.valueOf(month);
                } catch(Exception e){
                    mm = (validMonth.indexOf(month) + 1)%12;
                    if(mm == 0) mm = 12;
                }

                switch(mm){
                    case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                        dd = 31;
                        break;

                    case 4: case 6: case 9: case 11:
                        dd = 30;
                        break;

                    case 2:
                        if(isLeapYear(yy) == true) dd = 29;
                        else dd = 28;
                        break;

                    default:
                        break; 

                }
                System.out.println(dd);
                break;

            } else{
                System.out.println("Invalid input!");
            }
        }
        

    }

    public static boolean checkYear(String year){
        try{
            int value = Integer.parseInt(year);
            return value > 0;
            
        } catch(NumberFormatException e){
            return false;
        }
    }

    public static boolean checkMonth(String month, ArrayList<String> valid){
        try {
            int value = Integer.parseInt(month);
            return (value >= 1 && value <= 12);

        } catch (NumberFormatException e) {
            if(valid.contains(month)){
                return true;
            }
        }

        return false;
    }

    public static boolean isLeapYear(int year){
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }
}
