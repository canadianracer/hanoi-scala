package ca.morinfamily.hanoi

object Hanoi {
    
    
  def move[T](n: Int, from: T, to: T, via: T)(implicit next: List[(T,T)] = Nil): List[(T,T)] =
    n match {
      case 0 => next
      case 1 => (from -> to) :: next
      case _ => move(n - 1, from, via, to)  {
                  move(1, from, to, via) {
                    move(n-1, via, to, from)
                  }
                }
    }
}

