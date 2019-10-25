package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Row.MissingCellPolicy;

public class ExcelUtils {

	private static XSSFWorkbook wb;
	private static XSSFCell cell;
	private static XSSFSheet sheet;
	private static XSSFRow row;
	private static MissingCellPolicy xRow;
	public static void setExcellFile(String Path ,String SheetName) throws Exception
	{
		try {
			File fi = new File("D://MyLearning//DataDriverFrameWork-master//DataDriverFrameWork-master//DataDrivenFrameWork//src//testdata//Testdata.xlsx");
		FileInputStream excelfile = new FileInputStream(fi);
		wb = new XSSFWorkbook(excelfile);
		sheet = wb.getSheetAt(0);
		}catch (Exception e){
		
				throw(e);
	
			
		}
	}
	
	public static String getCellData(int RowNum , int ColNum){
		try{
			
		
		cell = sheet.getRow(RowNum).getCell(ColNum);
		String CellData = cell.getStringCellValue();
		return CellData;
		}catch (Exception e){
			return"";
		}
	}
	

		
	public static void setCellData(String Result, int RownNum , int ColuNum) throws Exception{

		
		row=sheet.getRow(RownNum);
		cell = row.getCell(ColuNum);
		
		if(cell == null){
		cell = row.getCell(ColuNum, xRow.RETURN_BLANK_AS_NULL);
		cell = row.createCell(ColuNum);
		cell.setCellValue(Result);
		}else{
			
		cell.setCellValue(Result);
		}
	
		
	
		File fi2 = new File("D://MyLearning//DataDriverFrameWork-master//DataDriverFrameWork-master//DataDrivenFrameWork//src//testdata//Testdata.xlsx");
		FileOutputStream fileout = new FileOutputStream(fi2);
		wb.write(fileout);
		fileout.flush();
		fileout.close();
	}
	
	
}
