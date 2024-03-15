package com.set.exam.model;

import java.util.List;

public class TableModel {

	private int tableNo;
	private List<TableReservationInfoModel> tableReservationInfoModel;
	
	public TableModel() {
		super();
	}

	public TableModel(int tableNo, List<TableReservationInfoModel> tableReservationInfoModel) {
		super();
		this.tableNo = tableNo;
		this.tableReservationInfoModel = tableReservationInfoModel;
	}

	@Override
	public String toString() {
		return "TableModel [tableNo=" + tableNo + ", tableReservationInfoModel=" + tableReservationInfoModel + "]";
	}

	public int getTableNo() {
		return tableNo;
	}

	public void setTableNo(int tableNo) {
		this.tableNo = tableNo;
	}

	public List<TableReservationInfoModel> getTableReservationInfoModel() {
		return tableReservationInfoModel;
	}

	public void setTableReservationInfoModel(List<TableReservationInfoModel> tableReservationInfoModel) {
		this.tableReservationInfoModel = tableReservationInfoModel;
	}

}
