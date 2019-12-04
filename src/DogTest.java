
class Dog{
String name;
String sex;
double wight;
int age;
public    void sleep(){
        System.out.println("狗狗在睡觉！");
    }
public    void lookHome(){
    System.out.println("狗狗在看家！");
    }
}



public class DogTest {
    public static void main(String[] args) {
        //创建一个对象
        Dog dog = new Dog();
        //打印变量初始值
        System.out.println(dog.sex+"   "+dog.age+"   "+dog.wight);
        //把属性赋值
        dog.name = "毛毛";
        dog.age = 3;
        dog.sex = "母";
        dog.wight = 10.00;
        System.out.println(dog.name+"是"+dog.sex+"狗"+dog.age+"岁"+"体重"+dog.wight+"公斤");
        dog.sleep();
        dog.lookHome();
    }

}
