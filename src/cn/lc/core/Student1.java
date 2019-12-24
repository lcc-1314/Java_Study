package cn.lc.core;

abstract class person{
    public abstract  void  say();
}
public class Student1 extends person {

    @Override
    public void say() {
        System.out.println("学生在讲话！");
    }

    public static void main(String[] args) {
        person s = new Student1();
        s.say();
        System.out.println("");
    }
}

