package oop.student

trait Human {
  def eat(): Unit
  def sleep(): Unit
}

abstract class Student(private val name: String, private val id: Int) extends Human {
  def introduction(): Unit
  def study(): Unit
  private def getName(): String = name
  private def getId(): Int = id
}

class InternationalStudent(name: String, id: Int, private val country: String) extends Student(name, id) {
  override def introduction(): Unit = {
    println(s"${getId()}: I am ${getName()} from $country")
  }

  override def study(): Unit = {
    println(s"${getId()}: ${getName()} is studying from $country")
  }

  override def eat(): Unit = {
    println(s"${getName()} is eating as an international student.")
  }

  override def sleep(): Unit = {
    println(s"${getName()} is sleeping as an international student.")
  }
}

case class GraduateStudent(name: String, id: Int) extends Student(name, id) {
  override def introduction(): Unit = {
    println(s"${getId()}: I am ${getName()}")
  }

  override def study(): Unit = {
    println(s"${getId()}: ${getName()} is studying")
  }

  override def eat(): Unit = {
    println(s"${getName()} is eating as a graduate student.")
  }

  override def sleep(): Unit = {
    println(s"${getName()} is sleeping as a graduate student.")
  }
}

object Main {
  def main(args: Array[String]): Unit = {
    val graduateStudent: Human = GraduateStudent("John", 1)
    graduateStudent.eat()
    graduateStudent.sleep()

    val internationalStudent: Human = InternationalStudent("Emma", 2, "China")
    internationalStudent.eat()
    internationalStudent.sleep()

    val graduateStudent2: GraduateStudent = graduateStudent.asInstanceOf[GraduateStudent]
    val internationalStudent2: InternationalStudent = internationalStudent.asInstanceOf[InternationalStudent]

    graduateStudent2.study()
    internationalStudent2.study()

    // println(graduateStudent2.id)
  }
}
