package com.set.exam.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.set.exam.constant.TableReservationConstant;
import com.set.exam.model.TableModel;
import com.set.exam.model.TableReservationInfoModel;
import com.set.exam.model.TableReservationModel;

public class TableReservationService {
	
	public void reserve(TableReservationModel tableReservationModel) {
		
		List<TableReservationInfoModel> tableReservationInfoModels = Arrays.asList(tableReservationModel.getTableReservationInfoModels());
		
		// Sort data by Reserve Date and Reserve Name before process.
		Collections.sort(tableReservationInfoModels, Comparator.comparing(TableReservationInfoModel::getReserveDate).thenComparing(TableReservationInfoModel::getReserveName));
		
		List<TableModel> tables = new ArrayList<TableModel>();
		
		tableReservationInfoModels.forEach(reserveInfo -> {
			
			setTableInfo(tables, reserveInfo);
			
		});
		
		System.out.println("Required Table : " + tables.size());
	}
	
	private void setTableInfo(List<TableModel> tables, TableReservationInfoModel reserveInfo) {
		
		int requiredTableAmount = getTableAmountPerReservation(reserveInfo);
		
		// First Reservation.
		if (tables.size() == 0) {
			
			// Loop for split customer to table.
			for (int i = 1; i <= requiredTableAmount; i++) {
				
				List<TableReservationInfoModel> reservationInfoModels = new ArrayList<TableReservationInfoModel>();
				reservationInfoModels.add(reserveInfo);
				TableModel table = new TableModel(i, reservationInfoModels);
				
				tables.add(table);
				
			}
			
		} else {
			
			// Loop table for validate.
			for (int i = 0; i < tables.size(); i++) {
				
				TableReservationInfoModel lastReserveInfoTable = tables.get(i).getTableReservationInfoModel().getLast();
				
				// Validate for use exists table.
				if (!reserveInfo.getReserveDate().equals(lastReserveInfoTable.getReserveDate())) {
					
					tables.get(i).getTableReservationInfoModel().add(reserveInfo);
					requiredTableAmount--;
				}
				
				if (requiredTableAmount == 0) return;
				
			}
			
			// Add table.
			while (requiredTableAmount > 0) {
				
				int tableNo = tables.size() + 1;
				
				List<TableReservationInfoModel> reservationInfoModels = new ArrayList<TableReservationInfoModel>();
				reservationInfoModels.add(reserveInfo);
				TableModel table = new TableModel(tableNo, reservationInfoModels);
				
				tables.add(table);
				
				requiredTableAmount--;
			}
		}
	}
	
	private int getTableAmountPerReservation(TableReservationInfoModel reserveInfo) {
		
		if (reserveInfo.getCustomerAmount() <= TableReservationConstant.MAX_SEAT) return 1;
		
		return (int) Math.ceil((double) reserveInfo.getCustomerAmount() / (double) TableReservationConstant.MAX_SEAT);
	}
}
