package com.study.spring.case2;


import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.ToIntFunction;

public class Teacher {
  private Integer id ;
  private String name ;
  private Set<Student> students;
  private List<String> subjects;
  private Map<String, Integer> salary;
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Set<Student> getStudents() {
	return students;
}
public void setStudents(Set<Student> students) {
	this.students = students;
}

public List<String> getSubjects() {
	return subjects;
}
public void setSubjects(List<String> subjects) {
	this.subjects = subjects;
}


public Map<String, Integer> getSalary() {
	return salary;
}
public void setSalary(Map<String, Integer> salary) {
	this.salary = salary;
}
@Override
public String toString() {
	return "Teacher [id=" + id + ", name=" + name + ", students=" + students + ", subjects=" + subjects + ", salary="
			+ salary + "]";
}

 public int  getTotalCreadits() {
	 int total=0;
	 if (students !=null) {
	 ToIntFunction<Student> fun1 = (s) ->s.getClazzs().stream()
	.mapToInt(c ->c.getCredit()).sum();	
	total=students.stream().mapToInt(fun1).sum();
	 }
	 return total;
 } 

}
