package readExcel;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel2 {

	public static void main(String[] args) throws Exception {

		File src = new File("C:\\Users\\VS0071652\\workspace\\ProjSelen_Basics\\bin\\com\\readExcel\\TestData.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet1 = wb.getSheetAt(0);

		int rowcount = sheet1.getLastRowNum();
		System.out.println("Tota rows:  " + rowcount);
		for (int i = 0; i < rowcount + 1; i++) {

			String data0 = sheet1.getRow(i).getCell(0).getStringCellValue();
			String data1 = sheet1.getRow(i).getCell(1).getStringCellValue();

			System.out.println("Data from col1"+i+" is "+data0);
			System.out.println("Data from col2"+i+" is "+data1);

		}

		wb.close();

	}

}
