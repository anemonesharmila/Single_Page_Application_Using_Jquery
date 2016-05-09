package com.karki.JQuerySample.api;

import com.karki.JQuerySample.dao.StudentDao;
import com.karki.JQuerySample.dao.impl.StudentDaoImpl;
import com.karki.JQuerySample.entity.Student;
import java.util.List;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;



@Path("/studentapi")
public class StudentAPI{
    
   private StudentDao serviceDao=new StudentDaoImpl();
   
    @GET
   @Produces(value = MediaType.APPLICATION_JSON)
   public List<Student> getAll(){
       
       return serviceDao.getAll();
   }
   
   @Path("/js")
   @GET
   @Produces(value = MediaType.APPLICATION_JSON)
   public List<Student> all(){
       
       return serviceDao.getAll();
   }
   @Path("/save")
   @POST
   public Student save(@FormParam("firstName")String firstName,@FormParam("lastName")String lastName,@FormParam("phoneNumber")long phoneNumber,
           @FormParam("address")String address,@FormParam("status")int status)
   {
       Student student=new Student(0, firstName, lastName, phoneNumber, address, (status==1)?true:false);
       serviceDao.insert(student);
       return student;
   }
   
   
  
}