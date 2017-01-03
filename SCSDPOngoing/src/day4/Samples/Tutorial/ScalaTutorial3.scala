package day4.Samples.Tutorial

object ScalaTutorial3 {
  
  def main (args: Array[String]): Unit = {
     
     println("Welcome to Scala Tutorial III ")
     
     var i = 0
     
     def divideNums(num1 : Int, num2 : Int) = try {
			(num1/num2)
		} catch {
			case ex : java.lang.ArithmeticException => "Can't divide by 0"
		} finally {
			// Clean up after exception
		}
	
	
		println(" 3 / 0 " +divideNums(3,0))
		
	
		/*
		val writer = new PrintWriter("test2.txt")
		writer.write("I am writing on Scala for the second time \n I hope this is easier than Java")
		writer.close()
		
		val textFromFile = Source.fromFile("test2.txt","UTF-8")
		
		val lineIterator = textFromFile.getLines
		
		for (line <- lineIterator)
			println(line)
	
		textFromFile.close()
		*/
	
	
		/*
		val log10Func = log10 _
		
		println(log10Func(1000))
		
		List(1000.0,10000.0).map(log10Func).foreach(println)
		
		List(1,2,4,5).map((x : Int) => x * 50).foreach(println)
		
		List(1,2,3,4,5,6).filter(_ % 2 == 0).foreach(println)
		
		def times3 (num: Int) = num * 3
		def times4 (num: Int) = num * 4
		
		def multIt(func : (Int) => Double, num : Int ) = {
			func(num)
		}
		
		printf("3 * 100 = %.1f\n", multIt(times3,100))
		
		printf("4 * 100 = %.1f\n", multIt(times4,100))
		
		val divisorVal = 5
		
		val divisor5 = (num: Double ) => num / divisorVal
		
		println("5 / 5 " +divisor5(5.0))
		
		*/
	
		/*
		val superman = new Superhero("Superman")
		
		println(superman.fly)
		println(superman.hitByBullet)
		println(superman.ricochet(2500))
	
		*/
	
		/*
		
		val fang = new Wolf("Fang")
		fang.moveSpeed = 36.0
		println(fang.move)
		
		*/
	
		/*
		
		val rover = new Animal
		rover.setName("Rover")
		rover.setSound("Woof")
		printf("%s says %s\n", rover.getName, rover.getSound)
	
		var whiskers = new Animal("Whiskers","Meouw")
		println(s"${whiskers.getName} with id ${whiskers.id} says ${whiskers.getSound}")
		
		println(whiskers.toString)
		
		val spike = new Dog("Spike","Wolf","grrr")
		spike.setName("Spike45")
		println(spike.toString)
		
		*/
		
		/*
		var tupleMarge = (103, "Margareth Thatcher" , 10.25)
		
		printf("%s owes us $%.2f\n", tupleMarge._2, tupleMarge._3)
		
		tupleMarge.productIterator.foreach{i => println(i)}
		
		println(tupleMarge.toString())
		*/
		
		
		
		/*
		val employees = Map("Manager" -> "Bob Smith",
		"Secretary" -> "Sue Brown")
		
		if(employees.contains("Manager"))
			printf("Manager : %s\n",employees("Manager"))
		
		val customers = collection.mutable.Map(100 -> "Paul Smith",
		101 -> "Sally Smith"
		)
		
		printf("Cust 1: %s\n", customers(100) )
		
		customers(100) = "Tom Marks"
		customers(102) = "Megan Swift"
		
		for ((k,v) <- customers)
			printf("%d : %s\n ", k, v)
		
		*/
		
		
		/*
		val favNums = new Array[Int](20)
		val friends = Array("Bob","Tom")
		friends(0) = "Sue"
		println("Best friends " +friends(0))
		val friends2 = ArrayBuffer[String]()
		
		friends2.insert(0,"Phil")
		friends2 += "Mark"
		friends2 ++ Array("Susy","Paul")
		friends2.insert(1,"Mike","Mary","Sue","Ale","Bibio")
		friends2.remove(1,2)
		
		var friend : String = " "
		
		for (friend <- friends2)
			println(friend)
		
		for (j <-0 to (favNums.length -1)) {
			favNums(j) = j
			println(favNums(j))
		}
		
		val favNumsTimes2 = for (num <- favNums) yield 2 * num
		
		favNumsTimes2.foreach(println)
		
		var favNumsDiv4 = for(num <- favNums if num % 4 == 0) yield num
		
		favNumsDiv4.foreach(println)
		
		var multTable = Array.ofDim[Int](10,10)
		
		for (i <-0 to 9){
			for (j<-0 to 9){
				multTable(i)(j) = i*j
			}
		}
		
		for (i <-0 to 9){
			for (j<-0 to 9){
				printf("%d : %d = %d\n", i, j, multTable(i)(j) )
			}
		}
		
		println("Sum :"  +favNums.sum)
		println("Min :"  +favNums.min)
		println("Max :"  +favNums.max)
		
		val sortedNums = favNums.sortWith(_>_)
		val sortedNums2 = favNums.sortWith(_<_)
		
		println(sortedNums.deep.mkString(", "))
		
		*/
		
		
		
		
		
		
		
		/*
		def factorial (num : BigInt) :BigInt = {
			if (num <=1)
				1
			else
				num * factorial (num -1)
		}
		
		println("The factorial of 4 = "  +factorial(4))
		*/
		
		
		/*
		def getSuma(args : Int* ) :Int = {
			var sum : Int = 0
			for (num <- args) {
				sum +=num
			}
			sum
		}
		
		println("Get Sum "  +getSuma(1,2,3,4,5,6,7))
		
		
		def sayHi(){
			println("Hi how are you")
		}
		
		sayHi
	
		*/
		
		/*
		def getSum(num1 : Int = 1, num2: Int = 1) :Int = {
			return num1 + num2
		}
		
		println("5 + 4 = " +getSum(5,4))
		println("5 + 4 = " +getSum(num2=5,num1=4))
		*/
		
		
		//def functName (param1:dataType, param2:dataType) :returnType = {
		//	function body
		//	return valueToReturn
		//}
		
		/*
		var randSent = "I saw a dragon fly by"
		println("3rd index :"  +randSent(3))
		println("String lenght: " +randSent.length)
		println(randSent.concat(" and explode"))
		println("Are strings equal " +"I saw a dragon".equals(randSent))
		println("dragon starts at index " +randSent.indexOf("dragon"))
		val randSentArray = randSent.toArray
		for (v <- randSentArray)
			println(v)
		*/
		
		/*
		%c for characters
		%d for integers
		%f for floating point numbers
		%s  for strings
		*/
		
		/*
		printf("'%5d'\n",10)
		printf("'%05d'\n",10)
		printf("'%.5f'\n",10.14)
		printf("'%-10s'\n","hi")
		printf("'%-5d'\n",10)
		
		\ b for backspace 
		*/
		
		/*
		val name = "Derek"
		val age = 39
		val weight = 175.5
		println(s"Hello $name")
		println(f"I am ${age + 1}  and weigh $weight%.2f")
		*/
		
		/*
		var numberGuess = 0
		do {
			print("Guess a number ")
			numberGuess = readLine.toInt
			//readInt readDouble readByte
			//readShort readLong
		} while (numberGuess != 15)
		
		printf("You guess the secret number %d\n", 15)
		
		*/
		
		
		
		/*
		def printPrimes(){
			val primeList = List(1,2,3,5,7,11)
			for (i<- primeList) {
				if (i == 11) {
					return
				}
				if (i != 1){
					println(i)
				}
			}	
		}	
		
		printPrimes
		*/
	
		
		
		/*
		for ( i <- 1 to 5; j<- 6 to 10){
			println("i: " +i)
			println("j: " +j)
		}
		*/
		
		/*
		var evenList = for { i <- 1 to 20
			 if (i%2) == 0
		} yield i
		
		for (i <-evenList)
		println(i)
		*/
		
		/*
		val aList = List(1,2,3,4,5)
		
		for (i <- aList){
			println("List items " +i)
		}
		*/
		
		/*
		val randLetters = "ABCDEFGHKLKMZ"
		for (i <- 0 until randLetters.length)
			println(randLetters(i))
		*/	
		
		
		for (i <- 1 to 10)
			println(i)
		
		
		/*
		do {
			println(i)
			i +=1
		} while (i <=20)
		*/
		
		
		/*
		while (i <= 10) {
			println(i)
			i +=1
		}
		*/   
         
   }
  
  	class Animal(var name: String, var sound: String ) {
		
  	this.setName(name)
		
		val id = Animal.newIdNum
		
		def getName(): String = name
		def getSound(): String = sound
		
		def setName(name: String) {
			if(!(name.matches(".*\\d+.*")))
				this.name = name
			else
				this.name =" No Name"
		}
		
		def setSound(sound: String){
			this.sound = sound
		}
		
		def this(name : String){
			this("No Name","No Sound")
			this.setName(name)
		}
		
		def this(){
			this("No Name","No Sound")
		}
		
		override def toString() :String = {
			return "%s with the id %d says %s".format(this.name,this.id,this.sound)
		}
		
		//protected var name = "No Name"
	
	}
	
	object Animal {
		
		private var idNumber = 0
		private def newIdNum = { idNumber += 1 ; idNumber}
		
	}
	
	class Dog (name: String, sound : String, growl: String) extends Animal (name, sound){
	
		def this(name: String, sound: String){
			this("No mame",sound,"No Growl")
			this.setName(name)
		}
		
		def this(name: String){
			this("No name","No Sound","No Growl")
			this.setName(name)
		} 
		
		def this(){
			this("No name","No sound","No growl")
		}
	
		override def toString(): String = {
			return "%s with the id %d says %s or %s".format(this.name,this.id,this.sound,this.growl)
		}
		
		
	}
	
	abstract class Mammal (val name : String){
	
		var moveSpeed : Double
		
		def move : String
	
	}
	
	class Wolf(name: String) extends Mammal(name){
		
		var moveSpeed = 35.0
		
		def move =" The wolf %s runs %.2f mph".format(this.name,this.moveSpeed)
	
	}
	
	trait Flyable {
	
		def fly : String
		
	}
	
	trait BulletProof {
	
		def hitByBullet : String
		
		def ricochet(startSpeed : Double ) :String = {
			"The bullet is going to ricochet at a speed of %.1f ft/sec".format(startSpeed * .75)
		}
		
	}
	
	class Superhero (val name: String) extends Flyable with BulletProof {
	
		def fly = " %s flys thru the air".format(this.name)
		
		def hitByBullet = "The bullet bounces off of %s".format(this.name)  
	
	}
  
  
}