package day6.ex11Constructors

object ConstructorScriptTest extends App {
  
  val tea = new Tea
  assert(tea.describe == "Early Grey")
  assert(tea.calories == 0)
  
  val lemonZinger = new Tea(name="Jasmine Green", sugar = true)
  assert(lemonZinger.describe == "Jasmine Green + sugar")
  assert(lemonZinger.calories == 16)
  
  val teaLatte = new Tea(sugar=true,milk=true)
  assert(teaLatte.describe == "Early Grey + sugar + milk")
  assert(teaLatte.calories == 116)
   
  
}