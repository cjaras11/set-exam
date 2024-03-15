package com.set.exam;

import java.util.Date;

import com.set.exam.model.TableReservationInfoModel;
import com.set.exam.model.TableReservationModel;
import com.set.exam.service.TableReservationService;

public class ExamApplication {

	public static void main(String[] args) {
		
		// Create Input.
		Date date = new Date();
		
		TableReservationInfoModel reserve1 = new TableReservationInfoModel("NameA", "1234"
				,new Date(2024, 1, 1, 12, 0) 
				, null, null, 7);
		
		TableReservationInfoModel reserve2 = new TableReservationInfoModel("NameB", "1234"
				,new Date(2024, 1, 1, 12, 0) 
				, null, null, 4);
		
		TableReservationInfoModel reserve3 = new TableReservationInfoModel("NameC", "1234"
				,new Date(2024, 1, 1, 12, 0) 
				, null, null, 2);
		
		TableReservationInfoModel[] reserves = {reserve1, reserve2, reserve3};
		
		TableReservationModel tableReservation = new TableReservationModel(date, reserves);
		
		
		// Reserve Process.
		new TableReservationService().reserve(tableReservation);

	}

}
