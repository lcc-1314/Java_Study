
public class Demo2 {
    public static void main(String[] args) {
        show(new Cat1());  // 以 Cat 对象调用 show 方法
        show(new Dog1());  // 以 Dog 对象调用 show 方法

        Animal a = new Cat1();  // 向上转型
        a.eat();               // 调用的是 Cat 的 eat
        Cat1 c = (Cat1)a;        // 向下转型
        c.work();        // 调用的是 Cat 的 work
    }

    public static void show(Animal a)  {
        a.eat();
        // 类型判断
        if (a instanceof Cat1)  {  // 猫做的事情
            Cat1 c = (Cat1)a;
            c.work();
        } else if (a instanceof Dog1) { // 狗做的事情
            Dog1 c = (Dog1)a;
            c.work();
        }
    }
}

abstract class Animal {
    abstract void eat();
}

class Cat1 extends Animal {
    public void eat() {
        System.out.println("吃鱼");
    }
    public void work() {
        System.out.println("抓老鼠");
    }
}

class Dog1 extends Animal {
    public void eat() {
        System.out.println("吃骨头");
    }
    public void work() {
        System.out.println("看家");
    }
}