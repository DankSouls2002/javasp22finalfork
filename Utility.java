package monsterdungeon;
import java.util.Scanner;

	public class Utility
	{
		public int BatMenu(String prompt)
		{
			Scanner menuScnr = new Scanner(System.in);
			int choice;
			do //start of menu loop
			{
				System.out.println("testing: we are in the menu!"); //FIXME
				System.out.println("0 - to quit out");
				System.out.println(prompt);
				choice = menuScnr.nextInt();


			} while (choice != 0); //0 to quit out
			menuScnr.close();
			return choice;
		}
		public int AbilityMenu(String prompt)
	  {
			System.out.println("We are in the ability menu");
			Scanner menuScnr = new Scanner(System.in);
			int choice;
			choice = menuScnr.nextInt();
			return choice;
	  }









	}

	public class Printer
	{
		void PrintFile(String path) throws FileNotFoundException
		{
			File file = new File(path);
			Scanner input = new Scanner(file);
			while (input.hasNextLine())
			{
				System.out.println(input.nextLine());
			}
			input.close();

		}
		void PrintStat(Character character)
		{
			System.out.println("HP: " + character.gethp());
			System.out.println("Stamina: " + character.getstam());
			System.out.println("Mana: " + character.getMan());
		}

	}
	//we will need a method for generating a random int within a range
		//done:
	static int RandNumGen(int min, int max)
	{
		int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
		return random_int;
	}

	static Monster RandMonGen()
	{
		int maxHP = RandNumGen(1, 100);
		int maxStam = RandNumGen(1, 100);
		int maxMana = RandNumGen(1, 100);
		Monster newMonster = new Monster(maxHP, maxStam, maxMana);
		return newMonster;
	}

	static Gem RandGemGen()
	{
		int hp = RandNumGen(1, 100);
		int stam = RandNumGen(1, 100);
		int mana = RandNumGen(1, 100);
		Gem newGem = new Gem();
		newGem.setHP(hp);
		newGem.setStam(stam);
		newGem.setMana(mana);
		return newGem;
	}

}
