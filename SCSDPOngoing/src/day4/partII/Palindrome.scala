package day4.partII

object Palindrome {
  
  def isPalindrome (string : String) : Boolean = {
    var forward = string.toList
    var backward = forward.reverse
    for ( i <- 0 to (forward.length-1)){
			if (forward(i) != backward(i)) {
					return false
			}
		}     
    return true  
  }
  
      //if (forward(i) != backward(i)) {
        //result = false
        //return resul
      //}
    //}
  //}
  
  
  
  
}