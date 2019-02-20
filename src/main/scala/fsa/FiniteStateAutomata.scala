package fsa

//fsa for Regex 3(45)*5
object FiniteStateAutomata  {
  val table = Array(3,4,4,5,5,5,5,5)

  //init = 0, accept = 1, terminal = 2
  var currentState = 0

  def doesAccept:Boolean = {
    for (v <- table) {
      currentState match {
        case 0 => if (v != 3) return false else currentState = 1
        case 1 => if (v == 5) currentState = 2 else if (v != 4) return false
        case 2 => if (v == 4) currentState = 1 else if (v != 5) return false
      }
    }
    currentState == 2
  }

    def main(args: Array[String]): Unit = {
      print(doesAccept)
    }
}