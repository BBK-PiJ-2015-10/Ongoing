package day6.ExtraExercises.exer1


class Counter (var count: Int) {
    
  def inc : Counter = {
    new Counter(count+1)
  }
  
  def dec  : Counter = {
    new Counter(count-1)
  }
  
}