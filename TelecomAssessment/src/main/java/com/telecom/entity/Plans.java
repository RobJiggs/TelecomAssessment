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
@Table(name="Plans")
public class Plans {
	@Id
	private int id;
	private String plan_name; 
	private double cost; 
	private String validity;
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
	 * @return the plan_name
	 */
	public String getPlan_name() {
		return plan_name;
	}
	/**
	 * @param plan_name the plan_name to set
	 */
	public void setPlan_name(String plan_name) {
		this.plan_name = plan_name;
	}
	/**
	 * @return the cost
	 */
	public double getCost() {
		return cost;
	}
	/**
	 * @param cost the cost to set
	 */
	public void setCost(double cost) {
		this.cost = cost;
	}
	/**
	 * @return the validity
	 */
	public String getValidity() {
		return validity;
	}
	/**
	 * @param validity the validity to set
	 */
	public void setValidity(String validity) {
		this.validity = validity;
	}
	/**
	 * 
	 */
	public Plans() {
		super();
	}
	/**
	 * @param id
	 * @param plan_name
	 * @param cost
	 * @param validity
	 */
	public Plans(int id, String plan_name, double cost, String validity) {
		super();
		this.id = id;
		this.plan_name = plan_name;
		this.cost = cost;
		this.validity = validity;
	}
	@Override
	public String toString() {
		return "Plans [id=" + id + ", plan_name=" + plan_name + ", cost=" + cost + ", validity=" + validity + "]";
	}

	
	
	
}
