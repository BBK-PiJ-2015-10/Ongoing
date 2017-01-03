package day6.ExtraExercises.exer3


class Counter (var count: Int) {
    
  def inc (input: Int = 1) : Counter = {
    new Counter(count+input)
  }
  
  def dec (input: Int = 1) : Counter = {
    new Counter(count+input)
  }
  
  def adjust(input: Adder ) : Counter = {
    new Counter(input.add(count))
  }
  
}