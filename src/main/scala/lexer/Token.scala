package lexer

trait Token {
  override def toString = this.getClass.getName
}

class T_Def extends Token; class T_Identifier(name: String) extends Token; class T_LeftBracket extends Token; class T_Equal extends Token
class T_RightBracket extends Token; class T_Comma extends Token; class T_Equals extends Token; class T_LeftCBracket extends Token
class T_RightCBracket extends Token; class T_If extends Token; class T_Then extends Token; class T_Else extends Token; class T_Int(value: Int) extends Token