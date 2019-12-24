package cn.lc.core;

public class Student {

    String name;
    int ages;

    public Student(String name, int ages) {
        this.name = name;
        this.ages = ages;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", ages=" + ages +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAges() {
        return ages;
    }

    public void setAges(int ages) {
        this.ages = ages;
    }


}



