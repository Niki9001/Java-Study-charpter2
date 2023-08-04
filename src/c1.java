/*
* 分支结构1： if-else条件判断结构
*
* 1.格式
* if（条件表达式）{
*   语句块；
* }
*
* 2.格式2
* if（条件表达式）{
*   语句块1；
* }else {
*   语句块2；
* }
*
* 3. 格式3
*  if（条件表达式1）{
*   语句块1；
* }else if（条件表达式2）{
*   语句块2；
* } else {
*   语句块n+1；
* }
*
* TODO:
*  1.如果多个条件表达式之间没有交集（理解是互斥关系），则哪个条件表达式声明在上面，哪个条件表达式在下面都可以
*  2.如果多个条件表达式之间是包含关系，则需要将范围小的条件表达式声明在范围大的条件表达式上面。否则范围小的条件表达式不会被执行
*  3.从开发经验来说，没有写过超过三层的if-else结构
*  4. 如果if-else中的执行语句块中只有一行执行语句，则此执行语句所在的一对{}可以省略，但是不建议省略
*
*
* */


public class c1 {
}

class IfElseTest{
    public static void main(String[] args){
        int heartBeats = 89;
        if (60 >= heartBeats && heartBeats > 100){
            System.out.println("More check ");
        }
        System.out.println("Finish");
    }
}

class NumberTest{
    public static void main(String[] args){
        int num = 11;
        if (num%2==0){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}

class IfElseIfTest{
    public static void main(String[] args){
        int grade = 80;
        if(grade==100){
            System.out.println("race car");
        } else if (grade>80 && grade<=99) {
            System.out.println("bike");
        } else if (grade>=60 && grade <=80) {
            System.out.println("playground");
        } else {
            System.out.println("nothing");
        }
    }
}