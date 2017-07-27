package com.conferor.reveng;

public class Person  implements java.io.Serializable {
     private String id;
     private String name;
     private String email;
     private int age;

    public Person() {
    }

    public Person(String id, String name, String email, int age) {
       this.id = id;
       this.name = name;
       this.email = email;
       this.age = age;
    }
   
    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public int getAge() {
        return this.age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", email=" + email + ", age=" + age + '}';
    }
}
