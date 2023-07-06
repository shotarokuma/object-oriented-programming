package oop.Student;

public class GraduateStudent extends Student {
  public GraduateStudent(String name, Integer id) {
    super(name, id);
  }

  @Override
  public void introduction() {
    System.out.println(getId() + ": I am " + getName());
  }

  @Override
  public void study() {
    System.out.println(getId() + ": I am " + getName());
  }

  @Override
  public void eat() {
    System.out.println(getName() + " is eating as a graduate student.");
  }

  @Override
  public void sleep() {
    System.out.println(getName() + " is sleeping as a graduate student.");
  }
}
