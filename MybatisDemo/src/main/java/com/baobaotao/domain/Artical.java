package com.baobaotao.domain;
/**
 * Date:     2017年4月12日 下午3:12:29
 * @author   maskwang 
 * @since    JDK 1.6
 */
public class Artical {
    private int id;
    private Student stu;
    private String title;
    private String content;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Student getStu() {
		return stu;
	}
	public void setStu(Student stu) {
		this.stu = stu;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	@Override
	public String toString() {
		return "Artical [id=" + id + ", stu=" + stu + ", title=" + title + ", content=" + content + "]";
	}
    
}
