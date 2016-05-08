/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.karki.JQuerySample.api;

import com.karki.JQuerySample.entity.Student;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author sharmila
 */
@Path("studentapi")
public class StudentAPI {

    @GET
    @Produces(value = MediaType.APPLICATION_JSON)
    public List<Student> index() {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1, "sharmila", "karki", 989911595, "dhapasi", true));
        studentList.add(new Student(2, "anemone", "karki", 834302357, "ktm", true));
        studentList.add(new Student(3, "shusila", "karki", 9849115, "basundhara", false));
        studentList.add(new Student(4, "ansu", "adh", 247304710, "gausala", true));
        studentList.add(new Student(5, "manish", "joshi", 137105232, "bkt", true));

        return studentList;
    }

    @Path("/save")
    @POST
    @Produces("text/plain")
    public String savedata(@FormParam("firstName") String firstName, @FormParam("lastName") String lastName, @FormParam("phoneNumber") long phoneNumber,
            @FormParam("address") String address, @FormParam("status") boolean status) {
        return "Thankyou" + firstName + " " + lastName;
    }
}
