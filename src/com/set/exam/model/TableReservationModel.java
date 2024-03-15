package com.set.exam.model;

import java.util.Arrays;
import java.util.Date;

public class TableReservationModel {

	private Date checkDate;
	private TableReservationInfoModel[] tableReservationInfoModels;
	
	public TableReservationModel() {
		super();
	}

	public TableReservationModel(Date checkDate, TableReservationInfoModel[] tableReservationInfoModels) {
		super();
		this.checkDate = checkDate;
		this.tableReservationInfoModels = tableReservationInfoModels;
	}

	@Override
	public String toString() {
		return "TableReservationModel [checkDate=" + checkDate + ", tableReservationInfoModels="
				+ Arrays.toString(tableReservationInfoModels) + "]";
	}

	public Date getCheckDate() {
		return checkDate;
	}

	public void setCheckDate(Date checkDate) {
		this.checkDate = checkDate;
	}

	public TableReservationInfoModel[] getTableReservationInfoModels() {
		return tableReservationInfoModels;
	}

	public void setTableReservationInfoModels(TableReservationInfoModel[] tableReservationInfoModels) {
		this.tableReservationInfoModels = tableReservationInfoModels;
	}
	
}
