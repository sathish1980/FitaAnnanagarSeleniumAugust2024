package FileHandlings;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFileRead {
	
	String filepath = System.getProperty("user.dir")+"\\Input\\FitaStudents.xlsx";
	public void readData() throws IOException
	{
		//File F = new File(filepath);
		FileInputStream FI = new FileInputStream(filepath);
		XSSFWorkbook workbook =  new XSSFWorkbook(FI);
		//HSSFWorkbook workbook =  new HSSFWorkbook(FI);
		Sheet sheet = workbook.getSheet("Studentinfo");
		//Sheet sheet = workbook.getSheetAt(0);
		// user row
		int TotalUsedRows = sheet.getPhysicalNumberOfRows();
		for(int i=0;i<TotalUsedRows;i++)
		{
			Row row = sheet.getRow(i);
			//total used columns in tht row
			int totalUSedcolumn = row.getLastCellNum();
			for(int j=0;j<totalUSedcolumn;j++)
			{
				
				Cell cell =row.getCell(j);
				if(cell!=null)
				{
					//System.out.println(cell.getCellType());
				System.out.print(ReadAsSuch(cell));
				//cell.getNumericCellValue();
				System.out.print(" ");
				
				}
			}
			
		
			System.out.println();
		}
		System.out.println("Read done");
		workbook.close();
		FI.close();
	}

	public Object ReadAsSuch(Cell cellvalue)
	{
		if(cellvalue.getCellType().toString().equals("STRING"))
		{
			return cellvalue.getStringCellValue();
		}
		else if(cellvalue.getCellType().toString().equals("NUMERIC"))
		{
			DataFormatter Data =  new DataFormatter();
			return Data.formatCellValue(cellvalue);
			//return cellvalue.getNumericCellValue();
		}
		return null;
	}

	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ExcelFileRead F = new ExcelFileRead();
		F.readData();
	}

}
