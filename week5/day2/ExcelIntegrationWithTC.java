package week5.day2;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelIntegrationWithTC {
	
	//step 4
	//static -common reference or common data
	public static String[][] excelvalue() throws IOException {
		
	
		XSSFWorkbook wb=new XSSFWorkbook("./dataSheet/CreateLead.xlsx");
		
		XSSFSheet sheet=wb.getSheetAt(0);
		
		int rowCount = sheet.getLastRowNum();

		short cellCount = sheet.getRow(1).getLastCellNum();
		
		//step1
		String[][] data=new String[rowCount][cellCount];

		for (int i = 1; i <=rowCount; i++) {
for (int j = 0; j < cellCount; j++) {
	
	String datavalue = sheet.getRow(i).getCell(j).getStringCellValue();
	System.out.println(datavalue);
	
	//step 2
	data[i-1][j]=datavalue;
}	
		}
		
		wb.close();
		
		//step 3
		return data;
	}
}
