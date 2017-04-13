package de.lv1871.dojo.potter;

public class Book {

	private String isin;
	private String name;
	private String author;
	private HP_BandNummer bandnr;
	
	public HP_BandNummer getBandnr() {
		return bandnr;
	}
	public void setBandnr(HP_BandNummer bandnr) {
		this.bandnr = bandnr;
	}
	public Book(HP_BandNummer bandNr) {
		this.bandnr = bandNr;
	}
	public String getIsin() {
		return isin;
	}
	public void setIsin(String isin) {
		this.isin = isin;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((isin == null) ? 0 : isin.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (isin == null) {
			if (other.isin != null)
				return false;
		} else if (!isin.equals(other.isin))
			return false;
		return true;
	}
	
	
	
	
}
