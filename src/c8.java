import java.util.Scanner;

/**
* 循环之一：do-while循环
* 1. 循环结构四要素
*   1. 初始化部分
*   2. 循环条件部分 ---->一定是boolean类型的变量或表达式
*   3. 循环体部分
*   4. 迭代部分
*
* 3. do-while循环的格式
*  初始化部分
*  do {
*   循环体部分;
*   迭代部分
*  }
*  while(循环条件部分);
*
* 4. 执行过程
*  1-3-4-2-3-4-3-4-2
*
* 5. 说明：
*  1. 至少会执行一次循环体
*  2. for、while、do-while循环之间可以转换
*  3. 在开发中do-while循环使用较少
*
*
 */
public class c8 {
}

class DoWhileLoop1{
    public static void main (String[] args) {
        int i = 1;
        int k = 0;
        int l = 0;

        do {
            if (i%2==0){
                k=k+1;
                l=l+i;
            }
            i++;
        } while (i<=100);
        System.out.println(k);
        System.out.println(l);
    }
}


class DoWhileLoop2 {
    public static void main(String[] args) {
        System.out.println("=============ATM=============");
        System.out.println("         1. Deposit");
        System.out.println("         2. Borrow");
        System.out.println("         3. Balance");
        System.out.println("         4. Exit");


        double accountbalance = 0;
        //int operate = 0;
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        do {
            //operate++;
            flag=true;
            System.out.print("Please select: ");

            int input = sc.nextInt();
            if (input==1){
                System.out.print("pls input deposit amount: ");
                double add = sc.nextDouble();
                accountbalance=accountbalance+add;
                flag=true;
            } else if (input==2) {
                System.out.print("pls input borrow amount: ");
                double borrow = sc.nextDouble();
                accountbalance = accountbalance - borrow;
                flag=true;
            } else if (input==3) {
                System.out.println("Your balance is "+accountbalance);
                flag=true;
            } else if (input==4) {
                System.out.println("See you!");
                flag = false;
                break;
            } else {
                System.out.println("Wrong typing");
                flag=true;
            }
        }
        while (flag=true);
        sc.close();
    }

}


