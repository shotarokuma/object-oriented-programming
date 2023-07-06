package oop.Student;

public class InternationalStudent extends Student {
  private String country;

  public InternationalStudent(String name, Integer id, String country) {
    super(name, id);
    this.country = country;
  }

  @Override
  public void introduction() {
    System.out.println(getId() + ": I am " + getName() + "from" + this.country);
  }

  @Override
  public void study() {
    System.out.println(getId() + ": I am " + getName() + "from" + this.country);
  }

  @Override
  public void eat() {
    System.out.println(getName() + " is eating as an international student.");
  }

  @Override
  public void sleep() {
    System.out.println(getName() + " is sleeping as an international student.");
  }
}
