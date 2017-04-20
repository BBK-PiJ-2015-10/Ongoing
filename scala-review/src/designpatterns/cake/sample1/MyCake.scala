package designpatterns.cake.sample1

object MyCake extends App {
  
  trait GenericDao {
    
    def imp: String
    
  }
  
  trait SqlDao extends GenericDao {
    
    def imp = "SQL Implementation"
    
  }
  
  trait CloudantDao extends GenericDao {
    
    def imp = "Cloudant Implementation"
    
  }
  
  
  trait MyServiceTrait {
    
    //Syntax for trait 'self type annotation', we really should just call it 'extending an interface'
   
    dao: GenericDao =>
      
    println("MyImplementation is: " +dao.imp)  
    
  }
  
  val svc = new MyServiceTrait with CloudantDao
  
  val svc2 = new MyServiceTrait with SqlDao
  
  //println("svc using Cloudant DI returns: " + svc.imp)
  
  //println("svc2 using SQL DI returns: " + svc2.imp)
  
  
}