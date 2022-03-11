package com.javaoo.store;

import java.util.Date;

public class CD extends Item {
	private Artist artist;
	private Date releaseDate;
	/**
	 * @return the artist
	 */
	public final Artist getArtist() {
		return artist;
	}
	/**
	 * @param artist the artist to set
	 */
	public final void setArtist(Artist artist) {
		this.artist = artist;
	}
	/**
	 * @return the releaseDate
	 */
	public final Date getReleaseDate() {
		return releaseDate;
	}
	/**
	 * @param releaseDate the releaseDate to set
	 */
	public final void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}
	
	
}
