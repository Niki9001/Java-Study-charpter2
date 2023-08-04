/**
* 嵌套循环
*
* 1. 是指一个循环结构A的循环体是了那个一个循环结构B
*  比如 for循环里面还有一个for循环
*  - 外层循环：循环结构A
*  - 内层循环：循环结构B
*
* 2. 说明
*   1. 内层循环充当了外层循环的循环体
*   2. 对于两层嵌套循环来说，外层循环控制行数，内层循环控制列数
*   3. 实际开发中，我们不会出现三层以上的循环结构，三层循环结构都很少见
* */

public class c10 {
}

class Loops1{
    public static void main (String[] args) {
        for (int i = 0; i < 6; i++) {
            System.out.println("Hello");
            for (int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println("-");
        }
    }
}


class Loops2{
    public static void main (String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j <= i; j++){
                System.out.print(i + "*" + j + "=" + i*j+" ");
            }
            System.out.println(" ");
        }
    }
}