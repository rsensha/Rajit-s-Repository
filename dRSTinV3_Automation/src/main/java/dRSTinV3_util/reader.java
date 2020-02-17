package dRSTinV3_util;

import java.util.ArrayList;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class reader {
	
	static Xls_Reader reader;
	
	//	public static void main(String[] args) throws Exception {
			
			
			
			
			public static ArrayList<Object[]> getdata() {
				
				
				
				ArrayList<Object[]> ar = new ArrayList<Object[]>();
				
				reader = new Xls_Reader("Y:\\eclipse workspace\\dRSTinV3_Automation"
						+ "\\Test Data\\Excel Data for dRSTin.xlsx");
				
				for (int rowNum = 2;rowNum<= 2;rowNum++)
				{
					
					String Field = reader.getCellData("Sheet1", "Field Value", rowNum);
					String Operator = reader.getCellData("Sheet1", "Operator", rowNum);
					String Value = reader.getCellData("Sheet1", "Value", rowNum);
					
					Object obj[] = {Field , Operator,Value};
					
					
					
					ar.add(obj);
					
					
			
			}
				
				return ar;
			
			}
}
