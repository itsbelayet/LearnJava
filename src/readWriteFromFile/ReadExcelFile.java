package readWriteFromFile;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadExcelFile {
    /*
    Methods of getting cell values
        .toString()             --> Generic Method [All kinds of data like String, int, boolean]
        .getStringCellValue()   --> String type Value
        .getNumericCellValue()  --> Numeric type Value
        .getBooleanCellValue()  --> boolean type Value
     */
    public static void main(String[] args) throws IOException {
        FileInputStream file = new FileInputStream("Data/SalarySheet.xlsx");

        XSSFWorkbook workbook = new XSSFWorkbook(file);

        XSSFSheet sheet=workbook.getSheet("Sheet1");      // 'Sheet1' for Sheet Name
        //XSSFSheet sheet=workbook.getSheetAt(0);               // 0 for Sheets Index

        int rowcount=sheet.getLastRowNum();                     // Count Total Row
        int colcount=sheet.getRow(0).getLastCellNum();  // Count Total Cell

        for(int i=0; i<rowcount; i++){
            XSSFRow currentrow=sheet.getRow(i);
            for(int j=0; j<colcount; j++){
                String value=currentrow.getCell(j).toString();
                System.out.print("   "+value);
            }
            System.out.println();
        }

    }
}