/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chilakalapudi
 */
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;

import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;

public class PrintPDF {
	public static void print(String[] box1, String[] box2, String[] box3, String[] box4, String[] box5, String[] box6,
			String[] box7, String[] box8, String[] box9, String[] box0, int maxsize, String text1sum, String text2sum,
			String text3sum, String text4sum, String text5sum, String text6sum, String text7sum, String text8sum,
			String text9sum, String text0sum, String texttotal, String name, String date) throws Exception {
		// Creating a PdfDocument object

		String dest = "./" + name + "-" + date + ".pdf";
		PdfWriter writer = new PdfWriter(dest);

		// Creating a PdfDocument object
		PdfDocument pdf = new PdfDocument(writer);

		// Creating a Document object
		Document doc = new Document(pdf);

		// Creating a Paragraph
		Paragraph paragraph1 = new Paragraph("NAME:" + name);
		Paragraph paragraph2 = new Paragraph("DATE:" + date);
		Paragraph paragraph3 = new Paragraph("");

		doc.add(paragraph1);
		doc.add(paragraph2);
		doc.add(paragraph3);

		// Creating a table
		float[] pointColumnWidths = { 150F, 150F, 150F, 150F, 150F, 150F, 150F, 150F, 150F, 150F };
		Table table = new Table(pointColumnWidths);

		// Adding cells to the table
		table.addCell(new Cell().add("1"));
		table.addCell(new Cell().add("2"));
		table.addCell(new Cell().add("3"));
		table.addCell(new Cell().add("4"));
		table.addCell(new Cell().add("5"));
		table.addCell(new Cell().add("6"));
		table.addCell(new Cell().add("7"));
		table.addCell(new Cell().add("8"));
		table.addCell(new Cell().add("9"));
		table.addCell(new Cell().add("0"));
		for (int x = 0; x < maxsize; x++) {
			// Adding data
			if (box1.length > x) {
				table.addCell(new Cell().add("" + box1[x]));
			} else {
				table.addCell(new Cell().add(""));
			}
			if (box2.length > x) {
				table.addCell(new Cell().add("" + box2[x]));
			} else {
				table.addCell(new Cell().add(""));
			}
			if (box3.length > x) {
				table.addCell(new Cell().add("" + box3[x]));
			} else {
				table.addCell(new Cell().add(""));
			}
			if (box4.length > x) {
				table.addCell(new Cell().add("" + box4[x]));
			} else {
				table.addCell(new Cell().add(""));
			}
			if (box5.length > x) {
				table.addCell(new Cell().add("" + box5[x]));
			} else {
				table.addCell(new Cell().add(""));
			}
			if (box6.length > x) {
				table.addCell(new Cell().add("" + box6[x]));
			} else {
				table.addCell(new Cell().add(""));
			}
			if (box7.length > x) {
				table.addCell(new Cell().add("" + box7[x]));
			} else {
				table.addCell(new Cell().add(""));
			}
			if (box8.length > x) {
				table.addCell(new Cell().add("" + box8[x]));
			} else {
				table.addCell(new Cell().add(""));
			}
			if (box9.length > x) {
				table.addCell(new Cell().add("" + box9[x]));
			} else {
				table.addCell(new Cell().add(""));
			}
			if (box0.length > x) {
				table.addCell(new Cell().add("" + box0[x]));
			} else {
				table.addCell(new Cell().add(""));
			}
		}
		// Adding totals
		table.addCell(new Cell().add("Total"));
		table.addCell(new Cell().add("Total"));
		table.addCell(new Cell().add("Total"));
		table.addCell(new Cell().add("Total"));
		table.addCell(new Cell().add("Total"));
		table.addCell(new Cell().add("Total"));
		table.addCell(new Cell().add("Total"));
		table.addCell(new Cell().add("Total"));
		table.addCell(new Cell().add("Total"));
		table.addCell(new Cell().add("Total"));

		// Adding totals summary
		table.addCell(new Cell().add("" + text1sum));
		table.addCell(new Cell().add("" + text2sum));
		table.addCell(new Cell().add("" + text3sum));
		table.addCell(new Cell().add("" + text4sum));
		table.addCell(new Cell().add("" + text5sum));
		table.addCell(new Cell().add("" + text6sum));
		table.addCell(new Cell().add("" + text7sum));
		table.addCell(new Cell().add("" + text8sum));
		table.addCell(new Cell().add("" + text9sum));
		table.addCell(new Cell().add("" + text0sum));

		// Adding Table to document
		doc.add(table);

		Paragraph paragraph4 = new Paragraph("TOTAL:" + texttotal);
		doc.add(paragraph4);
		// Closing the document
		doc.close();
		System.out.println("Table created successfully..");
	}

	public static void saveData(String[] box1, String[] box2, String[] box3, String[] box4, String[] box5,
			String[] box6, String[] box7, String[] box8, String[] box9, String[] box0, int maxsize, String text1sum,
			String text2sum, String text3sum, String text4sum, String text5sum, String text6sum, String text7sum,
			String text8sum, String text9sum, String text0sum, String texttotal, String name, String dateObj)
			throws Exception {
		// Creating a PdfDocument object

		String data = name + "," + dateObj + ",\"" + replaceCommainArray(Arrays.toString(box1)) + "\",\""
				+ replaceCommainArray(Arrays.toString(box2)) + "\",\"" + replaceCommainArray(Arrays.toString(box3))
				+ "\",\"" + replaceCommainArray(Arrays.toString(box4)) + "\",\""
				+ replaceCommainArray(Arrays.toString(box5)) + "\",\"" + replaceCommainArray(Arrays.toString(box6))
				+ "\",\"" + replaceCommainArray(Arrays.toString(box7)) + "\",\""
				+ replaceCommainArray(Arrays.toString(box8)) + "\",\"" + replaceCommainArray(Arrays.toString(box9))
				+ "\",\"" + replaceCommainArray(Arrays.toString(box0)) + "\"," + text1sum + "," + text2sum + ","
				+ text3sum + "," + text4sum + "," + text5sum + "," + text6sum + "," + text7sum + "," + text8sum + ","
				+ text9sum + "," + text0sum + "," + texttotal;

		replaceLine(name + "," + dateObj, data);
	}

	public static String replaceCommainArray(String arraydata) {
		arraydata = arraydata.replace(",", ";");
		return arraydata;
	}

	public static void replaceLine(String searchKey, String data) {
		try {
			int lineNumber = 0;
			boolean keyfound = false;
			Path path = Paths.get("database.csv");
			List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);
			// System.out.println(lines);
			if (lines.size() > 1) {
				for (int key = 0; key < lines.size(); key++) {
					if ((lines.get(key)).startsWith(searchKey)) {
						lineNumber = key;
						keyfound = true;
						break;
					}
				}
				if (keyfound) {
					lines.set(lineNumber, data);
				} else {
					lines.add(data);
				}

			} else {
				// add a new row
				lines.add(data);
			}
			Files.write(path, lines, StandardCharsets.UTF_8);
		} catch (Exception ex) {
			System.out.println(ex);
			ex.printStackTrace();
		}
	}

	public static String retrieveData(String searchKey) {
		String dataline = "";
		try {
			Path path = Paths.get("database.csv");
			List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);
			for (int key = 0; key < lines.size(); key++) {
				if ((lines.get(key)).startsWith(searchKey)) {
					dataline = lines.get(key);
					break;
				}
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return dataline;
	}
}
