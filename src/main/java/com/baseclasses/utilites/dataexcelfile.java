package com.baseclasses.utilites;

import com.baseclasses.baseuse;
import org.apache.poi.ss.usermodel.*;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;

public class dataexcelfile extends baseuse {
    public static JSONArray mapdatafromexcel() throws IOException {


        // Read the Excel file
        File file = new File("src/main/resources/excelfile.xlsx");
        Workbook workbook = WorkbookFactory.create(file);
        Sheet sheet = workbook.getSheetAt(0);
        JSONArray jsonArray = new JSONArray();
        Row cloum = sheet.getRow(0);
        int colnum = cloum.getLastCellNum();
        for (int j = 0; j < sheet.getRow(0).getLastCellNum() + 1; j++) {
            JSONObject rowObject = new JSONObject();
            for (int i = 0; i < colnum; i++) {
                rowObject.put(sheet.getRow(0).getCell(i).getStringCellValue(), sheet.getRow(j + 1).getCell(i).getStringCellValue());
            }
            jsonArray.add(rowObject);
        }

        String jsonString = jsonArray.toString();
      //  System.out.println(jsonString);
        return jsonArray;
    }
}





