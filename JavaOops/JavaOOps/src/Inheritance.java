public class Inheritance {
  public static void main(String args[]){
    Student s = new Student();
    School sc = new School();
    s.getBasicInfo("Bareilly UP","CBSE Board",12);
    s.getStudentName("Dhiraj kumar");
    LittleStudents sl = new LittleStudents();
    sl.getBasicInfo("Secondary liitel academy","CBSE",10);
    sl.getStudentName("Rahi");
    sl.getLittleStudent(7, 1, "Little");
    sl.hobby = "Cricket";
    
  }
}
class School{
  String address;
  String typeOfSchool;
  int highestEducation;
 
  public void getBasicInfo(String add,String type, int heducation){
    this.address = add;
    this.typeOfSchool = type;
    this.highestEducation = heducation;
    System.out.println(this.address);
    System.out.println(this.typeOfSchool);
    System.out.println(this.highestEducation);
  }
}
class Student extends School{
  public String studentName;
public void getStudentName(String n){
  this.studentName = n;
  System.out.println(this.studentName);
}

}
class LittleStudents extends Student{
   String hobby;
 public void getLittleStudent(int age, int clss,String level){
  System.out.println(clss+" "+age+" "+level);
 }
}