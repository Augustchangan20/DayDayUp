import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 这里我们用到了集合ArrayList，
 * 当然你也可以使用其他的集合。存放n个数，且都是从0到n-1的数字。
 * 因为每次删除的都是当前位置的后面第2个，
 * 那么我们就可以这样写：(i+2)%size; 当i==0的时候，我们移除的就 是2号下标，接着需要移除4号下标，那么新的i = (i+2)%size;
 * 那么结束条件应该是什么？
 * 我们要找到存活的，显而易见当集合的size等于1的时候停止删除
 */
public class DeleteNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            if (n > 1000) {
                n = 999;
            }
            List<Integer> list = new ArrayList<Integer>();
            for (int i = 0; i < n; i++) {
                list.add(i);
            }
            int i = 0;
            while (list.size() > 1) {
                i = (i + 2) % list.size();//这里用调试，很明确可以看出来
                list.remove(i);
            }
            System.out.println(list.get(0));
        }
    }
}