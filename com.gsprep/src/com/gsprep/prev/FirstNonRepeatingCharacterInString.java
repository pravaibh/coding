package com.gsprep.prev;

import java.util.HashMap;

public class FirstNonRepeatingCharacterInString {

	public static void main(String[] args) {

		printFirstNonRepeatingCharacter("ses  quipedalian");
	}

	private static void printFirstNonRepeatingCharacter(String s) {

		HashMap<Integer, NonRepeatingChar> map = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			if (map.get((int) s.charAt(i)) == null) {
				map.put((int) s.charAt(i), new NonRepeatingChar(i, 1));
			} else {
				NonRepeatingChar nrc = map.get((int) s.charAt(i));
				nrc.count = nrc.count + 1;
				map.put((int) s.charAt(i), nrc);
			}
		}
		for (char i : s.toCharArray()) {
			if (map.get((int) i).count == 1) {
				System.out.println(i);
				break;
			}
		}
	}

}

class NonRepeatingChar {

	int index;
	int count;

	NonRepeatingChar(int index, int count) {
		this.index = index;
		this.count = count;
	}
}
