import java.util.Scanner;

public class 学分绩点 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int n = sc.nextInt();//总共的课程数    输入的第一行
            int[] credit = new int[n];//每门课的学分，存入数组
            int[] ret = new int[n];//对应课程的分数，存入数组
            for (int i = 0; i < n; i++) {
                credit[i] = sc.nextInt(); // 输入的第二行
            }
            for (int i = 0; i < n; i++) {
                ret[i] = sc.nextInt();   //输入的第三行
            }
            System.out.printf("%.2f", averageCredit(credit, ret));
        }
    }
    static double averageCredit(int[] credit,int[] ret){
        double sum = 0.0; //sum 用来表示所有课程加起来的学分之和
        double allClassCredit = 0.0; // 所有学科的绩点之和
        for (int i = 0; i < ret.length ; i++) {
            allClassCredit += credit[i]*Gread(ret[i]);
            sum += credit[i];
        }
        return allClassCredit/sum; //GPA  所有学科绩点之和/所有课程学分之和
    }
    static double Gread(int ret){ //没门课程分数对应的绩点
        double gread = 0;
        if ( ret >= 90 && ret <= 100){
            gread = 4.0;
        }
        else if (ret >=85 && ret <= 89){
            gread = 3.7;
        }else if (ret >= 82 && ret <= 84){
            gread = 3.3;
        }else if (ret >= 78 && ret <= 81){
            gread = 3.0;
        }else if (ret >= 75 && ret <= 77){
            gread = 2.7;
        }else if (ret >= 72 && ret <=74){
            gread = 2.3;
        }else if (ret >= 68 && ret <= 71){
            gread = 2.0;
        }else if (ret >= 64 && ret <= 67){
            gread = 1.5;
        }else if (ret >= 60 && ret <= 63){
            gread = 1.0;
        }else if (ret < 60){
            gread = 0.0;
        }
        return gread;
    }
}
