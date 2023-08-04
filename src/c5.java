import java.util.Scanner;

public class c5 {
}
class SwtichCaseEx{
    public static void main (String[] args) {
        int grade = 45;
        switch (grade / 60) {
            case 0:
                System.out.println("fail");
                break;
            case 1:
                System.out.println("pass");
        }
    }
}

class MonthDay{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("pls input the month: ");
        int mn = sc.nextInt();
        System.out.print("pls input the day: ");
        int day = sc.nextInt();
        int a = 31;
        int b = 0;
        if (mn==1){
            b = a*0 + day;
        } else if (mn != 1) {
            switch (mn){
                case 3:
                    a = 31+28;
                    break;
                case 4:
                    a = 28+31+31;
                    break;
                case 5:
                    a = 28+31+31+30;
                    break;
                case 6:
                    a = 28+31+31+30+31;
                    break;
                case 7:
                    a = 28+31+31+30+31+30;
                    break;
                case 8:
                    a = 28+31+31+30+31+30+31;
                    break;
                case 9:
                    a = 28+31+31+30+31+30+31+31;
                    break;
                case 10:
                    a = 28+31+31+30+31+30+31+31+30;
                    break;
                case 11:
                    a = 28+31+31+30+31+30+31+31+30+31;
                    break;
                case 12:
                    a = 28+31+31+30+31+30+31+31+30+31+30;
                    break;
            }
            b = a + day;
        }
        System.out.println("This is the "+b+" of this year");
        sc.close();
    }
}

class MonthDay1{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("pls input the month: ");
        int mn = sc.nextInt();
        System.out.print("pls input the day: ");
        int day = sc.nextInt();
        int a = 31;
        int b = 0;
        if (mn==1){
            b = a*0 + day;
        } else if (mn != 1) {
            switch (mn){
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                    a = 28+31+31+30+31+30+31+31+30+31+30;
            }
            b = 365-( a + day);
        }
        System.out.println("This is the "+b+" of this year");
        sc.close();
    }
}