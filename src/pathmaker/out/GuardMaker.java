package pathmaker.out;

import javax.swing.JOptionPane;

import characterClasses.FighterClass;
import characterClasses.IBaseClass;
import characterRaces.RaceNames;
import entity.NPC;

public class GuardMaker
{
   private static String [] specialGuards = {"Troll", "Captain", "Lieutenant", "Grunt", "Cleric", "Evil Cleric"};
   
   public static void main(String [] args)
   {
      String name = JOptionPane.showInputDialog(null, "Guard's Name");
      System.out.println(name + "\n");
      NPC guard = new NPC(name, IBaseClass.FIGHTER);
      guard.setRace(RaceNames.CORE);
      guard.addLevelsInClass(IBaseClass.FIGHTER, 10);
   }
   
   

}
