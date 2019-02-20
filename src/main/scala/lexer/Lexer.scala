package lexer

import java.util.StringTokenizer

import scala.collection.mutable

object Lexer {
  def lex(code: String): mutable.Queue[Token] = {
    var tokens = mutable.Queue[Token]()
    val st = new StringTokenizer(code)

    while (st.hasMoreTokens) tokens += matchToken(st.nextToken)

    tokens
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
      case sToken.isInstanceOf[Int] => new T_Int()
    }
  }
}
