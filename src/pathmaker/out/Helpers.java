package pathmaker.out;

import global.AbilityName;

import javax.swing.JOptionPane;

import characterRaces.RacialAbilityModifier;
import dice.NamedDie;

public class Helpers {
	private Helpers() {
	};

	public static boolean isNumber(String num) {
		try {
			Integer.parseInt(num);
			return true;
		}

		catch (NumberFormatException e) {
			return false;
		}
	}

	public static int getInteger(String request) {
		String val = JOptionPane.showInputDialog(null, request);

		while (!Helpers.isNumber(val)) {
			val = JOptionPane.showInputDialog(null,
					"Must be an integer! Try Again: ");
		}

		return Integer.parseInt(val);
	}

	public static NamedDie createUnnamedCustomDie() {
		int modifier = Helpers.getInteger("Modifier: ");

		NamedDie retDie = new NamedDie(20);
		retDie.setModifier(modifier);
		return retDie;
	}

	public static NamedDie createUnnamedCustomDie(String typeOfModifier) {
		int modifier = Helpers.getInteger(typeOfModifier + "Modifier: ");

		NamedDie retDie = new NamedDie(20);
		retDie.setModifier(modifier);
		return retDie;
	}

	public static NamedDie createNamedCustomD20_PromptForName() {
		String diceName = JOptionPane.showInputDialog(null, "Dice Name: ");

		int modifier = Helpers.getInteger(diceName + "'sModifier: ");

		NamedDie retDie = new NamedDie(diceName, 20);
		retDie.setModifier(modifier);
		return retDie;
	}

	public static NamedDie createNamedCustomD20(String diceName) {
		int modifier = Helpers.getInteger(diceName + "'s Modifier: ");

		NamedDie retDie = new NamedDie(diceName, 20);
		retDie.setModifier(modifier);
		return retDie;
	}

	public static RacialAbilityModifier chooseAbility(String reason, int i) 
	{
		AbilityName a = null;
		String ability = JOptionPane.showInputDialog(null, reason);
		if (ability.toLowerCase().startsWith("str"))
		{
			a = AbilityName.Str;
		}
		else if (ability.toLowerCase().startsWith("dex"))
		{
			a = AbilityName.Dex;
		}
		else if (ability.toLowerCase().startsWith("con"))
		{
			a = AbilityName.Con;
		}
		else if (ability.toLowerCase().startsWith("int"))
		{
			a = AbilityName.Int;
		}
		else if (ability.toLowerCase().startsWith("wis"))
		{
			a = AbilityName.Wis;
		}
		else if (ability.toLowerCase().startsWith("cha"))
		{
			a = AbilityName.Cha;
		}
			
		else
		{
			JOptionPane.showConfirmDialog(null, "Error!  Must pick an Ability Score:\n\n"
		    + "Strength\nDexterity\nConstitution\nIntelligence\nWisdom\nCharisma");
			return chooseAbility(reason, i);
		}
		
		return new RacialAbilityModifier(i, a);
	}
}
