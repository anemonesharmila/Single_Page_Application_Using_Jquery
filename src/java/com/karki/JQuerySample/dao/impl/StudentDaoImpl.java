/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.karki.JQuerySample.dao.impl;

import com.karki.JQuerySample.dao.StudentDao;
import com.karki.JQuerySample.entity.Student;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author sharmila
 */
public class StudentDaoImpl implements StudentDao {

    private EntityManagerFactory emf;
    private EntityManager em;
    private EntityTransaction transaction;

    public StudentDaoImpl() {
        emf = Persistence.createEntityManagerFactory("JQuerySamplePU");
        em = emf.createEntityManager();
    }

    @Override
    public void insert(Student student) {
        transaction = em.getTransaction();
        if (!transaction.isActive()) {
            transaction.begin();
        }
        em.persist(student);
        em.flush();
        transaction.commit();
    }

    @Override
    public void delete(int id) {
        transaction = em.getTransaction();
        if (!transaction.isActive()) {
            transaction.begin();
        }
        Student s = getById(id);
        if (s != null) {
            em.remove(s);
        }
        em.flush();
        transaction.commit();
    }

    @Override
    public List<Student> getAll() {
        return em.createQuery("select s from Student s").getResultList();
    }

    @Override
    public void update(Student student) {
        transaction = em.getTransaction();
        if (!transaction.isActive()) {
            transaction.begin();
        }
        em.merge(student);
        em.flush();
        transaction.commit();
    }

    @Override
    public Student getById(int id) {
        return em.find(Student.class, id);
    }

    @Override
    public Student getByName(String firstName) {
        return em.find(Student.class, firstName);
    }

}
