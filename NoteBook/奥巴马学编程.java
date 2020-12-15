import java.util.Scanner;
public class 奥巴马学编程{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String str = sc.next();
        //注意这里用next（），而不是nextLine();
        //在java中，next()方法是不接收空格的，在接收到有效数据前，所有的空格或者tab键等输入被忽略，
        //   若有有效数据，则遇到这些键退出。
        //nextLine()可以接收空格或者tab键，其输入应该以enter键结束。
        for(int i = 1;i <= N;i++){
            System.out.print(str);//打印第一行
        }
        System.out.println();//第一行打印完换行
        for(int i = 1;i<=Math.ceil((double)N/2)-2;i++){//打印中间行
            //因为题目要求实际行数是列数的50%
            //所以去掉第一行和最后一行
            //中间行数为 N/2 - 2;
            //Math.ceil函数代表向上取整
            //比如; 11.42=11.5=11.69=12
            //-11.69 = -11.5 = -11.42 = -11
            System.out.print(str);//打印中间行第一个字符
            for(int j = 2;j <= N -1;j++){
                System.out.print(" ");//中间行补空格
            }
            System.out.println(str);//打印中间行最后一个
        }
        for(int i = 1;i<= N;i++){
            System.out.print(str);
        }

    }
}