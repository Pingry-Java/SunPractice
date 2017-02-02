public class Student{ 
 public String name;
 public int age;
 public static int oldestStudent = 0; 
 
 public Student(){
  name = "No Name Given";
  age = 15;
  if (age > oldestStudent)
   oldestStudent = age; 
 }
 public Student(int age){
  this.age = age; 
  name = "No Name Given";
  if (age > oldestStudent)
   oldestStudent = age; 
 }
 public Student(String name){
  age = 15;
  this.name = name; 
  if (age > oldestStudent)
   oldestStudent = age; 
 } 
 public Student(String name, int age){
  this.age = age;
  this.name = name;
  if (age > oldestStudent)
   oldestStudent = age; 
 }
 public int age(){
  return age; 
 }
 public String toString(){
  return this.name; 
 }
 
 
 public void haveBirthday(){
  age++; 
 } 
}