import java.util.Scanner;

/*
 * TODO：无限循环
 * 语法格式：
 * 最简单的无限循环格式：while(true)，for(;;)
 * */
public class c9 {
}

class ForWhileLoop1{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int j = 0;
        int k = 0;
        do {
            System.out.println("pls input a number: ");
            int i = sc.nextInt();
            if (i>0){
                j = j + 1;
            } else if (i<0) {
                k ++;
            } else {

                break;
            }
        }
        while (true);
        System.out.println(j);
        System.out.println(k);
        sc.close();
    }
}