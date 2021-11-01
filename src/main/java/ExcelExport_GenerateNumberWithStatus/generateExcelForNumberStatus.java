package ExcelExport_GenerateNumberWithStatus;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class generateExcelForNumberStatus {
    public static void main(String[] args) throws FileNotFoundException {
        Workbook workbook = new HSSFWorkbook();
        Sheet sheet = workbook.createSheet();
        List<Number> testNumberList = new ArrayList<>();

        long originalNumber = 17589822000L;
        for (int j = 1; j <= 1000; j++) {
            String originalStatus = new String();
            long newNum = originalNumber + j;
            long i = newNum % 10;
            if (i == 1 || i == 3) {
                originalStatus = "系统审核订单";
            }

            if (i == 2 || i == 8) {
                originalStatus = "激活失败";
            }

            if (i == 4 || i == 7) {
                originalStatus = "成功关闭";
            }

            if (i == 5 || i == 9) {
                originalStatus = "预处理失败";
            }

            if (i == 6 || i == 0) {
                originalStatus = "交易完成";
            }

            Number number = new Number(newNum, newNum, originalStatus);
            testNumberList.add(number);
        }

        int rowCount = 0;

        for (Number number : testNumberList) {
            Row row = sheet.createRow(++rowCount);
            Cell cell = row.createCell(1);
            cell.setCellValue(number.orderNumber);

            cell = row.createCell(2);
            cell.setCellValue(number.contractNumber);

            cell = row.createCell(3);
            cell.setCellValue(number.originalStatus);
        }

        try (FileOutputStream outputStream = new FileOutputStream("test.xlsx")) {
            workbook.write(outputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    static class Number {
        private long orderNumber;
        private long contractNumber;
        private String originalStatus;

        public Number() {
        }

        public Number(long orderNumber, long contractNumber, String originalStatus) {
            this.orderNumber = orderNumber;
            this.contractNumber = contractNumber;
            this.originalStatus = originalStatus;
        }
    }


}
