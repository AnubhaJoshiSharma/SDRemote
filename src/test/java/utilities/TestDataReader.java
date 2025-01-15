package utilities;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestDataReader {
	static XSSFWorkbook wb;
	static String path = "./TestData/datasheet.xlsx";
	static File file;
	static FileInputStream fis;
	static XSSFSheet sheet;
	static String dataval;
	
	public static String readLoginName(int rownum, int colnum) {
		file = new File(path);
		try {
			fis = new FileInputStream(file);
			wb = new XSSFWorkbook(fis);
		}
		catch(Exception e) {
			System.out.println("Unable to read excel file");
			
		}
		 sheet = wb.getSheet("data");
		dataval = sheet.getRow(rownum).getCell(colnum).getStringCellValue();
		 System.out.println(dataval);
		return dataval;
	}
	public static String readPassword(int rownum, int colnum) {
		file = new File(path);
		try {
			fis = new FileInputStream(file);
			wb = new XSSFWorkbook(fis);
		}
		catch(Exception e) {
			System.out.println("Unable to read excel file");
			
		}
		 sheet = wb.getSheet("data");
		  dataval = sheet.getRow(rownum).getCell(colnum).getStringCellValue();
		 System.out.println(dataval);
		return dataval;
	}

}
