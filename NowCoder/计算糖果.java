import java.util.Scanner;
public class 计算糖果{
    /**
     *  要求ABC都为整数
     *  注意多了一个约束条件，即四个式子解3个未知数，所以还要确定满不满足A+B==n3
     *  既然A = (Y1 + Y3)/2 ，那么（Y1 + Y3）%2则为 0
     * @param args
     */
    public static void main1(String[]args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()){
            int y1 = sc.nextInt();
            int y2 = sc.nextInt();
            int y3 = sc.nextInt();
            int y4 = sc.nextInt();
            int A = (y1 + y3)/2;
            int B = (y2 + y4)/2;
            int C = B - y2;
            if((y1 + y3)%2 == 0&&(y2 + y4)%2 == 0&&(A + B == y3)){
                System.out.println(A+" "+B+" "+C);
            }else{
                System.out.println("No");
            }
        }
    }

    /**
     * ！！！如果ABC中有非整数  ， 比如说输入的是 ：2  1  5  2，则需要用 float定义
     * 这道题目的实质是：判断三元一次方程组是否有解及求解。
     * 把题目条件用方程式表示：
     * A-B=Y1;
     * B-C=Y2;
     * A+B=Y3;
     * B+C=Y4;
     *
     * 用消元法求解：
     * A=(Y1+Y3)/2;
     * B=(Y3-Y1)/2=(Y2+Y4)/2;
     * C=(Y4-Y2)/2;
     *
     * 由于题目给出的是整数，要求解也是整数，这个约束条件也需要注意下。
     * 不满足约束条件就是没解，就可以输出NO了，满足所有的约束条件那就是有解。
     * @param args
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int y1,y2,y3,y4;
        float a,b,c;
        while (in.hasNextInt()) {
            y1 = in.nextInt();
            y2 = in.nextInt();
            y3 = in.nextInt();
            y4 = in.nextInt();
            a=(y1+y3)/2f;
            b=(y3-y1)/2f;
            c=(y4-y2)/2f;
            if((a-((y1+y3)/2))!=0){
                System.out.print("No");
                return ;
            }
            if((b-((y3-y1)/2)!=0)||(b!=((y2+y4)/2))){
                System.out.print("No");
                return ;
            }
            if((c-((y4-y2)/2))!=0){
                System.out.print("No");
                return ;
            }
            //满足所有的约束条件，输出解。
            System.out.print((int)a+" "+(int)b+" "+(int)c);
        }
    }
}
