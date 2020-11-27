
/*
1.instanceof   A instanceof B  判断A是不是B的一个实例
2.
   一般情况下，如果调用equals，没有重写的话，默认是调用Object的equals 方法，它的实现是默认比较引用是否相同；
   public boolean equals(Object obj){
          return (this == obj);
   }
   String 使用 == 比较并不是比较字符串内容，而是比较两个引用是否指向同一个对象；
   Java中想要比较字符串的内容，必须采用String类提供的 equals 方法。
3.
  String和StringBuffer,StringBuilder 区别：
  @1：String 的拼接会产生大量的临时现象，StringBuilder 及 StringBuilder 不会
  @2：String 拼接会被优化成StringBuilder 的 append()方法;
  @3：String 的内容不可修改，StringBuffer 和 StringBuilder 的内容可以修改
  @4：StringBuffer 和 StringBuilder 中有一些方法是 String 不具备的，比如：reverse()逆置方法
  @5：StringBuffer 采用同步处理，属于线程安全操作；StringBuilder 采用异步处理，属于线程不安全操作.
4.
  this 和 super 的区别？
  This: 当前对象的引用
  @1：this(); //调用本类其他的构造方法
  @2：this.data;//访问当前类当中对属性
  @3：this.func();//调用本类的其他成员方法

  super: 代表父类对象的引用
  @1：super();调用父类的构造方法   必须放在第一行
  @2：super.data();//访问父类的属性
  @3：super.func();//访问父类的成员方法
  @4：super关键字在使用的时候，子类需要先帮助父类构造方法



 */





public class DataStructure {

}
