package com.tget.service.event.domain;

import java.sql.Date;

public class Event {

	///F
	private String eventId;
	private int viewCount;
	private int categoryTwoNo;
	private String eventImage;
	private String eventName;
	private String eventLocation;
	private Date eventDate;
	private int eventTime;
	private int interestedCategoryNo;
	private String userId;
	
	
	///C
	public Event() {
	}

	

	/**
	 * @return the eventId
	 */
	public String getEventId() {
		return eventId;
	}



	/**
	 * @param eventId the eventId to set
	 */
	public void setEventId(String eventId) {
		this.eventId = eventId;
	}



	/**
	 * @return the viewCount
	 */
	public int getViewCount() {
		return viewCount;
	}



	/**
	 * @param viewCount the viewCount to set
	 */
	public void setViewCount(int viewCount) {
		this.viewCount = viewCount;
	}



	/**
	 * @return the categoryTwoNo
	 */
	public int getCategoryTwoNo() {
		return categoryTwoNo;
	}



	/**
	 * @param categoryTwoNo the categoryTwoNo to set
	 */
	public void setCategoryTwoNo(int categoryTwoNo) {
		this.categoryTwoNo = categoryTwoNo;
	}



	/**
	 * @return the eventImage
	 */
	public String getEventImage() {
		return eventImage;
	}



	/**
	 * @param eventImage the eventImage to set
	 */
	public void setEventImage(String eventImage) {
		this.eventImage = eventImage;
	}



	/**
	 * @return the eventName
	 */
	public String getEventName() {
		return eventName;
	}



	/**
	 * @param eventName the eventName to set
	 */
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}



	/**
	 * @return the eventLocation
	 */
	public String getEventLocation() {
		return eventLocation;
	}



	/**
	 * @param eventLocation the eventLocation to set
	 */
	public void setEventLocation(String eventLocation) {
		this.eventLocation = eventLocation;
	}



	/**
	 * @return the eventDate
	 */
	public Date getEventDate() {
		return eventDate;
	}



	/**
	 * @param eventDate the eventDate to set
	 */
	public void setEventDate(Date eventDate) {
		this.eventDate = eventDate;
	}



	/**
	 * @return the eventTime
	 */
	public int getEventTime() {
		return eventTime;
	}



	/**
	 * @param eventTime the eventTime to set
	 */
	public void setEventTime(int eventTime) {
		this.eventTime = eventTime;
	}



	/**
	 * @return the interestedCategoryNo
	 */
	public int getInterestedCategoryNo() {
		return interestedCategoryNo;
	}



	/**
	 * @param interestedCategoryNo the interestedCategoryNo to set
	 */
	public void setInterestedCategoryNo(int interestedCategoryNo) {
		this.interestedCategoryNo = interestedCategoryNo;
	}



	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}



	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}



	public String toString() {
		return "[Event] eventId : "+eventId+", "+"viewCount : "+viewCount+", " + 
				"categoryTwoNo : "+categoryTwoNo+", " +"eventImage : "+eventImage+", " + 
				"eventName : "+eventName+", " +"eventLocation : "+eventLocation+", " +
				"eventDate : "+eventDate+", " +"eventTime : "+eventTime;
	}
}
