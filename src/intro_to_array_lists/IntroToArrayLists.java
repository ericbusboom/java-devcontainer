package intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		// 1. Create an array list of Strings
		// Don't forget to import the ArrayList class
		ArrayList<String> arraylist = new ArrayList<String>();
		// 2. Add five Strings to your list
		arraylist.add("hello1");
		arraylist.add("hello2");
		arraylist.add("h3llo3");
		arraylist.add("hello4");
		arraylist.add("h3llo5");
		// 3. Print all the Strings using a standard for-loop
		for (int i = 0; i < arraylist.size(); i++) {
			System.out.println(arraylist.get(i));

		}
		// 4. Print all the Strings using a for-each loop
		for (String s : arraylist) {
			System.out.println(s);

		}
		// 5. Print only the even numbered elements in the list.
		for (int i = 0; i < arraylist.size(); i++) {
			if (i % 2 == 0) {
				System.out.println(arraylist.get(i));
			}
		}
		// 6. Print all the Strings in reverse order.
		for (int i = arraylist.size() - 1; i > 0; i--) {
			System.out.println(arraylist.get(i));

		}
		// 7. Print only the Strings that have the letter 'e' in them.

		for (String s : arraylist) {
			if (s.contains("e")) {

				System.out.println(s);
			}
		}
	}
}
