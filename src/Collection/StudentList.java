package Collection;

import java.util.ArrayList;
import java.util.List;

public class StudentList {

    int id;
    String name;
    String email;

    StudentList(int id,String name,String email){
        this.id= id;
        this.name=name;
        this.email=email;
    }
    public String toString(){
        return "StudentList{" +
                "  id  " +id +
                "name  " + name +
                "email  " +email +
                  "}";
    }
    public static void main(String[] args) {

        List<StudentList> li = new ArrayList<>();
        StudentList st1= new StudentList(1,"ansh","abc@gmail.com");
        StudentList st2= new StudentList(2,"yash","abc@gmail.com");
        StudentList st3= new StudentList(3,"ram","abc@gmail.com");

        li.add(st1);
        li.add(st2);
        li.add(st3);
        System.out.println(li);
    }
}
