package FileHandlings;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFileWritedata {
	
	String filepath = "C:\\\\Users\\\\kumar\\\\eclipse-workspace\\\\FitaAnnanagarSeleniumAugust2024\\\\Input\\\\output.xlsx";

	String[] courses = {"python","java","C#","SQL"};
	public void writedata() throws IOException
	{
		FileOutputStream FI = new FileOutputStream(filepath);
		XSSFWorkbook workbook = new XSSFWorkbook();
		Sheet sheet = workbook.createSheet("courseDetails");
		
		
		for (int i=0;i<courses.length;i++)
		{
			Row row = sheet.createRow(i);
			Cell cell1 = row.createCell(i);
			cell1.setCellValue(courses[i]);
		}
		
		System.out.println("Write done");
		workbook.write(FI);
		workbook.close();
		FI.close();
		
		
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ExcelFileWritedata W = new ExcelFileWritedata();
		W.writedata();
	}

}
