package fsa

class Matrix2D(val initialState: Int, val terminalState:Int, var nextState: Int) {
  val table = Array(0,1,3,6,7,4)

  val error = -1; val init = 0; val accept = 2
  var currentState = 0

  for (i <- table) {
    if(currentState == init) {
      if(i != 3) throw new Exception("Invalid initial state")

    }
  }
}