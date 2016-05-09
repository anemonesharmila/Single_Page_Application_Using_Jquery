package com.karki.JQuerySample.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-05-09T23:58:47")
@StaticMetamodel(Student.class)
public class Student_ { 

    public static volatile SingularAttribute<Student, String> firstName;
    public static volatile SingularAttribute<Student, String> lastName;
    public static volatile SingularAttribute<Student, Long> phoneNumber;
    public static volatile SingularAttribute<Student, String> address;
    public static volatile SingularAttribute<Student, Date> addedDate;
    public static volatile SingularAttribute<Student, Date> modifiedDate;
    public static volatile SingularAttribute<Student, Integer> id;
    public static volatile SingularAttribute<Student, Boolean> status;

}