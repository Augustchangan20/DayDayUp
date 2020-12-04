import java.util.Scanner;

/**
 * 例25，有5，10，15，20，25（这个包含两个5），也就是6个5因子，就是6个0
 */
public class GetZero {

    public static int getZero(int num){
        return num==0?0:num/5+getZero(num/5);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(getZero(num));
    }
}