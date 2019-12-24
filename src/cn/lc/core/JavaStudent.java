package cn.lc.core;

public class JavaStudent {
    public static void main(String[] args) {
        String name ="liu chuang";
        int ages = 22;
        //Student s = new Student(name,ages);
      //  String name1 = s.getName();
        String[] s1 =  new String[10];
        s1=name.split(" ");
        for (int i = 0; i <s1.length ; i++) {

            System.out.println("s1="+s1[i]);
            
        }
    }
}
