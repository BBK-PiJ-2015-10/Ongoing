package day8.Chapter13Iterators

object Chapter13IteratorsScript extends App {
  
  val it :Iterator[Int] = Iterator.range(1,100)
  while (it.hasNext) {
    val x = it.next
    println(x*x)
  }
  
  
  
}