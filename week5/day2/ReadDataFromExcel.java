package week5.day2;

import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel {

	public static void main(String[] args) throws IOException {
		//Step1-> Set path for workbook
		//step2-> Get into the sheet
		//Step3-> Get into Row values
		//Step4-> Get into cell values
		//Step5-> Read Data from workbook and print
		//Step6-> close the workbook
		
		//step-1
		XSSFWorkbook wb=new XSSFWorkbook("./dataSheet/CreateLead.xlsx");
		
		//step-2
		//index value
		XSSFSheet sheet=wb.getSheetAt(0);
		
		//using sheet name
		//XSSFSheet sheet2 = wb.getSheet("sheet1");
		
		//step-3
		int rowCount = sheet.getLastRowNum();
		System.out.println(" total number of rows :"+rowCount);

		//exclude the header value
		int phy = sheet.getPhysicalNumberOfRows();
		System.out.println("include the header value :"+phy);
		
		//step4
		short cellCount = sheet.getRow(1).getLastCellNum();
		System.out.println("total number of cells :"+cellCount);
		
		//step5
		String getdata = sheet.getRow(1).getCell(3).getStringCellValue();
		System.out.println(getdata);

		for (int i = 1; i <=rowCount; i++) {
for (int j = 0; j < cellCount; j++) {
	
	String data = sheet.getRow(i).getCell(j).getStringCellValue();
	System.out.println(data);
	
}	
		}
		//step -6
		wb.close();
	}

}
