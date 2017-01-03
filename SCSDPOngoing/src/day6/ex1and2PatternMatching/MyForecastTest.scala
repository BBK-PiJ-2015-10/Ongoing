package day6.ex1and2PatternMatching

object MyForecastTest extends App {

  def forecast(temperature: Int) : String = {
    temperature match {
      case 100 => "Sunny"
      case 80  => "Mostly Sunny"
      case 50  => "Partly Sunny"
      case 20  => "Mostly Cloudy"
      case 0   => "Cloudy"
      case _   => "Unknown"
    }
  }
  
  
  //Tests to answer question 1
  
  assert(forecast(100) == "Sunny")
  assert(forecast(80) == "Mostly Sunny")
  assert(forecast(50) == "Partly Sunny")
  assert(forecast(20) == "Mostly Cloudy")
  assert(forecast(0) == "Cloudy")
  assert(forecast(35) == "Unknown")

  
 //Answer to part 2
  
  val sunnyData = Vector(100,80,50,20,0,15)
  for (i <- sunnyData ) {
    println(forecast(i))    
  }
  
  
}