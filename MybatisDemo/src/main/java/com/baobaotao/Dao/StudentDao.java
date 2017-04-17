package com.baobaotao.Dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.baobaotao.domain.Artical;
import com.baobaotao.domain.Student;

/**
 * Date:     2017年4月11日 下午10:01:47
 * @author   maskwang 
 * @since    JDK 1.6
 */
@Repository
public interface StudentDao {
   public Student getStudent(@Param("id")int id);
   public void deleteStudent(int id);
   public void updateStudent(Student stu);
   public List<Student> getAllStudent();
   public void insertStudent(Student stu);
   public List<Artical> getStudentArticals(int id);
   public List<Artical> getSomeArticals(Map<String,Integer> map);
}
