
object Message{
  val loweMap= Map(
   't'->'7',
    'i'->'1',
    's'->'5',
    'e'->'3',
    'a'->'4',
    'o'->'0',
    'h'->'2'
  )
val upperMap = loweMap.map{
    case(k,v) => k.toUpper -> v
  }
  val allMap= (loweMap ++ upperMap).withDefault(k=>k )

  println("Welcome to The company!".map(allMap))
}






