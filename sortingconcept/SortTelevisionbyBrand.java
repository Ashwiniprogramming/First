package com.xworkz.collectionconcept.sortingconcept;

import java.util.Comparator;

public class SortTelevisionbyBrand implements Comparator<Television> {

	@Override
	public int compare(Television o1, Television o2) {
		
		return o1.getBrand().compareTo(o2.getBrand());
	}

}
