package fsa

object FiniteStateAutomata {
  //fsa for Regex 3(45)*5
  def doesAccept(table: Array[Int]): Boolean = {
    //init = 0, accept = 1, terminal = 2
    var currentState = 0

    for (v <- table) currentState match {
      case 0 => if (v == 3) currentState = 1 else return false
      case 1 => if (v == 5) currentState = 2 else if (v != 4) return false
      case 2 => if (v == 4) currentState = 1 else if (v != 5) return false
    }

    currentState == 2
  }

  def main(args: Array[String]): Unit = {
    print(doesAccept(Array(3, 4, 4, 5, 4, 5, 5, 5)))
  }
}