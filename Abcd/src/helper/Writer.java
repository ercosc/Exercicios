package helper;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class Writer {

	private PrintWriter writer;
	
	public Writer(String fileName) {
		
		try {
			this.writer = new PrintWriter(fileName, "UTF-8");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
	}
	
	public void write(String text) {
		writer.println(text);
		
	}
	
	public void close() {
		writer.close();
		
	}
	
	
	
	
}
