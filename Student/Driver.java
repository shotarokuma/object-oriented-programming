package oop.Student;

public class Driver {
  public static void main(String[] args) {
    Human graduateStudent = new GraduateStudent("John", 1);
    graduateStudent.eat();
    graduateStudent.sleep();

    Human internationalStudent = new InternationalStudent("Emma", 2, "China");
    internationalStudent.eat();
    internationalStudent.sleep();

    GraduateStudent graduateStudent2 = (GraduateStudent) graduateStudent;
    InternationalStudent internationalStudent2 = (InternationalStudent) internationalStudent;

    graduateStudent2.study();
    internationalStudent2.study();

    // System.out.println(graduateStudent.id);
  }
}
