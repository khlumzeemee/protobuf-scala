import person.Person
object Main extends App {
  println("Hello, protobuf!")

  val p = Person(name = "ax", id = 123, email = Some("a@f.fr"))

  val pWith = Person(name = "John", id = 29).withEmail("a@b.c")
}