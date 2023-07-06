package oop.Student;

public abstract class Student implements Human {
  private String name;
  private Integer id;

  public Student(String name, Integer id) {
    this.name = name;
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public Integer getId() {
    return id;
  }

  public abstract void introduction();

  public abstract void study();
}