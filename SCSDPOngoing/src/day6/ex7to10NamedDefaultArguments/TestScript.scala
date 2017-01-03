package day6.ex7to10NamedDefaultArguments

object TestScript extends App {
  
  //Test for question 6
  
  val t = new SimpleTime(hours=5,minutes=30)
  
  assert(t.hours == 5)
  assert(t.minutes == 30)
  
  //Test for question 7
  
  val t2 = new SimpleTime2(hours=10)
  
  assert(t2.hours == 10)
  assert(t2.minutes == 0)
  
  //Test for question 8
  
  val p = new Planet(name ="Mercury", description = "small and hot planet", moons = 0)
  assert(p.hasMoon == false)
  
  //Test for question 9
  
  val earth = new Planet(moons=1,name="Earth",description="a hospitable planet")
  assert(earth.hasMoon == true)
  
  //Test for question 10
  
  val flour = new Item(name="flour",4)
  assert(flour.cost(grocery=true)==4.0)
  
  val sunscreen = new Item(name="sunscreen",3)
  assert(sunscreen.cost() == 3.3000000000000003)
  
  val tv = new Item(name="television",500)
  assert(tv.cost(taxRate = 0.06) == 530.0)
 
  
  
  
}