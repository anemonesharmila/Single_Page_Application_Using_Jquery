/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.karki.JQuerySample.dao;

import com.karki.JQuerySample.entity.Student;
import java.util.List;

/**
 *
 * @author sharmila
 */
public interface StudentDao {
    void insert(Student student);
    void delete(int id);
    void update(Student student);
    List<Student> getAll();
    Student getById(int id);
    Student getByName(String firstName);
    
}
