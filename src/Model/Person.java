/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author friedahuang
 */
public class Person {
    String name;
    String id;

    public String getPersonName() {
        return name;
    }

    public Person(String name, String id) {
        this.id = id;
        this.name = name;
    }

    public String getPersonId() {
        return id;
    }

    public boolean isMatch(String id) {
        return getPersonId().equals(id);

    }

    @Override
    public String toString() {
        return getPersonId();
    }
}
