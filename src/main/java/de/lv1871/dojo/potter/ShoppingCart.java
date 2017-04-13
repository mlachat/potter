package de.lv1871.dojo.potter;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ShoppingCart {

	List<Book> books = new ArrayList<>();

	public void addBook(Book... books) {
		this.books.addAll(Arrays.asList(books));
	};

	public Double getTotalPrice() {
 		Double totalPrice = books.size() * 8d;
 		int numDiffBands = books.stream()
 			.collect(Collectors.groupingBy(Book::getBandnr))
 			.size();
 		
 		Double rabatt = getDiscount(numDiffBands);
 		BigDecimal bigDecimalResult = new BigDecimal(rabatt * totalPrice);
 		bigDecimalResult = bigDecimalResult.setScale(2, BigDecimal.ROUND_CEILING);
		return bigDecimalResult.doubleValue();
	}

	private double getDiscount(int numDiffBands) {
		switch (numDiffBands) {
		case 2:
			return .95d;
		case 3:
			return .9d;
		case 4:
			return .8d;
		case 5:
			return .75d;

		default:
			return 1d;
		}
	};

}
