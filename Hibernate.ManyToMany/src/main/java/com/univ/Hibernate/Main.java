package com.univ.Hibernate;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class Main 
{
    public static void main( String[] args )
    {
        System.out.println("Prog Start......");
        Configuration cfg = new Configuration();
        cfg.configure();
        SessionFactory factory = cfg.buildSessionFactory();
        System.out.println(factory);
        
        //creating employe
        Employe emp1 = new Employe();
        emp1.setEid(101);
        emp1.setEname("Prajwal");
        emp1.setEaddress("Nepal");
        
        Employe emp2 = new Employe();
        emp2.setEid(102);
        emp2.setEname("Pankaj");
        emp2.setEaddress("Bhind");
        
        Employe emp3 = new Employe();
        emp3.setEid(103);
        emp3.setEname("Aman");
        emp3.setEaddress("Bullia");
        
        //creating department
        Department dept1 = new Department();
        dept1.setDid(11);
        dept1.setDname("Electrical");
        
        Department dept2 = new Department();
        dept2.setDid(12);
        dept2.setDname("Electronics");
        
        Department dept3 = new Department();
        dept3.setDid(13);
        dept3.setDname("Information Technology");
        
        //creating list of employee and department type
        List<Employe> list1 = new ArrayList<Employe>();
        List<Department> list2 = new ArrayList<Department>();
        
        list1.add(emp1);
        list1.add(emp2);
        list1.add(emp3);
        
        list2.add(dept1);
        list2.add(dept2);
        list2.add(dept3);
        
        //employee related to department or project related to employe
        emp1.setDept(list2);
        dept2.setEmp(list1);
        
        //session
        Session s = factory.openSession();
        Transaction tx = s.beginTransaction();
        
        //save data
        s.save(emp1);
        s.save(emp2);
        s.save(emp3);
        s.save(dept1);
        s.save(dept2);
        
        tx.commit();
        s.close();
        factory.close();
        System.out.println("Prog End.........");
    }
}
