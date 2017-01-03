package day6.ExtraExercises.exer9CaseClasses

case class Counter (var count: Int) {
    
  def inc (input: Int = 1) : Counter = {
    Counter(count+input)
  }
  
  def dec (input: Int = 1) : Counter = {
    Counter(count+input)
  }
  
  def adjust(input: Adder ) : Counter = {
    Counter(input.add(count))
  }
  
}