/**
 * Break Continue 使用
 *              使用范围            在循环结构中的作用
 * break       在循环结构中         结束（或跳出）当前程序
 * continue     在循环结构中          结束（或跳出）当次循环
 * */

public class c11 {
}

class BreakContinue {
    public static void main (String[] args) {
        for (int i = 1; i <= 100; i++){

            for (int j = 1; j <= i;j++){
                if (i%j==0){
                    System.out.println(j + "");
                }
            }
            System.out.println();
        }
    }
}
class BreakContinue1 {
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++) {
            boolean isPrime = true;
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(i);
            }
        }
    }
}


class BreakContinue2 {
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++){
            int number = 0;
            for (int j = 2; j <i;j++){
                if (i%j==0){
                    number=number+1;
                }
                if (number==0){
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}

class BreakContinue3 {
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++){
            boolean flag = true;
            for (int j = 2; j <i;j++){
                if (i%j==0){
                    flag=false;
                }
            }
            if (flag){
                System.out.println(i);
            }
        }
    }
}