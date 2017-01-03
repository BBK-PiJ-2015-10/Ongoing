package day4.partII

object Forecast {
  
  def forecast(temperature : Int) : String = {
    temperature match {
      case 100 => "Sunny"
      case 80  => "Mostly Sunny"
      case 50  => "Partly Sunny"
      case 20  => "Mostly Cloudly"
      case 0   => "Cloudly"
      case _   => "Unknown"  
    }
  }
  
}