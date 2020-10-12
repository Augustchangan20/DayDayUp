import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * 1.处理输入->  升序or降序，student类型的数组/List
 * 2.处理排序->  调用Arrays.Sort，由于对象和对象无法天生进行比较，所以的提供让两个对象比较的依据；
 *          eg:  Comparable 或者 Comparator ， 这里使用Comparator
 *
 *                 Comparable比较器  通过比较要实现排序只能实现升序或者降序一种，比较死板
 *
 *                 Comparator比较器 比较灵活，通过比较要实现升序或者降序更得心应手
 *
 * 3.按照题目要求输出
 */
public class GradesTheSorting {
    static class Student{
        String name;
        int score;
        int number;  //记录录入顺序

        public Student(String name, int score, int number) {
            this.name = name;
            this.score = score;
            this.number = number;
        }
    }
    //Comparator 的功能，通过比较告诉我那个学生应该靠前
    static class AscComparator implements Comparator<Student>{

        @Override
        public int compare(Student o1, Student o2) {
            if (o1.score != o2.score){
                return o1.score - o2.score;
            }else {
                return o1.number - o2.number;
            }
        }
    }
    static class DescComparator implements Comparator<Student>{

        @Override
        public int compare(Student o1, Student o2) {
            if (o1.score != o2.score){
                return o2.score - o1.score;
            }else {
                return o1.number - o2.number;
            }
        }
    }

    public static void main(String[] args) {
        //1.处理输入数据
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int n = scanner.nextInt();
            int a = scanner.nextInt();
            boolean AscOrDesc = true; //true--升序；false--降序
            if (a == 0){
                AscOrDesc = false;//应题目要求，输入0是降序
            }
            Student[] students = new Student[n];
            for (int i = 0; i < n ; i++) {
                String name = scanner.next();
                int score = scanner.nextInt();
                students[i] = new Student(name,score,i);
            }
            //这里为什么用数组而不是List，是因为我下面要调用的方法是Arrays.Sort,
            //Arrays.Sort方法需要的就是数组（见下面图）
            if (AscOrDesc) {
                Arrays.sort(students,new AscComparator());
            }else {
                Arrays.sort(students,new DescComparator());
            }

            //处理输出
            for (int i = 0; i < n ; i++) {
                System.out.println(students[i].name+" "+students[i].score);
            }
        }
    }
}