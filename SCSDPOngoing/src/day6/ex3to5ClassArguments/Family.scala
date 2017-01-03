package day6.ex3to5ClassArguments

class Family (val listnames: String*) {
  
  def familySize() : Int = {
    listnames.size
  }
   
}