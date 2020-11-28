/**
 * 1、Java中静态变量只能在类主体中定义，不能在方法中定义；
 *    静态变量属于类所有而不属于方法；
 * 2、静态块：用static声明，JVM加载类时执行，仅执行一次；
 *   构造块： 类中直接用{}定义，每一次船舰对象时执行；
 *   执行优先顺序： 静态块 > main() > 构造块 > 构造方法
 * 3、类的加载顺序：
 *    1> 父类静态对象和静态代码块
 *    2> 子类静态对象和静态代码块
 *    3> 父类非静态对象和非静态代码块
 *    4> 父类构造函数
 *    5> 子类非静态对象和非静态代码块
 *    6> 子类构造函数
 */

public class static_Demo {
    static int age1 = 1;
    static{
        age1 = 10;
        System.out.println("这是静态代码块");
    }
    {
        System.out.println("这是普通代码块"+age1);
    }
    public static_Demo(){
        System.out.println("这是构造方法");
    }
    public void fun(){
        System.out.println("这是普通方法fun");
    }
    public static void show(){
        System.out.println("这是静态方法"+age1);
    }

    public static void main(String[] args) {
        System.err.println("==============");
        static_Demo.show();
        static_Demo ret = new static_Demo();
        ret.fun();
        ret.show();
    }
}

