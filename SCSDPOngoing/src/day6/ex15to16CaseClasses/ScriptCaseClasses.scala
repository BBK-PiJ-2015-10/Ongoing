package day6.ex15to16CaseClasses

object ScriptCaseClasses extends App {
  
  //Question15
  
  val p = Person("Jane","Smile","jane@smile.com")
  assert(p.first == "Jane")
  assert(p.last == "Smile")
  assert(p.email == "jane@smile.com")
  
  //Question16
  
  val people = Vector(Person("Jane","Smile","jane@smile.com"),Person("Ron","House","ron@house.com"),Person("Sally","Dove","sally@dove.com"))
  assert (people(0) == Person("Jane","Smile","jane@smile.com"))
  assert (people(1) == Person("Ron","House","ron@house.com"))
  assert (people(2) == Person("Sally","Dove","sally@dove.com"))
  
  
}