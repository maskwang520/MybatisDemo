package com.baobaotao.Service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baobaotao.Dao.StudentDao;
import com.baobaotao.domain.Artical;
import com.baobaotao.domain.Student;

/**
 * Date:     2017年4月12日 上午8:05:17
 * @author   maskwang 
 * @since    JDK 1.6
 */
@Service
public class StudentService {
	@Autowired
	StudentDao studentDao;
	public Student getStudent(int id) {
		// TODO Auto-generated method stub
		return studentDao.getStudent(id);	
	}

	public void deleteStudent(int id) {
		studentDao.deleteStudent(id);

	}

	public void updateStudent(Student stu) {
		studentDao.updateStudent(stu);

	}

	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		return studentDao.getAllStudent();
	}

	public void insertStudent(Student stu) {
		studentDao.insertStudent(stu);

	}
   
	public List<Artical> getStudentArticals(int id){
		return studentDao.getStudentArticals(id);
	}
	
	public List<Artical> getSomeArticals(Map<String,Integer> map){
		return studentDao.getSomeArticals(map);
	}

}
