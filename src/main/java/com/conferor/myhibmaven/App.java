package com.conferor.myhibmaven;

import com.conferor.reveng.Person;
import java.util.List;
import java.util.UUID;
import org.hibernate.Session;

public class App {
    public static void main( String[] args ) {
        System.out.println("Hibernate Tutorial Using Maven + Hibernate + MySQL");
        Session session = NewHibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();
        String newId = UUID.randomUUID().toString().replaceAll("-", "");
        Person person = new Person(newId, "Pepe", "pepe@live.com", 40);
        session.save(person);
        
        List<Person> persons = session.createQuery("from Person").list();
        persons.forEach(System.out::println);
        
        session.getTransaction().commit();
        session.close();
        NewHibernateUtil.shutdown();
    }
}
