/*
* 如何获取一个随机数 random numbner
* 1. 可以使用Java提供的API： Math类的random()
* 2. random() 方法调用后会返回一个 0.0 - 1.0 范围的double型的随机数
* 3. 返回0-100范围的随机整数
* 4. 获取一个 [a,b] 范围的随机数
*  (int)(Math.random() * (b - a + 1)) + a
* */
public class c3 {
}

class Random{
    public static void main (String[] args){
        double d1 = Math.random();
        System.out.println(d1);
        int d2 = (int)(Math.random() * 100);
        System.out.println(d2);
    }
}