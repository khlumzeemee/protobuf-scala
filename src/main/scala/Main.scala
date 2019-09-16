import person.Person
import oneoffields.Order
import oneoffields.CreditCardPayment
import enumP.{Forecast, Weather}

object Main extends App {
  println("Hello, protobuf!")


  val p = Person(name = "ax", id = 123, email = Some("a@f.fr"))

  val pWith = Person(name = "John", id = 29).withEmail("a@b.c")

  val o = Order().withCreditCard(CreditCardPayment().withLast4("4848"))

  val o2 = Order().update(
  _.creditCard.last4 := "4848")

  //Enum
  val f = Forecast().update(_.weather := Weather.PARTLY_CLOUDY)

  assert(f.weather == Some(Weather.PARTLY_CLOUDY))
}