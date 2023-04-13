package studio9;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import support.cse131.NotYetImplementedException;

public class NameToHeight {
	/**
	 * Construct and fill a map with your studio group members' names, each
	 * associated with his or her height.
	 * 
	 * Construct an ArgsProcessor and loop asking the args processor for a name to
	 * lookup the height. When the user cancels (that is: when args processor
	 * returns null), break from the loop. Otherwise, loop up the name in the map
	 * and output the results. Be sure to handle the case where the map does not
	 * contain a specified name.
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		Map<String, Integer> NameToHeight = new HashMap<>();
		
		NameToHeight.put("Kaylee", 65);
		NameToHeight.put("Jordan", 62);
		
		while (true) {
			String name = in.next();
			if (name.equals("quit")) {
				name = "";
			}
			if (NameToHeight.get(name) == null) {
				System.out.println("Name not stored in map");
			}
			else {
				System.out.println(NameToHeight.get(name));
			}
		}
		
		

	}
}
