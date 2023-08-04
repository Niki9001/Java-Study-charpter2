import java.util.Scanner;

/**
* 循环之一：while循环
* 1. 循环结构四要素
*   1. 初始化部分
*   2. 循环条件部分 ---->一定是boolean类型的变量或表达式
*   3. 循环体部分
*   4. 迭代部分
*
* 3. while循环的格式
*
* 初始化部分
* while(循环条件部分){
*   循环体部分;
*   迭代部分
* }
*
* 执行过程 1-2-3-4-2-3-4....-2
*
* 4. for循环与while循环可以相互转换
*
* 5. for 循环和 while循环的小区别，初始化条件的作用域范围不同，while循环中的初始化条件在while循环结束后，依然有效
* */
public class c7 {
}

class WhileLoop1 {
    public static void main (String[] args) {
        int i = 0;
        while (i < 6){
            i++;
            System.out.println("Hello world");
        }
    }
}

class WhileLoop2 {
    public static void main (String[] args) {
        int j = 0;
        int k = 0;
        int l = 0;
        while ( j < 100){
            j++;
            if (j%2==0){
                k=k+j;
                l++;
            }
        }
        System.out.println(k);
        System.out.println(l);
    }
}

class WhileLoop3{
    public static void main (String[] args) {
        int i = (int)(Math.random()*100);
        int l = 0;
        int k = 0;
        while (l<100){
            l++;
            Scanner sc = new Scanner(System.in);
            System.out.print("Please input a number: ");
            int j = sc.nextInt();
            if (j > i){
                System.out.println("big");
                k = k + 1;
            } else if (j < i) {
                System.out.println("small");
                k = k + 1;
            } else {
                System.out.println("Correct!");
                k = k + 1;
                break;
            }
        }
        System.out.println("Total input time is "+k+" times.");
    }
}

class WhileLoop4{
    public static void main (String[] args) {
        double mountain = 8848860;
        double paper = 0.1;
        int i = 0;
        while (i<100){

            if (paper>mountain){
                break;
            } else {
                paper = paper*2;

            }
            i++;
        }
        System.out.println(paper);
        System.out.println(i);
    }
}