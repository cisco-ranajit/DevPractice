package org.practice.main;

import datamode.main.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * @author ranajit
 * Hibernate practice
 */
public class App 
{
    public static void main( String[] args )
    {
            Student studentOne = new Student();
            studentOne.setName("Ranajit");
            studentOne.setAge(24);
            studentOne.setRoll_no(52);
            Configuration configuration = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class);
            SessionFactory sessionFactory = configuration.buildSessionFactory();
            Session session = sessionFactory.openSession();
            session.save(studentOne);

    }
}
