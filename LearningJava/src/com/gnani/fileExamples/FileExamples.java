package com.gnani.fileExamples;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileExamples {

	public static void main(String[] args) throws IOException {
		FileExamples fe = new FileExamples();
		fe.file();
	}

	public void file() throws IOException {
		File f = new File("./Learning/Sample.txt");
		if(!f.exists())
			f.createNewFile();
		FileInputStream inp = new FileInputStream(f);
		System.out.println((char)inp.read());
		inp.close() ;		
	}
}
