package de.lv1871.dojo.potter;

import java.util.Arrays;

public enum HP_BandNummer {

	HP_BAND1(1), HP_BAND2(2), HP_BAND3(3), HP_BAND4(4), HP_BAND5(5);

	int nr;

	HP_BandNummer(int ordinal) {
		this.nr = ordinal;
	}

	public int getNr() {
		return nr;
	}

	public static HP_BandNummer findByBandNr(int nr) {

		return Arrays.asList(HP_BandNummer.values()).stream()
		.filter(b -> b.getNr() == nr)
		.findFirst().orElseThrow(() -> new IllegalArgumentException("Bandnummer exisitiert nicht: " + nr));
		
	}

}
