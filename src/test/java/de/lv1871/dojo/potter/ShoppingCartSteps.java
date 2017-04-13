package de.lv1871.dojo.potter;

import java.util.stream.IntStream;

import org.junit.Assert;

import cucumber.api.java8.En;

public class ShoppingCartSteps implements En {
	
	ShoppingCart shoppingCart = new ShoppingCart();
	Double totalPrice;
	

	public ShoppingCartSteps() {
		Given("^user adds Band (\\d+) (\\d+) times to the shopping cart$", (Integer bandNr, Integer times) -> {
		    // Write code here that turns the phrase above into concrete actions
			IntStream.range(0, times).forEach(v -> shoppingCart.addBook(new Book(HP_BandNummer.findByBandNr(bandNr.intValue()))));
		});

		When("^the shopping cart total is calculated$", () -> {
		    // Write code here that turns the phrase above into concrete actions
			totalPrice = shoppingCart.getTotalPrice() ;
		});

		Then("^the price should be: (.*)$", (Double result) -> {
		    // Write code here that turns the phrase above into concrete actions
			Assert.assertEquals(result, totalPrice);
		});
	}
	

}
