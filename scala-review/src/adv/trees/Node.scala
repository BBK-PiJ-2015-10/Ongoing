package adv.trees

case class Node (private val data: Object, private var left: Node = null, private var right: Node = null) {
    
  def getData : Object = {
    if (data!=null){
      return data;
    }
    return null;
  }
  
  def getLeft = left
  
  def getRight = right
  
}