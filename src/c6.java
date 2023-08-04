import java.util.Scanner;

/*
* 1. 循环结构四要素
*   1. 初始化部分
*   2. 循环条件部分 ---->一定是boolean类型的变量或表达式
*   3. 循环体部分
*   4. 迭代部分
*
* 2. Java中一共有三种循环：for， while， do while
*
* 3. for循环的格式
*
* for(初始化部分,循环条件部分,循环体部分){
*   迭代部分
* }
*
* 执行过程 1-2-3-4-2-3-4....-2
*
*
* 4. 我们可以在循环结构中使用break，一旦执行break，就跳出（或结束)当前循环
* 5. 如何结束一个循环结构：
*   1. 循环条件不满足。 即循环条件执行完以后是false
*   2. 在循环中执行了break
* */
public class c6 {
}

class ForLoop{
    public static void main (String[] args) {
        for (int i = 1;i<6;i++){
            System.out.println("hello world");
        }
        //执行过程
        int num = 1;
        for (System.out.println("a");num<3; System.out.println("c"),num++){
            System.out.println("b");
        }
    }
}

class NumU100{
    public static void main (String[] args){
        int k = 0;
        int l = 0;
        for (int j = 1; j<=100;j++){
            if (j%2==0){
                k = k + j;
                l = l + 1;
            }
        }
        System.out.println(k);
        System.out.println(l);
    }
}

class FlowerNumb{
    public static void main (String[] args){

        for (int fn = 100; fn <= 999; fn ++){
            int hd = fn / 100;
            int tn = fn / 10 % 10;
            int sg = fn % 10;
            if (fn == hd*hd*hd + tn*tn*tn + sg*sg*sg){
                System.out.println(fn);
            }
        }
    }
}

class CommenNum{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("pls input a number: ");
        int i = sc.nextInt();
        System.out.println("pls input the second number: ");
        int j = sc.nextInt();
        for (int l = i+j; l > 1; l-- ){
            if (i%l==0 && j%l==0){
                System.out.println(l);
                break;
            }
        }
        int max = Math.max(i,j);
        for(int k = max; k <= i*j ; k++){
            if(k%i==0 && k%j==0){
                System.out.println(k);
                break;
            }
        }
        int lcm = i * j;
        for (int k = max; k <= i * j; k++) {
            if (k % i == 0 && k % j == 0) {
                lcm = k;
                System.out.println(k);
                break;
            }
        }

        sc.close();
    }
}

