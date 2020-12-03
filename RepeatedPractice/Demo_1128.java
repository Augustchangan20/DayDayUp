public class Demo_1128 {
    public Demo_1128() {
        System.out.println("I'm A class");//第三步：    执行父类构造方法
    }

    static {
        System.out.println("static A");//  第一步： 先执行父类代码块
    }
}
 class HelloB extends Demo_1128{
    public HelloB(){
        System.out.println("I'm B class"); //第四步： 执行子类构造方法
    }
    static {
        System.out.println("static B");  //第二步 ： 执行子类代码块
    }

    public static void main(String[] args) {
        new HelloB();
    }
}


/*    public static void main(String[] args) {
        int num = 10;
        System.out.println(test(num));//num = 10
    }
    public static int test(int b){
    try{
        b += 10; //b = 10;
        return b; //b = 20
    }catch (RuntimeException e){

    }catch (Exception e2){

    }
    finally {
        b += 10; //b = 20
        return b;//b = 30
    }
    }*/

