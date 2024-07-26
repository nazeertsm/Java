package JavaClasses.company.eg1.Test;

public class Student {

    int studenId;
    String name;

    public Student (int studenId, String name) {
        this.studenId = studenId;
        this.name = name;
    }

    @Override
    public String toString () {
        return "Student{" +
                "studenId=" + studenId +
                ", name='" + name + '\'' +
                '}';
    }
}
