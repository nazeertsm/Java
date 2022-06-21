package JavaClasses.toString.Test;

public class CodeToStr {

    public static void main (String[] args) {

        Student s1 = new Student(1, "Bruce");
        Student s2 = new Student(2, "Jack");

        // When you try to print an object, it will print the memory location, not values
        //to Print the values user toString

        System.out.println(s1);
        System.out.println(s2);

        //System.out.println(s1.toString());



    }



}

