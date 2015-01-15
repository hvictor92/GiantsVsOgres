//Henry Victor
// Giants Vs. Ogres Vs. Duck
// 2/6/2013
// Shows the results of a battle between the three warriors

// import text class
import java.text.*;


public class GiantsVsOgresVersion2 
{

	public static void main(String[] args) 
	{
		DecimalFormat decFor = new DecimalFormat("00.00");  // For the sake of keeping the decimals neat
		//var assignments
		Giant bigGuy = new Giant();
	    Ogre meanGuy = new Ogre();
	    JimTheRubberDucky funGuy = new JimTheRubberDucky();
	    int numAttack = 1;
	  //intro
	   System.out.println("In a centuries old blood feud the Giants and Orges have"); 
	   System.out.println("triedlessly fought each other to the death. But now an introloper");
	   System.out.println("has entered the fray, the most fearsom Jim the Rubber Ducky!");
	   System.out.println("Now begins yetanother battle in this ageless conflict! Fight!");
	   
	   System.out.println();
	   
	   //Header of Battle output
	   System.out.println("Attack#---Giant---Ogre---Jim the Rubber Ducky");
	   System.out.println("_____________________________________________");
	   System.out.println("Start     100.0    60.0          110          ");
	   
       System.out.println();
	   
       //First round of fighting
	   while (bigGuy.getHealth() > 0 && meanGuy.getHealth() > 0 && funGuy.getHealth() > 0)
	   { 
		meanGuy.takeDamage(bigGuy.attack(meanGuy));
	    bigGuy.takeDamage(funGuy.attack(bigGuy));
	    funGuy.takeDamage(meanGuy.attack(funGuy));
	    System.out.print("Attack "+ numAttack + ": ");
	    System.out.println(decFor.format(bigGuy.getHealth()) + "    " + decFor.format(meanGuy.getHealth()) + "         " + decFor.format(funGuy.getHealth()));
	    numAttack++;
	   }
	   
	   if (meanGuy.getHealth() < 0) //If Ogre Dies fist
	   {
		   //Round 2 if Ogre dies
		   while (bigGuy.getHealth() > 0 && funGuy.getHealth() > 0)
		   {
			   bigGuy.takeDamage(funGuy.attack(bigGuy));
			   funGuy.takeDamage(bigGuy.attack(funGuy));
			   System.out.println("Attack "+ numAttack + ": ");
			   System.out.println(decFor.format(bigGuy.getHealth()) +"     DEAD         "+ decFor.format(funGuy.getHealth()));
			    numAttack++;
		   }
	   }
	   else if (bigGuy.getHealth() < 0 && meanGuy.getHealth() > 0)//If Giant Dies
	   {
		   //Round 2 if Giants dies
		   while (meanGuy.getHealth() > 0 && funGuy.getHealth() > 0)
		   {
			   meanGuy.takeDamage(funGuy.attack(meanGuy));
			   funGuy.takeDamage(meanGuy.attack(funGuy));
			   System.out.print("Attack "+ numAttack + ": ");
			   System.out.printf("  DEAD   " + decFor.format(bigGuy.getHealth()) +"          "+ decFor.format(funGuy.getHealth()));
			    numAttack++;
		   }
	   }
	   else //If Jim The Rubber Ducky Dies
	   {
		   //Round 2 if the Duck dies
		   while (meanGuy.getHealth() > 0 && bigGuy.getHealth() > 0)
		   {
			   meanGuy.takeDamage(bigGuy.attack(meanGuy));
			   bigGuy.takeDamage(meanGuy.attack(bigGuy));
			   System.out.print("Attack "+ numAttack + ": ");
			   System.out.println(decFor.format(bigGuy.getHealth()) + "    " + decFor.format(meanGuy.getHealth()) + "          DEAD");
			   numAttack++;
		   }
	   }
	   System.out.println();
	   
	   if(meanGuy.getHealth() < 0 && bigGuy.getHealth() < 0 && funGuy.getHealth() < 0)//Base Case, Everybody Dies
		   System.out.println("All Warriors Have Fallen! Weep While You Can For The War Shall Continue!");
	   else if (meanGuy.getHealth() < 0 && bigGuy.getHealth() < 0 )//Case 1 Jim the Rubber Ducky Wins
		     {
			   System.out.println("All tremble in fear before the might of Jim the Rubber Ducky!");  
		       System.out.println("For all shall fall before his might");
		     }
	   else if (bigGuy.getHealth() < 0 && funGuy.getHealth() < 0) //Case 2 Ogre Wins
	     System.out.println("The Ogre Walks Away Victorious!");
	   else //Case 3 Giant Wins
	     System.out.println("Tis The Giant That Claims Victory This Day!");

	}

}
