import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadExcel {
    public static void main(String[] args) throws IOException {
        FileInputStream file = new FileInputStream("credentials.xlsx");
        Workbook workbook = new XSSFWorkbook(file);
        Sheet sheet = workbook.getSheetAt(0);
        Row row = sheet.getRow(0);
        Cell emailCell = row.getCell(0);
        Cell passwordCell = row.getCell(1);
        System.out.println("Email: " + emailCell.getStringCellValue());
        System.out.println("Password: " + passwordCell.getStringCellValue());
        workbook.close();
        file.close();
    }
}
