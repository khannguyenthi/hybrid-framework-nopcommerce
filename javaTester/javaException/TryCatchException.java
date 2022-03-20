package javaException;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TryCatchException {

	public static void main(String[] args) throws InterruptedException {
		sleepInSecond(5); 
		//findFile();	
	}
	
	public static void sleepInSecond(long timeout) throws InterruptedException {
		Thread.sleep(timeout * 1000);
	}
	
	public void findFile() throws IOException {
		String fileName = "automationfc.jpg";
		File newFile = new File(fileName);
		if(newFile.exists() && !newFile.isDirectory()) {
			//Action sth
		} else {
			throw new IOException("This file does not found" + fileName);
			
		}
	}

}
