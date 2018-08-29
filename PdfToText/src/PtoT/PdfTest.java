package PtoT;

import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class PdfTest {
public static void main(String[] args) throws IOException {
//	  PDFManager pdf = new PDFManager();
//    // pdf.setFilePath("/Users/jatinanand/Desktop/PDFForTest/JatinVintimamDoudt.pdf");
//	pdf.setFilePath("/Users/jatinanand/Desktop/PDFForTest/ResultIPU.pdf");
//      System.out.println(pdf.ToText());
	String SynopsisSimridhi = "/Users/jatinanand/Downloads/synopsisfinal.pdf";
	File file = new File(SynopsisSimridhi);
    PDDocument document = PDDocument.load(file);
//	PDDocument document = PDDocument.load("/Users/jatinanand/Desktop/PDFForTest/JatinVintimamDoudt.pdf");
	PDFTextStripper s = new PDFTextStripper();
	String content = s.getText(document);
	System.out.println("Data  = "+content);
	
	
	
//	File file = new File("/Users/jatinanand/Desktop/PDFForTest/JatinVintimamDoudt.pdf");
//    PDDocument document = PDDocument.load(file);
//    PDFTextStripperByArea stripper = new PDFTextStripperByArea();
//    stripper.setSortByPosition( true );
//    Rectangle rect1 = new Rectangle( 50, 140, 60, 20 );
//    Rectangle rect2 = new Rectangle( 110, 140, 20, 20 );
//    stripper.addRegion( "row1column1", rect1 );
//    stripper.addRegion( "row1column2", rect2 );
//   List allPages = ((Object) document.getDocumentCatalog()).getAllPages();
//    PDPage firstPage = (PDPage)allPages.get( 2 );
//    stripper.extractRegions( firstPage );
//    System.out.println(stripper.getTextForRegion( "row1column1" ));
//    System.out.println(stripper.getTextForRegion( "row1column2" ));
}
}
