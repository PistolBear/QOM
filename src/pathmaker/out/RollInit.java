package pathmaker.out;

import javax.swing.JOptionPane;

import dice.Die;
import dice.NamedDie;

public class RollInit 
{
	Die d1 = createCustomDie();
	
	public static void main(String [] args)
	{
		int players = 0;
		
		try
		{
		players = new Integer(JOptionPane.showInputDialog(null, "Number of Players:"));
		}
		catch (NumberFormatException e)
		{
			return;
		}
		
		NamedDie [] dice = new NamedDie[players];
		StringBuilder initString = new StringBuilder();
		
		for (int i = 0; i < players; i++)
		{
			dice[i] = createCustomDie();
		}
		
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


	private static NamedDie createCustomDie() 
	{
//		String sides = JOptionPane.showInputDialog(null, "Number of sides: ");
//		while (!isNumber(sides))
//		{
//			sides = JOptionPane.showInputDialog(null, "Must be an integer! Number of sides: ");
//		}
		
		String modifier = JOptionPane.showInputDialog(null, "Modifier: ");
		while (!isNumber(modifier))
		{
			modifier = JOptionPane.showInputDialog(null, "Must be an integer! Modifier: ");
		}
		
		NamedDie retDie = new NamedDie(20);
		retDie.setModifier(Integer.parseInt(modifier));
		return retDie;
	}

	private static boolean isNumber(String num) 
	{
		try
		{
			Integer.parseInt(num);
			return true;
		}
		
		catch (NumberFormatException e)
		{
			return false;
		}
	}



}
