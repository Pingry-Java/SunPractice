import java.util.ArrayList;
public class Course{
 private ArrayList<Student> students = new ArrayList<Student>(); 
 private ArrayList<Integer> grades = new ArrayList<Integer>(); 
 private String title; 
 private String teacher; 
 
 
 public Course(){
  title = "No Title Given";
  teacher = "No Teacher Given";
 }
 public Course(String title, String teacher){
  this.title = title;
  this.teacher = teacher; 
 }
 
 public int averageGrade(){
  int total = 0; 
  for (int n = 0; n < grades.size(); n++){
   total += grades.get(n);
  }
  return total / grades.size();
 }
 
 public int getEnrollment(){
  return students.size();
 }
 
 public void enrollStudent(Student student){
  students.add(student); 
 }
 
 public String toString(){
  return "Title: " + title + " Teacher: " + teacher; 
 }
 
 public String title(){
  return title;
 }
 
 public String teacher(){
  return teacher; 
 }
 public ArrayList<Student> students(){
  return students; 
 }
 
 public ArrayList<Integer> grades(){
  return grades; 
 }
}