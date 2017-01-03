package Review.secondRevision


  object Exer8 extends App  {
  
  def all_except_option(str: String, lst: List[String]): Option[List[String]] =
    lst match {
      case List() => None
      case hd :: tl => 
        if (str == hd) 
          Some(tl)
        else {
          all_except_option(str,tl) match {
            case None => None
            case Some(y) => Some(hd :: y)
        }
    }   
  }
 
    def getSub1(lst:List[List[String]],str:String) : List[String] =
       lst match {
      case Nil =>Nil
      case x :: xs =>
        all_except_option(str,x) match {
          case None => getSub1(xs,str)
          case Some(y)=> y::: getSub1(xs,str)
        }
    }
    
    def getSub2(lst:List[List[String]],str:String) : List[String] = {
      
      def helper(acc: List[String],subs:List[List[String]]) : List[String] =
        subs match {
        case Nil =>acc
        case x :: xs =>
          all_except_option(str,x) match {
            case None => helper(acc,xs)
            case Some(y)=> helper(y:::acc,xs)
          }
        }
      helper(List(),lst)       
    }
    
    type Name = (String,String,String)
    
    def similar_name(subs:List[List[String]], name:Name) : List[Name] = {
      val (first, middle,last) = name
      def makeNames(lst:List[String]): List[Name] = 
        lst match {
          case Nil => Nil
          case x:: xs => List((x,last, middle)) ::: makeNames(xs)
      }
      name :: makeNames(getSub2(subs,first))
      
    }
    
    
    //This is my practice
    
    abstract class BST
    
    case class Node(left: BST, value: Int, Right: BST) extends BST
    
    case class Empty() extends BST
    
    def insert(x: Int, t: BST) : BST = 
      t match {
        case Empty() => Node(Empty(),x,Empty())
        case Node(left,value,right)=>
          if (x>value) Node(left,value,insert(x,right))
          else if (x<value) Node(insert(x,left),value,right)
          else t
      }
    
    
    def lookup(x: Int, t:BST) : Boolean = 
      t match {
         case Empty()=>false
         case Node(left,value,right) =>
           if (value == x) 
             true
           else if (x<value)
             lookup(x,left)
           else 
             lookup(x,right)      
    }
      
      
    
    
    
    val n1 = Node(Empty(),5,Empty())
    
    println(n1)
    
    val n2 = insert(7,n1)
    
    val n3 = insert(24,n2)
    
    println(lookup(24,n3))
    
  
 
}
  