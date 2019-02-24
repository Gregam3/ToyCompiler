import lexer.{T_LeftCBracket, Token}

import scala.collection.mutable

object RDParser {
  var tempEaten = mutable.Stack[Token]

  def parse(tk: Token, rest: mutable.Queue[Token]) = {

  }
}