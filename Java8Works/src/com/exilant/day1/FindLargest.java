package com.exilant.day1;

@FunctionalInterface
interface Largest {
	public String findLargest(String s1, String s2);
}

public class FindLargest {

	public static String findLargest(Largest l, String s1, String s2) {
		return l.findLargest(s1, s2);
	}

	public static void main(String[] args) {
		Largest l = findLarge();
		System.out.println(findLargest(l, "Divya", "Rupa"));

	}

	public static Largest findLarge() {
		Largest l = (s1, s2) -> {
			if (s1.length() > s2.length()) {
				return s1 + " is larger than " + s2;
			} else {
				return s2 + " is larger than " + s1;
			}

		};
		return l;

	};

}
