package Utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDemo {
	static String projectPath;
	static XSSFWorkbook workbook;
	static XSSFSheet Sheet;
	public static void main(String[] args) {
		//getRowCount();
		getCellData();
	}
	public static void getRowCount()
	{
		try {

			projectPath = System.getProperty("user.dir");

			workbook = new XSSFWorkbook(projectPath+"//Excel//Data.xlsx");
			Sheet = workbook.getSheet("Sheet1");


			System.out.println("Cell Data");
		}catch(Exception exp)
		{
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			System.out.println();
		}
	}
	public static void getCellData()
	{
		try {
			projectPath = System.getProperty("user.dir");

			workbook = new XSSFWorkbook(projectPath+"/Excel/Data.xlsx");
			Sheet = workbook.getSheet("Sheet1");

			String CellData = Sheet.getRow(0).getCell(0).getStringCellValue();


			System.out.println("Cell Data");

		}catch(Exception exp)
		{
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			System.out.println();
		}

	}
}

