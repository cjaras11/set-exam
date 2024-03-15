package com.set.exam.model;

import java.util.Date;

public class TableReservationInfoModel {

	private String reserveName;
	private String phoneNo;
	private Date reserveDate;
	private Date inTime;
	private Date outTime;
	private Integer customerAmount;
	public TableReservationInfoModel() {
		super();
	}
	
	public TableReservationInfoModel(String reserveName, String phoneNo, Date reserveDate, Date inTime, Date outTime,
			Integer customerAmount) {
		super();
		this.reserveName = reserveName;
		this.phoneNo = phoneNo;
		this.reserveDate = reserveDate;
		this.inTime = inTime;
		this.outTime = outTime;
		this.customerAmount = customerAmount;
	}

	@Override
	public String toString() {
		return "TableReservationInfoModel [reserveName=" + reserveName + ", phoneNo=" + phoneNo + ", reserveDate="
				+ reserveDate + ", inTime=" + inTime + ", outTime=" + outTime + ", customerAmount=" + customerAmount
				+ "]";
	}

	public String getReserveName() {
		return reserveName;
	}

	public void setReserveName(String reserveName) {
		this.reserveName = reserveName;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public Date getReserveDate() {
		return reserveDate;
	}

	public void setReserveDate(Date reserveDate) {
		this.reserveDate = reserveDate;
	}

	public Date getInTime() {
		return inTime;
	}

	public void setInTime(Date inTime) {
		this.inTime = inTime;
	}

	public Date getOutTime() {
		return outTime;
	}

	public void setOutTime(Date outTime) {
		this.outTime = outTime;
	}

	public Integer getCustomerAmount() {
		return customerAmount;
	}

	public void setCustomerAmount(Integer customerAmount) {
		this.customerAmount = customerAmount;
	}
	
}
