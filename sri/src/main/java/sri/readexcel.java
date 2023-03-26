package sri;

import java.io.IOException;
import java.util.zip.DataFormatException;

import javax.swing.text.DefaultFormatter;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import io.netty.handler.codec.DateFormatter;

public class readexcel {

	public static void main(String[] args) throws IOException ,IllegalStateException{
		// TODO Auto-generated method stub
		String filelocation="C:\\Users\\selva\\eclipse-workspace\\sri\\srixl.xlsx";
		XSSFWorkbook wbook=new XSSFWorkbook(filelocation);//string path and do throws decl
		XSSFSheet sheet=wbook.getSheetAt(0);//choose index value first sheet we have to get
		for(int i=0;i<=1;i++) {
			XSSFRow row=sheet.getRow(i);
			for(int j=0;j<=1;j++) {
				
			XSSFCell cell = row.getCell(j);
				DataFormatter d=new DataFormatter(); 
				String value1= d.formatCellValue(cell);
				
				System.out.println(value1);
			}
		}
				wbook.close();

	}

}
