package com.xworkz.collectionconcept.sortingconcept;

import java.util.Comparator;

public class SortTelevisionbyType implements Comparator<Television> {

	@Override
	public int compare(Television o1, Television o2) {
		
		return o1.getType().compareTo(o2.getType());
	}

}
