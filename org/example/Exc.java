package org.example;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public final class Exc {
    public void Excel(String file, int in){
        try {
            XSSFWorkbook book = new XSSFWorkbook(new FileInputStream(file));
            XSSFSheet list = book.getSheet("Лист1");
            int i = 1;
            while (true){
                int f = 1;
                String line = "";
                XSSFRow row = list.getRow(i);
                if(row == null)
                    break;
                int result = (int) row.getCell(0).getNumericCellValue();
                if(result == in){
                    while (row.getCell(f) != null){
                        line += row.getCell(f).getStringCellValue() + " ";
                        f++;
                    }
                    System.out.println(line);
                }
                i++;
            }
        }
        catch (Exception e){
            System.out.println("Ошибка! " +e.getMessage());
        }
    }
}
