package OOPS2

//Person Class mixed with Ordered Trait
class Person(val name: String, val age: Int) extends Ordered[Person]{

  //  Comparing name parameter
  def compare(that: Person): Int ={

    if(that.name == this.name)
      this.age.compare(that.age)

    else this.name.compare(that.name)
  }
}


object Person{

  def main(args: Array[String]): Unit = {

    //comparing using age
    val p1 = new Person("Test", 24)
    val p2 = new Person("Test", 25)
    println(p1<p2)

    //comparing using name length
    val p3 = new Person("TestAgain", 24)
    val p4 = new Person("Test", 25)
    println(p3<p4)

  }


}