package com.musicreviewssite;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class ReviewRepository {

	protected Map<Long, Review> reviews = new HashMap<Long, Review>();

	public ReviewRepository() {

		Review worlds = new Review(2342, "Worlds", "./images/porterRobinson.jpg", "Dream Pop",
				"Kawaii AF. This album is aestheic genius and still is amazing three years later.", "August 2014",
				"Porter Robinson");
		Review skin = new Review(6354, "Skin", "./images/Flume_-_Skin.png", "Future Bass",
				"Analog realness meets hip-hop with a splash of future bass. This album was designed for a great live performance.",
				"May 2016", "Flume");
		Review massManipulation = new Review(2762, "Mass Manipulation", "./images/massManipulation.jpg", "Industrial",
				"Feels like you entered the matrix and been abducted by aliens at the same time.", "August 2017",
				"Rezz");
		Review meridian = new Review(2873, "Meridian", "./images/meridian.jpg", "Indietronica",
				"Something old and something new. A little less vibey than their last album.", "September 2017",
				"Odesza");
		reviews.put(worlds.getId(), worlds);
		reviews.put(skin.getId(), skin);
		reviews.put(massManipulation.getId(), massManipulation);
		reviews.put(meridian.getId(), meridian);
	}

	public Collection<Review> findAll() {
		return reviews.values();
	}

	public Review findOne(Long id) {
		return reviews.get(id);
	}

}
