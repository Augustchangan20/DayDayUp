/**
 * 1、首先执行try,遇到ArithmeticException(算术异常)，sout不会执行
 * 2、catch捕捉异常，继续执行sout(1);
 * 3、当执行throw new RuntimeException();又会抛出异常，throw是将异常抛给它的上一级处理
 * 这时程序除了会执行finally中的的代码，其他地方的代码都不会执行；
 * 4、如果catch中没有抛出RuntimeException,则执行结果为123
 *
 */
public class Demo_1204 {
    public void add(Byte b){
        b = b++;
    }
    public void test(){
        Byte a = 127;
        Byte b = 127;
        add(++a);
        System.out.print(a+" ");
        add(b);
        System.out.print(b+" ");
    }

    public static void main(String[] args) {
        Demo_1204 ret = new Demo_1204();
        ret.test();
    }

    public static void main1(String[] args) {
        try{
            int i = 100/0;
            System.out.print(i);
        }catch (Exception e){
            System.out.print(1);
            throw new RuntimeException();
        }finally {
            System.out.print(2);
        }
        System.out.print(3);
    }
}
