package com.baobaotao.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import com.baobaotao.Service.StudentService;
import com.baobaotao.domain.Artical;
import com.baobaotao.domain.Student;

/**
 * Date:     2017年4月11日 下午10:15:26
 * @author   maskwang 
 * @since    JDK 1.6
 */
@Controller
public class StudentController {
	@Autowired
    StudentService studentService;
		
  @RequestMapping(value = "/loginCheck.html")
   public void getAllStudent(){
	  System.out.println("hello");
	  Student stu=studentService.getStudent(123);
	   List<Student> list=studentService.getAllStudent();
	   System.out.println(list);
//	   Student stu=new Student();
//	   stu.setAge(100);
//	   stu.setMoney(1000);
//	   stu.setName("hello");
//	   stu.setStu_id(126);
//	   studentService.insertStudent(stu);
//	   stu.setName("sb");
//	   studentService.updateStudent(stu);
 //   studentService.deleteStudent(126);
//	  Map<String,Integer> map=new HashMap<String,Integer>();
//	  map.put("stuid",null);
//	  //List<Artical> list=studentService.getStudentArticals(123);
//	  List<Artical> list=studentService.getSomeArticals(map);//传入map
//	  System.out.println(list.size());
//	  System.out.println(list);
   }
}
