import java.util.*;
public class 汽水瓶问题{
    public static int drink(int n){
        //有n个空瓶子
        int bottle = 0;
        while(n > 2){
            bottle = bottle + n/3;
            //能喝到 n/3瓶汽水
            n = n/3 + n%3;
            //还剩 n/3 + n%3 个空瓶子
        }
        //退出循环，如果还剩2个空瓶子，可以问老板借一个空瓶子，又能喝一瓶
        if(n == 2){
            bottle = bottle +1;
        }
        return bottle;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        while(sc.hasNext()){
            n = sc.nextInt();
            if(n !=0){
                //!!!注意题目描述，n = 0表示输入结束
                System.out.println(drink(n));
            }
        }
        sc.close();
    }
}