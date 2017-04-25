package com.sushank.logicsmaven;

import java.io.File;
import java.io.IOException;

import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.parser.PdfTextExtractor;

public class ReadPDF {
	public static void main(String []args) throws IOException {
		final File folder = new File("C:\\Users\\sushank_dahiwadkar\\Desktop\\payslips");
		for (final File fileEntry : folder.listFiles()) {
			System.out.println(fileEntry.getAbsolutePath());
			readPFAmount(fileEntry.getAbsolutePath());
			
		}
	}
	
	private static void readPFAmount (String filePath) throws IOException {
		 PdfReader pdfReader = new PdfReader(filePath);
		 String textFromPage = PdfTextExtractor.getTextFromPage(pdfReader, 1);
		 //System.out.println(textFromPage);
		 
		 if (textFromPage.contains("Provident Fund")) {
			 int index = textFromPage.indexOf("Provident Fund");
			 System.out.println(textFromPage.substring(index+15, index+23));
		 }
		 pdfReader.close();
	}
	
	
}
