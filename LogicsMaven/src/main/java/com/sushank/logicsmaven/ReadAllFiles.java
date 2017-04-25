package com.sushank.logicsmaven;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadAllFiles {
	public static void main(String []args) throws IOException {
		final File folder = new File("C:\\Users\\sushank_dahiwadkar\\Downloads\\Stage-logs-11April");
		listFilesForFolder(folder);
	}
	
	public static File listFilesForFolder(final File folder) throws IOException {
	    for (final File fileEntry : folder.listFiles()) {
	        if (fileEntry.isDirectory()) {
	            listFilesForFolder(fileEntry);
	        } else {
	           if (readFile(fileEntry)) {
	        	   break;
	           }
	        }
	    }
	    System.out.println("Not found Anywhere");
		return null;
	}

	private static boolean readFile(File fileEntry) throws IOException {
		
		FileReader fileReader = new FileReader(fileEntry);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		StringBuffer stringBuffer = new StringBuffer();
		String line;
		while ((line = bufferedReader.readLine()) != null) {
			if (line.contains("curriculum_005fdetail_jsp:963")) {
				System.out.println("found in : " + fileEntry.getAbsolutePath());
				return true;
			}
		}
		fileReader.close();
		return false;
	/*	System.out.println("Contents of file:");
		System.out.println(stringBuffer.toString());*/
	}
}
