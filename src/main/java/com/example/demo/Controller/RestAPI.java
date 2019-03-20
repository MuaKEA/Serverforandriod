package com.example.demo.Controller;


import com.example.demo.Model.Classes;
import com.example.demo.Model.Teacher;
import com.example.demo.Repository.ClassesInterface;
import com.example.demo.Repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class RestAPI {
     List<Classes> theacherclasses;
@Autowired
    TeacherRepository teacherRepository;
@Autowired
    ClassesInterface classesInterface;



@GetMapping("/save")
public String mysqlfiller(){
//    Classes SWC=new Classes("Softwere Construcktion");
//    Classes SWD=new Classes("Softwere Design");
//    Classes TECH=new Classes("TECH");
//    Classes AI=new Classes("AI");
//    Classes Androidgameing=new Classes("Andriod Gaming");
//    Classes ITO=new Classes("ITO");
//    classesInterface.save(SWC);
//    classesInterface.save(SWD);
//    classesInterface.save(TECH);
//    classesInterface.save(AI);
//    classesInterface.save(Androidgameing);
//    classesInterface.save(ITO);


    List<Classes> fromdatabase= (List<Classes>) classesInterface.findAll();
    Teacher shadush= new Teacher("kristoffer",20,"tech expert",fromdatabase);
    Teacher cay= new Teacher("cay",45,"phd in computer science",fromdatabase);
    Teacher tom= new Teacher("tom",51,"quantum guy",fromdatabase);
    Teacher alex= new Teacher("alex",35,"it guy",fromdatabase);
    teacherRepository.save(shadush);
    teacherRepository.save(cay);
    teacherRepository.save(tom);
    teacherRepository.save(alex);




return "objects is saved!!!";
}


@GetMapping("/all")
public String getalldata(){
    Iterable<Teacher> fromdatabase=teacherRepository.findAll();

return fromdatabase.toString();

}




}
