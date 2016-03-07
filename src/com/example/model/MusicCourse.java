package com.example.model;

public class MusicCourse {
	private int image;

	public int getImage() {
		return image;
	}

	public void setImage(int image) {
		this.image = image;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPersonNumb() {
		return personNumb;
	}

	public void setPersonNumb(String personNumb) {
		this.personNumb = personNumb;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getInstrument() {
		return instrument;
	}

	public void setInstrument(String instrument) {
		this.instrument = instrument;
	}

	public String getPrimarySchool() {
		return primarySchool;
	}

	public void setPrimarySchool(String primarySchool) {
		this.primarySchool = primarySchool;
	}

	private String title;
	private String personNumb;
	private String position;
	private String instrument;
	private String primarySchool;
}
