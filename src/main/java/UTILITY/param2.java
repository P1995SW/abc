package UTILITY;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class param2 {
	
public static String getData( int row, int cell) throws EncryptedDocumentException, IOException {
FileInputStream File = new FileInputStream("C:\\Users\\dell\\eclipse-workspace\\Kitezeridha\\src\\test\\resources\\kite.xlsx");
String user = WorkbookFactory.create(File).getSheet("par").getRow(row).getCell(cell).getStringCellValue();
		
return user;
		
	}
	
}
