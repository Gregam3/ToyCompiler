package lexer

import java.util.StringTokenizer

import scala.collection.mutable

object Lexer {
  def lex(code: String): mutable.Queue[Token] = {
    var tokens = mutable.Queue[Token]()
    val st = new StringTokenizer(code, "(){}, ", true)

    while (st.hasMoreTokens) tokens += matchToken(st.nextToken)

    tokens.filter(_ != null)
  }

  def matchToken(sToken: String): Token = {
    sToken match {
      case "def" => new T_Def
      case "(" => new T_LeftBracket
      case ")" => new T_RightBracket
      case "," => new T_Comma
      case "=" => new T_Equals
      case "==" => new T_Equal
      case "{" => new T_LeftCBracket
      case "}" => new T_RightCBracket
      case "if" => new T_If
      case "then" => new T_Then
      case "else" => new T_Else
      case "def" => new T_Def
      case " " => null
      case _ =>
        if (sToken.matches("[0-9]+")) new T_Int(sToken.toInt)
        else if (sToken.matches("[A-Za-z_0-9]+")) new T_Identifier(sToken)
        else throw new Exception(s"Token $sToken invalid")
    }
  }

  def main(args: Array[String]): Unit = {
    print(lex("def f(x,y,z) = { if x == y then { z } else { 0 } }"))
  }
}