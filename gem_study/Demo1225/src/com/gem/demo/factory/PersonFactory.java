package com.gem.demo.factory;

import com.gem.demo.pojo.Person;

public class PersonFactory {
    public Person creatPerson(String which){
        switch (which){
            case "A":
                return new A();
            case "B":
                return new B();
            default:
                return null;
        }
    }
}
