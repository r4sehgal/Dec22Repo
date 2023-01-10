package utilityfunctions;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil1 {static  XSSFWorkbook workbook= null;
static  XSSFSheet sheet= null;

static public void getSheet(){
	
	
 try {
	workbook=new XSSFWorkbook("C:\\Users\\r3sehgal\\Desktop\\New folder\\TanchanProject06\\src\\main\\java\\Data1\\UserData2.xlsx");
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
   sheet=workbook.getSheet("Sheet1");
}
static public int getNoOfRows() {
	getSheet();
  int rowcount=sheet.getPhysicalNumberOfRows();
  System.out.println(rowcount);
  return rowcount;
}

static public int getNoOfcols() {
	getSheet();
  int colcount=sheet.getRow(0).getPhysicalNumberOfCells();
  System.out.println(colcount);
  return colcount;
}
static  public String getData(int rowno, int rowcol) {
	getSheet();
   String data = sheet.getRow(rowno).getCell(rowcol).getStringCellValue();
   return data;
   
}

}
