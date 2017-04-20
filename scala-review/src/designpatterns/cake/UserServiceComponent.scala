package designpatterns.cake

trait UserServiceComponent {
  
  def userService: UserService
  
  trait UserService {
    
    def findAll: List[User]
    
    def save(user: User)
   
  }
  
}