package com.xworkz.linkedHashset;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class CharacterLinkedHashset {

	public static void main(String[] args) {
		
		LinkedHashSet<Character> chal = new LinkedHashSet<Character>();
		chal.add('A');
		chal.add('B');
		chal.add('C');
		chal.add('D');
		chal.add('E');
		chal.add('F');
		chal.add('G');
        System.out.println(chal);
		
		System.out.println("-----------------");
		
		System.out.println("Traversing using foreach");
		chal.forEach((m)->System.out.println(m));
		System.out.println("-----------------");
		
		System.out.println("Traversing using iterator");
		Iterator<Character> chitr = chal.iterator();
		while(chitr.hasNext()) {
			System.out.println(chitr.next());
		}

	}

	}


