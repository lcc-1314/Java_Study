public class CatTest
{
   public static void main(String[] args){
       final double PI=3.1415926;
       //PI = 3.14;
       System.out.println(PI);
       LittleCat cat1 = new LittleCat();
       cat1.Isglass = true;
       cat1.age = 1;
       cat1.weight = 1.00;
       cat1.drink(true);
   }
}

class Cat{
    String name;
    int age;
    double weight;
    public void drink() {
        System.out.println("猫在喝水");
    }
}

class LittleCat extends Cat{
    boolean Isglass;
    public void drink(boolean Isglass){
        this.Isglass = Isglass;
        System.out.println(Isglass+"小猫在喝水");
    }
}