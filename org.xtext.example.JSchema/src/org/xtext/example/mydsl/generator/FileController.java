package org.xtext.example.mydsl.generator;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileController {
	
	String path;
	
	public FileController(String path) {
		this.path = path;
	}
	
	
	
	public void writeFile(String file) {
		Path p= Paths.get(this.path);
		PrintWriter pr;
		
		try {
		 pr = new PrintWriter(Files.newBufferedWriter(p));
		} catch (IOException io) {
		 throw new RuntimeException("newBufferedWriter threw IO Exception");
		}
		 pr.write(file);
		
		pr.close();
	}

}
