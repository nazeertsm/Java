package JavaClasses.company.eg1.eg;

//A Dog is a type of Pet

import java.time.LocalDate;

public class Dog extends Pet{
    public void bark(){

        System.out.println("Ruff ruff");
    }

    public Dog () {

    }

    public Dog (String name, LocalDate dob) {
        super(name, dob);
    }
}
