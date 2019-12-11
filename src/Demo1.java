
 class Teacher{
     String name;
    public  void teach(String name){
        System.out.println(name+"老师在教课！");
    };
}
class JavaTeacher extends Teacher{
    public  void javateach(String name){
        System.out.println(name+"Java老师在教Java课！");
        }
}


class PHPTeacher extends Teacher{

    public  void phpteach(String name) {
        System.out.println(name+"PHP老师在教PHP课！");
    }
}

public class Demo1 {
    public static void main(String[] args) {
        Teacher jt = new JavaTeacher();
        jt.name = "闯哥";
        ((JavaTeacher) jt).javateach(jt.name);

        System.out.println("----------------");
        Teacher pt = new PHPTeacher();
        pt.name = "波哥";
        ((PHPTeacher) pt).phpteach( pt.name);
    }
}