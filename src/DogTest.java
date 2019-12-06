import java.time.chrono.IsoChronology;

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


   /* public  void  Dog(String name){
        this.name = name;
        System.out.println("狗狗在转圈！");
    }*/
}

class LittleDog extends Dog{
    boolean IsGlass;
    String name;

    public void  eat(){
        this.IsGlass = IsGlass;
        this.name = name;
        this.sleep();
        System.out.println(name+"小狗在吃饭！,今天戴眼镜了："+IsGlass);
    }

    public  void LittleDog(String name){
        this.name = name;
        System.out.println(name+"小狗在玩耍！,今天戴眼镜了："+IsGlass);
    }
}

public class DogTest {
    public static void main(String[] args) {
        //创建一个对象
        //Dog dog = new Dog();
        //打印变量初始值
        //System.out.println(dog.sex+"   "+dog.age+"   "+dog.wight);
        //把属性赋值
        /*dog.name = "毛毛";
        dog.age = 3;
        dog.sex = "母";
        dog.wight = 10.00;
        System.out.println(dog.name+"是"+dog.sex+"狗"+dog.age+"岁"+"体重"+dog.wight+"公斤");
        //dog.sleep();
        //dog.lookHome();*/


        //创建小狗的对象
        LittleDog dog1 = new LittleDog();
        dog1.name = "红红";
        dog1.age = 2;
        dog1.wight = 3.0;
        dog1.IsGlass = true;
        System.out.println(dog1.name+"今年"+dog1.age+"岁了，很乖！");
        dog1.eat();
        dog1.sleep();

        CatTest cat = new CatTest();
        cat.catsleep();
    }
}
