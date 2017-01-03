package day4.partII


object Answers {
    
  def main (args: Array[String]): Unit = {
    
    println("Trying again and forward")
    
    println("Using calcs 1 input are Int")
    println(calc.square(4))
    println(calc.cube(4))
    
    println("Using calcs 2 input are Int")
    println(calc2.square(4))
    println(calc2.cube(4))
    
    println("Using calcs 2 input are doubles")
    println(calc2.square(4.0))
    println(calc2.cube(4.0))
    
    
    println(argh.c + argh.b + argh.a)
    
    
    //Question # 14
    
    
    val r1 = Range(0,10)
    
    //Question # 15
    
    var exer15 : Int = {
      var result = 0
      for (i <- r1.inclusive) {
        result = result + i
      }
      result
    }
    
    assert(exer15 == 55)
    //The exer15 can be val or var, however, the cumulative result needs to be defined as a var.
    
    // Question 16
    var exer16 : Int = {
      var result = 0
      for (i <- r1.inclusive) {
        if (i % 2 == 0 ) {
          result = result + i
        }
      }
      result
    }
    
    assert(exer16 == 30)
    
    //Question 17
    
    var sumeven = 0
    var sumodd = 0
    
    var exer17 : Int = {
      for (i <- r1.inclusive) {
        if (i % 2 == 0 ) {
          sumeven = sumeven + i
        }
        else {
          sumodd = sumodd + i
        }
      }
      sumeven + sumodd
    }
    
    assert(sumeven == 30)
    assert(sumodd == 25)
    assert(exer17 == 55)
    
    //Question 18
    
    var exer18 = Vector("The","dog","visited","the","firehouse")
    
    var sentence : String = ""
    for (i <- exer18 ){
       sentence +=i +" "      
    }
    
    assert(sentence.toString() == "The dog visited the firehouse ")
    
    assert(sentence.replace("firehouse ","firehouse!").toString() == "The dog visited the firehouse!")
    
    //Question19
    
    var sentence19 : String = ""
    for (i <- exer18 ){
      sentence19 +=i.reverse +" "      
    }
      
    assert(sentence19.toString() == "ehT god detisiv eht esuoherif ")
    
    
    //Question20
    
    var sentence20 : String = ""
    for (i <- exer18.reverse ){
       sentence20 +=i +" "      
    }
    
    assert(sentence20.toString() == "firehouse the visited dog The ")
    
    //Question21
    
    var vectInts = Vector (1,2,3,4,5)
    var vectDoubs = Vector(1.0,2.0,3.0,4.0,5.0)
    
    vectInts.sum
    vectInts.min
    vectInts.max
    
    vectDoubs.sum
    vectDoubs.min
    vectDoubs.max
    
    var vectStrings = Vector("first","second","third","fourth","fifth")
    
    println(vectStrings.min)
    println(vectStrings.max)
    //println(vectStrings.sum)
    //The sum doesn't work, since it is not a number. We can't sum Strings.
    
    var intRange = Range(0,10)
    
    intRange.sum
    //Yes, it does it all in one step.
    
    //Question 22
    
    val listInts = List (1,2,3,4,5,6,7,8,9,10)
    
    val listInts2 = listInts ++ List(9,10,13,14,15)
    
    println(listInts.head)
    println(listInts.tail)
    println(listInts.last)
    println(listInts.reverse)
    println(listInts.sum)
    println(listInts.max)
    println(listInts.min)
    
    
    listInts :+45
    println(listInts :+45)
    println(45+: listInts)
    
    println(listInts.drop(3))
    println(listInts.dropRight(3))
    println(listInts.take(3))
    println(listInts.takeRight(3))
    println(listInts.slice(4,8))
    println(listInts(4))
    println(listInts.contains(5))
    println(listInts.indexOf(2))
    println(listInts2)
    println(listInts2.distinct.sorted)
    println(listInts2.intersect(listInts))
    println(listInts2)
    println(listInts2.toSet)
    println(listInts.product)
    println(listInts)
    
    //Exercise 23
    
    assert(Palindrome.isPalindrome("mum") == true)
    assert(Palindrome.isPalindrome("dad") == true)
    assert(Palindrome.isPalindrome("street") == false)
    
    //Exercise 24
    
    assert(Forecast.forecast(100) == "Sunny")
    assert(Forecast.forecast(80) == "Mostly Sunny")
    assert(Forecast.forecast(50) == "Partly Sunny")
    assert(Forecast.forecast(20) == "Mostly Cloudly")
    assert(Forecast.forecast(0) == "Cloudly")
    assert(Forecast.forecast(15) == "Unknown")
    
    
    //Exercise25
    
    val t = new SimpleTime(hours = 5, minutes = 30)
    
    assert(t.hours == 5)
    assert(t.minutes == 30)
    
    //Exercise26
    
    val t2 = new SimpleTime2(hours = 10)
    
    assert(t2.hours == 10)
    assert(t2.minutes == 0)
    
    //Exercise27
    
    val p = new Planet (name = "Mercury", description="small and hot planet", moons = 0)
    assert(p.hasMoon() == false)
    
    
  }
  
  
}