package datastructures

class MyHeapPriorityQueue[A: Manifest](higherPriority: (A,A) => Boolean) extends MyPriorityQueue[A] {
  
  private var heap = new Array[A](10)
  
  private var back = 1
  
  def enqueue(o: A): Unit = {
    if(back==heap.length) {
      val temp = new Array[A](heap.length*2)
      for (i <-1 until heap.length) temp(i) = heap(i)
      heap = temp
    }
    var bubble = back
    while( bubble>1 && higherPriority(o,heap(bubble/2)) ) {
      heap(bubble) = heap(bubble/2)
      bubble / 2  
    }
    heap(bubble)=o
    back +=1     
  }
  
  def dequeue(): A = {
    val ret = heap(1)
    back -=1
    val temp = heap(back)
    var stone = 1
    var flag = true
    while(stone*2<back && flag){
      var priorityChild = stone*2
      if (stone*2<back && higherPriority(heap(stone*2+1),heap(stone*2))){
        priorityChild +=1
      }
      if(higherPriority(heap(priorityChild),temp)){
        heap(stone) = heap(priorityChild)
        stone = priorityChild
      } else {
        flag = false
      }
      heap(stone)= temp
    }
    ret
  }
  
  def isEmpty: Boolean = back == 1
  
  def peek: A = heap(1)
  
}