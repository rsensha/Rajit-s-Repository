package Utility;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class excelreader {
	
	static Xls_Reader reader;
	
	public static ArrayList<Object[]> getdata() {
		
		ArrayList<Object[]> ar = new ArrayList<Object[]>();
		reader = new Xls_Reader("Y:\\eclipse workspace\\FreeCRMPractice\\TestData\\FReeCRMDataSheet.xlsx");
		
		for(int rowNum = 2; rowNum <=reader.getRowCount("Sheet1"); rowNum ++) {
			
			String Name= reader.getCellData("Sheet1", "Name", rowNum);
			String Address = reader.getCellData("Sheet1", "Address", rowNum);
			Object obj[] = {Name , Address};
			ar.add(obj);
		}
		
		return ar;
	}

}
