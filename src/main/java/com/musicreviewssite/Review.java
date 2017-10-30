package com.musicreviewssite;

public class Review {

	private long id;
	private String title;
	private String imageUrl;
	private String genre;
	private String content;
	private String date;
	private String artist;

	public Review(long id, String title, String imageUrl, String genre, String content, String date, String artist) {
		this.id = id;
		this.title = title;
		this.imageUrl = imageUrl;
		this.genre = genre;
		this.content = content;
		this.date = date;
		this.artist = artist;
	}

	public long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public String getGenre() {
		return genre;
	}

	public String getContent() {
		return content;
	}

	public String getDate() {
		return date;
	}

	public String getArtist() {
		return artist;
	}

}
