/**
 *     了解for语句
 * 1.各部分执行的顺序
 * 2.各部分执行的次数
 * 3.循环的终止条件
 *
 * 分号之前第一部分是初始化语句也就是for('a')所以只会执行一次，第二部分是循环终止控制，也就是循环条件当for('b') && (i<2)为false时条件就会终止,所以循环会执行两次
 *
 * 第三部分在每次循环完毕时执行，所以执行顺序是先for('a')所以先打印a,再次执行for('b')并且判断条件i<2 条件是否满足，满足的话进入循环体,然后i++ i等于1,然后执行for('d')
 *
 * 再打印d ,执行完毕再执行for('c')打印c，这是循环一次的结果 abdc，第二遍循环，因为a是初始化变量所以只执行一次，直接执行循环条件,先执行for('b')并且判断i<2条件是
 *
 * 否满足，现在i是1所以条件满足进入循环体,执行i++,再次执行for('d'),循环完毕执行('c')然后打印c,循环第二遍的结果是bdc,这时循环还会继续执行,因为它还不知道
 *
 * i是否小于2,初始化变量不执行,执行循环条件,先执行for('b')打印b然后判断循环条件,现在i等于2所以i<2的条件不满足,所以循环结束
 */
public class Demo_1208 {
    public static void main(String[] args) {
        Thread t = new Thread(){
            public void run(){
                dianping();
            }
        };
        t.run();
        System.out.println("dazhong");
    }
    static void dianping(){
        System.out.println("dianping");
    }

   /* static boolean out(char c){
        System.out.print(c);
        return true;
    }
    public static void main(String[] args) {
        int i = 0;
        for (out('A');out('B')&&(i<2);out('C')){
            i++;
            out('D');
        }
    }*/
}
