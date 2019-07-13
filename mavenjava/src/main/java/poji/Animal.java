package poji;

import com.Person;

public class Animal extends Person {
    String name;
    String type;
    public Animal(String name,String type){
        this.name = name;
        this.type = type;
    }
    public void whoHaveAnimal(Person p){
        System.out.println(p.name + " have a " + this.type + " ,it's name " + this.name);
    }
}
