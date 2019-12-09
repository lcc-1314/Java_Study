



interface A{

    public void print();

}

interface C{

    public void getArea();

}

interface B extends A,C{ // B接口继承A接口

    public void test();

}


public class InterFace implements B{

    public static void main(String[] args){

        InterFace d = new InterFace();

        d.print();
        d.getArea();
        d.test();
    }

    public void getArea(){
        System.out.println("112243");
    }

    public void test(){
        System.out.println("231543465");
    }

    public void print(){

        System.out.println("这个是A接口的print方法...");

    }

}
