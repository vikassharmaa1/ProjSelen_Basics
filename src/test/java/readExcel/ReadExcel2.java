package readExcel;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.CellValue;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel2 {

	public static void main(String[] args) throws Exception {

		File src = new File("C:\\Users\\vikas\\eclipse-workspace\\ProjSelen_Basics\\src\\test\\java\\readExcel\\TestData.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet1 = wb.getSheetAt(0);

		int rowcount = sheet1.getLastRowNum();

		System.out.println("Tota rows:  " + rowcount);
		for (int i = 0; i < rowcount + 1; i++) {
			Row row = sheet1.getRow(i);
			for (int j = 0; j < row.getLastCellNum(); j++) {
				DataFormatter df = new DataFormatter();
				String data = df.formatCellValue(row.getCell(j));
				System.out.print(data + "||");

			}

		}

	}

}
