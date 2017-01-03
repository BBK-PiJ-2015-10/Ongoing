package day6.StructuralRecursion

sealed trait Feline  {
  
  def dinner: Food
  
  def dinner2: Food = {
    this match {
      case Lion() => Antelope
      case Tiger() => TigerFood
      case Panther() => Human
      case Cat(favoriteFood) => CatFood(favoriteFood)
    }
  }
  
}

final case class Lion() extends Feline {
  
  def dinner: Food = Antelope
  
}

final case class Tiger() extends Feline {

  def dinner: Food = TigerFood
  
}

final case class Panther() extends Feline {
  
  def dinner: Food = Human
  
}


final case class Cat(favoriteFood: String) extends Feline {
  
  def dinner: Food = CatFood(favoriteFood)
  
}



sealed trait Food

final case object Antelope extends Food

final case object TigerFood extends Food

final case object Human extends Food

final case class CatFood (food:String) extends Food


object Diner {
  def dinner3(feline: Feline): Food  = {
    feline match {
      case Lion() => Antelope
      case Tiger() => TigerFood
      case Panther() => Human
      case Cat(food) => CatFood(food)
    }
  }
  
  
  
}


object Example {
  
}