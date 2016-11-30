package readExcel;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws Exception {
	
		File src=new File("C:\\Users\\VS0071652\\workspace\\ProjSelen_Basics\\bin\\com\\readExcel\\TestData.xlsx");
		FileInputStream fis= new FileInputStream(src);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet1 = wb.getSheetAt(0);
		String Data0 = sheet1.getRow(0).getCell(0).getStringCellValue();
		System.out.println("Excel Data is"+" "+Data0);
		wb.close();
		
	
	}

	

}
