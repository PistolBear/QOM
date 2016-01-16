package pathmaker.out;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import javax.swing.JOptionPane;

import dice.Die;
import dice.NamedDie;

public class RollLoot
{
   public static void main(String[] args)
   {
      List<String> playerNames = null;
      List<String> loot = null;

      try
      {
         loot = Files.readAllLines(Paths.get("resources\\loot_list.txt"), StandardCharsets.UTF_8);

      }
      catch (Exception e)
      {
         e.printStackTrace();
      }
      finally
      {
         if (loot == null || loot.isEmpty())
         {
            System.out.println("Did not read lines from resources/loot_list.txt");
            return;
         }
      }

      try
      {
         // players = Helpers.getInteger("Number of Players");
         playerNames = Files.readAllLines(Paths.get("resources\\player_list.txt"), StandardCharsets.UTF_8);
      }
      catch (Exception e)
      {
         e.printStackTrace();
         System.out.println("Did not read lines from resources/player_list.txt");
         return;
      }
      
      int numPlayers = playerNames.size();
      NamedDie lootDice = new NamedDie(loot.size() - 1);
      Die d4 = new Die(4);
      StringBuilder lootString = new StringBuilder();

      int reroll = 0;
      while (reroll == 0)
      {
         try
         {
            lootString.delete(0, lootString.length());

            for (int i = 0; i < numPlayers; i++)
            {
               int personLoots = d4.roll();

               lootString.append(playerNames.get(i) + ":\n");
               switch (personLoots)
               {
                  case 4:
                     lootString.append(" -" + loot.get(lootDice.roll()) + "\n");
                  case 3:
                     lootString.append(" -" + loot.get(lootDice.roll()) + "\n");
                  case 2:
                     lootString.append(" -" + loot.get(lootDice.roll()) + "\n");
                  case 1:
                     lootString.append(" -" + loot.get(lootDice.roll()) + "\n");
               }
            }

            reroll = JOptionPane.showConfirmDialog(null, "Rolling loots: \n" + lootString.toString(), "Roll again?", JOptionPane.YES_NO_OPTION);
         }
         catch (Exception e)
         {
            e.printStackTrace();
         }
      }
   }
}