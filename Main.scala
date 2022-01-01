import scala.::

object Main {
  def main(args: Array[String]): Unit = {
    println(Stack.empty[Int].push(1).push(2).average)
  }
}