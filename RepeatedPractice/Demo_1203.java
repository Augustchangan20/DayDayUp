import javax.xml.bind.SchemaOutputResolver;


/*    String name = "No name";
    public Person(String nm){
        name = nm;
    }
}
class Employee extends Person{
    String empID = "0000";
    public Employee(String id){

        empID = id;
    }
}
public class Demo_1203 {
    public static void main(String[] args) {
        Employee e = new Employee("123");
        System.out.println(e.empID);
    }

}*/
/*    private static void testMethod(){
        System.out.println("testMethod");
    }
    public static void main(String[] args) {
        ((Demo_1203)null).testMethod();
    }
}*/
public class Demo_1203{
    public static void main(String[] args) {
        System.out.println(new B().getValue());
    }

    static class A {
        protected int value;

        public A(int v) {
            setValue(v);
        }

        public void setValue(int value) {
            this.value = value;
        }


        public int getValue() {
            try {
                value++;
                return value;
            } catch (Exception e) {
                System.out.println(e.toString());
            } finally {
                this.setValue(value);
                System.out.println(value);
            }
            return value;
        }
    }
    static class B extends A {
        public B() {
            super(5);
            setValue(getValue() - 3);
        }

        public void setValue(int value) {
            super.setValue(2 * value);
        }
    }
}