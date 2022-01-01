object Stack {

  def empty[A] : StackUnit[A] = {
    new StackClass[A]()
  }
}