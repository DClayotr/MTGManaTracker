package FloatingMana;
import java.util.*;


public class Mana {
	
	private HashMap<String, Integer> FloatingMana = new HashMap<String, Integer>();
	private int Storm = 0;
	
	Mana(){
		FloatingMana.put("white", 0);
		FloatingMana.put("green", 0);
		FloatingMana.put("red", 0);
		FloatingMana.put("black", 0);
		FloatingMana.put("blue", 0);
	}
	public void Printout() {
		
		System.out.println("White: " + FloatingMana.get("white"));
		System.out.println("Red: " + FloatingMana.get("red"));
		System.out.println("Green: " + FloatingMana.get("green"));
		System.out.println("Black: " + FloatingMana.get("black"));
		
	}
	public void GetMana(String Color) {
		System.out.println(Color + ": " + FloatingMana.get(Color));
	}
	public void GetStorm() {
		System.out.println(Storm);
	}
	public void SetMana(String Color, int Amount) {
		int tempAmount = FloatingMana.get(Color);
		tempAmount = tempAmount  + Amount;
		if (tempAmount < 0) {
			tempAmount = 0;
			System.out.println("You can't spend mana you don't have");
		}else {
			FloatingMana.put(Color, tempAmount);
			System.out.println(Color +": " + FloatingMana.get(Color));
		}
	}
	public void SetStorm() {
		Storm = 1 + Storm;
		System.out.println("Storm: " + Storm);
	}
	public void Empty() {
		FloatingMana.put("white", 0);
		FloatingMana.put("green", 0);
		FloatingMana.put("red", 0);
		FloatingMana.put("black", 0);
		FloatingMana.put("blue", 0);
	}
	public void Pass() {
		Storm = 0;
		Empty();
	}
	public void SpendAll(String Color) {
		FloatingMana.put(Color, 0);
	}
}
