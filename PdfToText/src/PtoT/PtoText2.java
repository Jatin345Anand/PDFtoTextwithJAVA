package PtoT;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import Constants.UrlsAndPaths;

import org.apache.pdfbox.io.RandomAccessRead;
import org.apache.pdfbox.pdfparser.PDFParser;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class PtoText2 {
public static void main(String[] args) {
	String string = null;
    try {
    	
       
        String s2 ="/Users/jatinanand/Desktop/PDFForTest/JatinVintimamDoudt.pdf";
        PDFParser pdfParser = new PDFParser((RandomAccessRead) new FileInputStream(s2));
        pdfParser.parse();
        PDDocument pdDocument = new PDDocument(pdfParser.getDocument());
        PDFTextStripper pdfTextStripper = new PDFTextStripper();
        string = pdfTextStripper.getText(pdDocument);
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    };
    System.out.println(string);
}
}
