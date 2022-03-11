package com.javaoo.store;

import java.util.ArrayList;
import java.util.Date;

public class ClassicalCD extends Item {
	private String composer, recordingLocation;
	private Date releaseDate;
	private int performerCount = 0;
	ArrayList <String> performers = new ArrayList<String>(20);
	
	public void addPerformer(String performer) {
		performers.add(performer);
		performerCount++;
	}
	
	public void showPerformers() {
		for(String s : performers) {
			System.out.println(s);
		}
	}
	
	public Date getReleaseDate() {
		return releaseDate;
	}
	
	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}
	
	public String getRecordingLocation() {
		return recordingLocation;
	}
	
	public void setRecordingLocation(String recordingLocation) {
		this.recordingLocation = recordingLocation;
	}
	
	public String getComposer() {
		return composer;
	}
	
	public void setComposer(String composer) {
		this.composer = composer;
	}
}
