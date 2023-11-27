package Encapsulation;

public class Person {

    private String name; // Private = Restricted Access

    public String getName() { //Getter
        return name;
    }

    public void setName(String newName) { //Setter
        this.name = newName;
    }
}
