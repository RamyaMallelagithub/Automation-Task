package task1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;

public class Task2 {

	WebDriver driver;
	@DataProvider(name = "SearchProducts")
	public String[][] dataSupplier() throws IOException
	{
		File excel_file = new File("C:\\Users\\DELL\\OneDrive\\Desktop\\Opencart.xlsx");
		FileInputStream fis = new FileInputStream(excel_file);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Opencart");
		int Rows_count = sheet.getPhysicalNumberOfRows();
		int Columns_count = sheet.getRow(0).getLastCellNum();
		String data[][] = new String[Rows_count-1][Columns_count];
		for (int i = 0; i < Rows_count-1; i++) 
		{
		       for (int j = 0; j < Columns_count; j++)
		       {
		              DataFormatter df = new DataFormatter();
		              data[i][j] = df.formatCellValue(sheet.getRow(i+1).getCell(j));
		       } 

		}
		workbook.close();
		fis.close();
		return data;

		
		
	}
	
	
}
