package com.tget.service.event.domain;

import java.sql.Date;

public class RecommEvent {

	///F
	private int recommEventNo;
	private String eventName;
	private String videoName;
	private String recommEventName;
	private String recommEventDetail;
	
	///C
	public RecommEvent() {
	}

	

	/**
	 * @return the recommEventNo
	 */
	public int getRecommEventNo() {
		return recommEventNo;
	}



	/**
	 * @param recommEventNo the recommEventNo to set
	 */
	public void setRecommEventNo(int recommEventNo) {
		this.recommEventNo = recommEventNo;
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
	 * @return the videoName
	 */
	public String getVideoName() {
		return videoName;
	}



	/**
	 * @param videoName the videoName to set
	 */
	public void setVideoName(String videoName) {
		this.videoName = videoName;
	}



	/**
	 * @return the recommEventName
	 */
	public String getRecommEventName() {
		return recommEventName;
	}



	/**
	 * @param recommEventName the recommEventName to set
	 */
	public void setRecommEventName(String recommEventName) {
		this.recommEventName = recommEventName;
	}



	/**
	 * @return the recommEventDetail
	 */
	public String getRecommEventDetail() {
		return recommEventDetail;
	}



	/**
	 * @param recommEventDetail the recommEventDetail to set
	 */
	public void setRecommEventDetail(String recommEventDetail) {
		this.recommEventDetail = recommEventDetail;
	}



	public String toString() {
		return "[RecommEvent] recommEventNo : "+recommEventNo+", "+"eventName : "+eventName+", " + 
				"videoName : "+videoName+", " +"recommEventName : "+recommEventName+", "
				+"recommEventDetail : "+recommEventDetail;
	}
}
