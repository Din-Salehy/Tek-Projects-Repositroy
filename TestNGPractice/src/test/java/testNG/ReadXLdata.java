package testNG;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadXLdata {

	public static void main(String[] args) throws InvalidFormatException, IOException {
		ReadXLdata  data = new ReadXLdata();
		data.getData("login");
		
	}
	// https://www.youtube.com/watch?v=NtW4TLgKFHY
	
	public String[][] getData(String excelSheetName) throws InvalidFormatException, IOException {
		File f = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\testdata\\testdata.xlsx");
		FileInputStream  fls = new FileInputStream(f);
		Workbook wb = WorkbookFactory.create(fls);
		Sheet sheetName = wb.getSheet(excelSheetName);
		
		int totalRows = sheetName.getLastRowNum();
		System.out.println("Total number of Rows : "+totalRows);
		
		Row rowCells = sheetName.getRow(0);
		int totalColumns = rowCells.getLastCellNum();
		System.out.println("Total number of Columns : "+totalColumns);
		
		DataFormatter format = new DataFormatter();
		String testData[][] = new String[totalRows][totalColumns];
		for (int i = 1; i <=totalRows; i++) {
			for (int j =0; j<totalColumns; j++) {
				testData [i-1][j]= format.formatCellValue(sheetName.getRow(i).getCell(j));
				System.out.println(testData [i-1][j]);
			}
		}
		 return testData;
	}
}
