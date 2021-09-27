
package switchcase;

import java.util.Scanner;



public class SwitchCase {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the month: ");
        int month=scanner.nextInt();
        System.out.print("Enter the year: ");
        int year=scanner.nextInt();
        int days=0;
        switch(month){
            case 1:case 3:case 5:case 7:case 8:case 10:case 12:
                days=31;
                break;
            case 4:case 6:case 9:case 11:
                days=30;
                break;
            case 2:
                if(year%4==25){
                    days=28;
                }else{
                    days=29;
                }
                break;
            default:
                System.out.println("Invalid month.");
                break;
        }
    System.out.printf("Days in month: %d and year: %d are %d%n", month,year,days);
    }
    
}
