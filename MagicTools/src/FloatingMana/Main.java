package FloatingMana;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) { 
		StringInput();
	}
	private static void StringInput() {
		Mana manaInstance = new Mana();
		String Command;
		String Color;
		int ManaAmount = 0;
		Scanner GetCommand = new Scanner(System.in);
		boolean Continue = true;
		while(Continue){
			System.out.print("> ");
			Command = GetCommand.next();
			if(Command.equals("add") ==  true || Command.equals("Add") == true) {
				try {
						ManaAmount = GetCommand.nextInt();
						Color = GetCommand.next();
						manaInstance.SetMana(Color, ManaAmount);
				}catch(InputMismatchException e) {
					GetCommand.nextLine();
					System.out.println("Error: Input Mishmatch Exception");
					continue;
				}
				
			}else if(Command.equals("Reset") ==  true ||  Command.equals("reset") == true){
				manaInstance.Empty();
			}else if(Command.equals("spend") == true || Command.equals("Spend") == true) {
				try {
					
						ManaAmount = GetCommand.nextInt();
						Color = GetCommand.next();
						manaInstance.SetMana(Color, ManaAmount * -1);
				}catch(InputMismatchException e) {
					GetCommand.nextLine();
					System.out.print("Error: Input Mishmatch Exception");
					continue;
				}
			}else if(Command.equals("Pass") == true || Command.equals("pass") == true) {
				manaInstance.Pass();
			}else if(Command.equals("empty") == true || Command.equals("Empty") == true){
				try {
					Color = GetCommand.next();
					manaInstance.SpendAll(Color);
				} catch(InputMismatchException e) {
					GetCommand.nextLine();
					System.out.print("Error: Input Mishmatch Exceotion");
					continue;
				}
			}else if(Command.equals("End") == true || Command.equals("end") == true) {
				Continue = false;
			}else if(Command.equals("Storm") || Command.equals("storm")) {
				manaInstance.SetStorm();
			} else {
				GetCommand.nextLine();
				System.out.println("Error: Invalid Command");
				continue;
			}
			
		}

	}
}
