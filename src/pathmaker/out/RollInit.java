package pathmaker.out;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import javax.swing.JOptionPane;

import dice.Die;
import dice.NamedDie;

public class RollInit 
{
	Die d1 = Helpers.createUnnamedCustomDie();
	
	public static void main(String [] args)
	{
		List<String> playerNames = null;

		
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
		
		int players = playerNames.size();
		NamedDie [] dice = new NamedDie[players];

		for (int i = 0; i < players; i++)
		{
			dice[i] = Helpers.createNamedCustomD20(playerNames.get(i));
		}
		
		StringBuilder initString = new StringBuilder();
		int reroll = 0;
		while (reroll == 0)
		{
			initString.delete(0, initString.length());
			
			for (int i = 0; i < players; i++)
			{
				initString.append("("+ dice[i].getName() +") +" + dice[i].getModifier() + ": "
			    + dice[i].roll() + "\n");
			}
			reroll = JOptionPane.showConfirmDialog(null, "Rolling initiative: \n" + initString.toString(), "Roll again?", JOptionPane.YES_NO_OPTION);
		}
	}
}