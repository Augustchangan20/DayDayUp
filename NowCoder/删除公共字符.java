import java.util.Scanner;
public class 删除公共字符{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){
            String tmp = sc.nextLine();
            String pattern = sc.nextLine();
            StringBuffer sb = new StringBuffer();
            for(int i = 0;i < tmp.length();i++){
                String ret=String.valueOf(tmp.charAt(i));

                if (!pattern.contains(ret)){
                    sb.append(ret);
                }
            }
            System.out.println(sb.toString());
        }
    }
}