
public class Fighter //Generic Fighter class extend into different fighters
{
	//due to inheritance vars were not made private
    double health;
    double strenght;
   
    //return is a fighter is dead or not
   public boolean isAlive()
   {
     if(health > 0)
      return true;
     else
      return false;
   }
   
   //how fighters take damage
   public double takeDamage(double attack)
    {
     return health -= attack;
    }
    
   //attack against Ogre used by Giant or Duck
    public double attack(Ogre meanGuy)
    {
      return (this.strenght * (Math.random() ));
    }
     
    //attack against Giant used by Ogre or Duck
    public double attack(Giant bigGuy)
    {
      return (this.strenght * (Math.random() ));
    }
    
    //attack against the duck used by Giant or Ogre
    public double attack(JimTheRubberDucky funGuy)
    {
      return (this.strenght * (Math.random() ));
    }
    
    //returns health
    public double getHealth()
    {
      return health;
    }
   
 }


