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
				
				reader = new Xls_Reader("C:\\Users\\Rajit\\Documents\\Exceldatafectexcel.xlsx");
				
				for (int rowNum = 2;rowNum<= 2;rowNum++)
				{
					
					String Firstname = reader.getCellData("Sheet2", "Full Name", rowNum);
					String email = reader.getCellData("Sheet2", "Email", rowNum);
					String username = reader.getCellData("Sheet2", "Login ID", rowNum);
					String password = reader.getCellData("Sheet2", "Password", rowNum);
					
					Object obj[] = {Firstname, email};
					
					ar.add(obj);
					
					
			
			}
				
				return ar;
			
			}
}
