import scala.language.higherKinds
import scala.math.Numeric.Implicits.infixNumericOps

trait StackUnit[A] {
  def elements: List[A]

  def push(x: A): StackUnit[A]

  def peek: A = elements.head

  def pop(): StackUnit[A]

  def average(implicit e: Numeric[A]) : Double
}

class StackClass[A](val element: List[A] = Nil) extends StackUnit[A] {

  override def elements: List[A] = element

  override def push(x: A): StackUnit[A] = new StackClass[A](x +: elements)

  override def pop(): StackUnit[A] = new StackClass[A](elements.tail)

  override def average(implicit e: Numeric[A]): Double = {
    val sum = elements.sum
    sum.toDouble/elements.size
  }
}