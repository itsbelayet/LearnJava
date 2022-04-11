package readWriteFromFile;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteExcel {
    public static void main(String[] args) throws IOException {

        FileOutputStream file=new FileOutputStream("Data/Namelist.xlsx");
        XSSFWorkbook workbook=new XSSFWorkbook();

        XSSFSheet sheet =workbook.createSheet("Sheet1");
        XSSFSheet sheet1 =workbook.createSheet("Sheet2");   // for Sheet2

        for (int i=0; i<5;i++){
            XSSFRow row=sheet.createRow(i);
            XSSFRow row1=sheet1.createRow(i);               // for Sheet2

            for(int j=0; j<3; j++){
                row.createCell(j).setCellValue("Miru");
                row1.createCell(j).setCellValue("Hiru");    // for Sheet2
            }
        }
        workbook.write(file);
        file.close();
        System.out.println("Writing Completed in Excel File");

    }
}
