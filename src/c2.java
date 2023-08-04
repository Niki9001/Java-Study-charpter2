/*
* scanner使用
* 1.使用scanner获取不同类型数据的步骤
*   1. 导包， import java.util.Scanner;
*   2. 提供（或创建） 一个Scanner类的实例
*   3. 调用Scanner类中的方法，获取指定类型的变量
*   4. 关闭资源，调用Scanner类的close()
* 2. Scanner类中提供了获取 byte \ short \ int \ long \ float \ double \ boolean \ String 类型变量的方法
*   注意：没有提供获取char类型变量的方法，需要scan.next().charAt(0)
* 3. 写Scanner变量之前最好要写上sout文字，否则很难判断是否需要输入
* */
//1. 导包， import java.util.Scanner;
import java.util.Scanner;
public class c2 {
}

class ScannerTest {
    public static void main (String[] args){
        //2. 提供（或创建） 一个Scanner类的实例
        Scanner scan = new Scanner(System.in);

        System.out.print("Please input your name: ");
        //3. 调用Scanner类中的方法，获取指定类型的变量
        // 姓名
        String name = scan.next();
        System.out.println(name);
        // 年龄
        System.out.print("Please input your age: ");
        int age = scan.nextInt();
        System.out.println("His age is "+age);
        // 身高
        System.out.print("Please input your height: ");
        double height = scan.nextDouble();
        System.out.println("His height is "+height);
        // 单身
        System.out.print("Single or not: ");
        boolean single = scan.nextBoolean();
        System.out.println("His is single or not "+single);
        //性别
        char gender = scan.next().charAt(0);
        System.out.println("His gender is " + gender);

        //TODO:4. 关闭资源，调用Scanner类的close()
        scan.close();
    }
}

class MarryQuestion{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        //height
        System.out.println("Please input the height: ");
        double hg = sc.nextDouble();

        //rich
        System.out.println("Please input the saving: ");
        int rc = sc.nextInt();

        //handsome
        System.out.println("Please input the handsome or not: ");
        boolean hs = sc.nextBoolean();

        if (hg>=180 && rc>=1000 && hs==true){
            System.out.println("Marry him");
        } else if (hg>=180 || rc>=1000 || hs==true) {
            System.out.println("It's Okay");
        } else {
            System.out.println("NO");
        }
        sc.close();
    }
}




