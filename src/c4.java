/*
* 1. 语法格式
*
* swtich(表达式){
*
*   case 常量1：
*       //执行语句1
*       //break；
*   case 常量2：
*       //执行语句2
*       //break；
* ...
*
*   default:
*       //执行语句2
*       //break；
* }
*
* 2. 执行过程
* 根据表达式的值，依次匹配case语句，一旦与某一个case中的常量相等，那么就执行此case中的执行语句。执行完此case之后
*   情况1： 遇到break，则执行break后跳出程序
*   情况2： 没有遇到break，则继续执行气候的case中的执行语句
*           ....
*           直到执行完所有程序或者遇到break
*
* 3. 说明：
*   1. switch中的表达式只能是特定的数据类型，如下： byte \ short \ char \ int \ 枚举 \ String
*   2. case后是跟着相等的判断，不能进行范围判断
*   3. 开发中使用switch case时，一般case的情况都是有限的
*   4. break 可以使用在switch-case中，一旦执行break关键字，就跳出当前的switch-case结构
*   5. default：类似if-else中的else结构
*       default：是可选的，而且位置是灵活的
*
* 4. switch-case 与 if-else之间的转换
*   1. 开发中凡是可以使用switch-case结构的场景，都可以使用if-else
*   2. 开发中既可以使用switch-case结构的场景，又可以使用if-else，用switch-case
* */

import java.util.Scanner;

public class c4 {
}

class SwitchCase{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        int num = sc.nextInt();
        switch (num){
            case 0:
                System.out.println("zero");
                break;
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            default:
                System.out.println("other");
                break;
        }
    }
}