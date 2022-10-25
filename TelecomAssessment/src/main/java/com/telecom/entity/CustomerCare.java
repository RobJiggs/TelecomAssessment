/**
 * 
 */
package com.telecom.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Robert Joasilus
 *
 * @date: Oct 25, 2022
 */
@Entity
@Table
public class CustomerCare {
	@Id
	private int id; 
	private String complaint_description;
	private int userId; 
	private String status_of_complaint;
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the complaint_description
	 */
	public String getComplaint_description() {
		return complaint_description;
	}
	/**
	 * @param complaint_description the complaint_description to set
	 */
	public void setComplaint_description(String complaint_description) {
		this.complaint_description = complaint_description;
	}
	/**
	 * @return the userId
	 */
	public int getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}
	/**
	 * @return the status_of_complaint
	 */
	public String getStatus_of_complaint() {
		return status_of_complaint;
	}
	/**
	 * @param status_of_complaint the status_of_complaint to set
	 */
	public void setStatus_of_complaint(String status_of_complaint) {
		this.status_of_complaint = status_of_complaint;
	}
	/**
	 * @param id
	 * @param complaint_description
	 * @param userId
	 * @param status_of_complaint
	 */
	public CustomerCare(int id, String complaint_description, int userId, String status_of_complaint) {
		super();
		this.id = id;
		this.complaint_description = complaint_description;
		this.userId = userId;
		this.status_of_complaint = status_of_complaint;
	}
	/**
	 * 
	 */
	public CustomerCare() {
		super();
	}
	@Override
	public String toString() {
		return "CustomerCare [id=" + id + ", complaint_description=" + complaint_description + ", userId=" + userId
				+ ", status_of_complaint=" + status_of_complaint + "]";
	}
	
	
	
}
