package day6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ConcurrentModificationException;
import java.util.LinkedList;
import java.util.Scanner;

public class Part1 {

	public static void main(String args[]) throws FileNotFoundException {
		File file = new File("inputs\\signal.txt");
		Scanner text = new Scanner(file);

		String data = text.next();
		LinkedList<Character> analyse = new LinkedList<Character>();
		for (int i = 0; i < 3; i++) {
			analyse.add(data.charAt(i));
		}
		int i = 2;

		while (true) {
			i++;
			boolean contains = false;
			analyse.add(data.charAt(i));
			System.out.println(analyse.toString());
			LinkedList<Character> analyseBuff = (LinkedList<Character>) analyse.clone();

			for (Character j : analyse) {
				analyseBuff.remove(j);
				if (analyseBuff.contains(j)) {
					contains = true;
					break;
				}
				analyseBuff.add(j);
			}
			
			if (contains == false)
				break;
			analyse.removeFirst();

		}

		System.out.println(i + 1);

	}

}
