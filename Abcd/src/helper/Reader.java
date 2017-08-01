package helper;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JOptionPane;

public class Reader {
	
	private BufferedReader buffer;
	
	public Reader(String fileName) {
		
		try {
			this.buffer = new BufferedReader(new FileReader(fileName));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public String readLine() {
		
		try {
			return this.buffer.readLine();
		} catch (IOException e) {
			return "Error 405: Method Not Allowed";
		}
	}
	
	public String readAll() {
		String lines = "";
		String line = this.readLine();
		while(line != null) {
			lines += line + "\n"; 
			line = this.readLine();	
		}
		
		return lines;
	}
	
	
}
