import java.util.Scanner;

/**
 * 给你一个N，你想让其变为一个Fibonacci数，每一步你可以把当前数字X变为X-1或者X+1，
 * 现在给你一个数N求最少需要多少步可以变为Fibonacci数。
 *
 * 不必进行查找，也不必存储斐波那契数列，可直接快速获取返回值
 *
 * 循环生成斐波那契数，当生成第一个比n大的斐波那契数时，
 * 此时离n最近的两个斐波那契数为最新生成的两个斐波那契数，
 * 测试它们，返回与n之间的最小距离
 */
public class Fibonacci{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        while(b < n){
            int tmp = a + b;
            a = b;
            b = tmp;

        }
        System.out.print((b-n)>(n-a)?n-a:b-n);
    }
}