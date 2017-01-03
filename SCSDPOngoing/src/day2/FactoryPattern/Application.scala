package day2.FactoryPattern

trait Application {
  
   type D <: Document
   
   var docs = List[D]()
   
   def newDocument = {
     var doc = createDocument
     docs = doc::docs
     doc.open
   }
   
   //Factory method
   def createDocument: D
  
}