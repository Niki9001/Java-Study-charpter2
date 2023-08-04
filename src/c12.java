/**
 * 总结：
 * 1. 四个选项时，可以用switch-case结构
 * 2. 想要一直不结束循环就用do-while加flag
 * 3. （难点）想要记录每次输入的内容可以用字符串，需要
 *      1. 用一个变量记录字符串
 *      2. 字符串叠加，可以用+=，如果不用+=的话记得加括号
 *      3. 后面跟换行符可以起到换行作用
 *      4. 用占位符代替空格
 *
 * */

import java.util.Scanner;

public class c12 {
}
class AccountRegister {
    public static void main (String[] args) {
        boolean flag=true;
        // record amount
        int amount = 1000;
        // context
        String incomeLine = new String();
        boolean IncomeOrCost = true;
        do {

            for (int i = 0; i < 100; i++){
                System.out.println("=======================Welcome=======================");
                System.out.println(" ");
                System.out.println("                      1 Detail                      ");
                System.out.println("                      2 Income                      ");
                System.out.println("                      3 Cost                        ");
                System.out.println("                      4 Exit                        ");
                //scanner
                Scanner sc = new Scanner(System.in);
                System.out.print("                 pls select a number: ");

                int number = sc.nextInt();

                if (number==1){
                    System.out.println("===========================Account========================");
                    System.out.println("I/C       Total      Amount                 Commit        ");
                    System.out.println(" ");
                    System.out.println(incomeLine);
                    System.out.println("----------------------------------------------------------");
                    System.out.println("------------------PLS Make another choice-----------------");
                    System.out.println("----------------------------------------------------------");
                    System.out.println(" ");

                } else if (number==2) {
                    System.out.print("Income amount: ");
                    int income = sc.nextInt();
                    amount = amount+income;
                    System.out.print("Commit: ");
                    String Commit = sc.next();
                    //i/c
                    incomeLine =incomeLine+("Income\t\t"+amount+"\t\t"+income+"\t\t\t"+Commit+"\n");

                } else if (number==3) {
                    System.out.println("Cost amount");
                    int cost = sc.nextInt();
                    amount=amount-cost;
                    System.out.println("Commit: ");
                    String Commit1 = sc.next();
                    //i/c
                    incomeLine =incomeLine+("Income\t\t"+amount+"\t\t"+cost+"\t\t\t"+Commit1+"\n");

                } else if (number==4) {
                    System.out.println("================Thank you================");
                    flag=false;
                    break;
                }
            }


            }
        while (flag);



    }
}
