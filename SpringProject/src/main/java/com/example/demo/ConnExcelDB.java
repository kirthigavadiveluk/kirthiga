package com.example.demo;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ConnExcelDB {
	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/anoud", "root", "root");

	
		try {
			FileInputStream inputStream = new FileInputStream("C:\\Users\\kirthiga.vadivelu\\Downloads\\questions.xlsx");
			Workbook workbook = new XSSFWorkbook(inputStream);
			Sheet firstSheet = workbook.getSheetAt(0);
			Iterator<Row> rowIterator = firstSheet.iterator();
			con.setAutoCommit(false);
			String sql = "INSERT INTO questions VALUES (?, ?, ?, ?, ?, ?, ?)";
			PreparedStatement statement = con.prepareStatement(sql);
			int count = 0, count1 = 0;
			rowIterator.next();
			while (rowIterator.hasNext()) {
				Row nextRow = rowIterator.next();
				Iterator<Cell> it = nextRow.cellIterator();
				while (it.hasNext()) {
					Cell cell = it.next();
					int columnIndex = cell.getColumnIndex();
					switch (columnIndex) {
					case 0:
						count1 = count1 + 1;
						statement.setInt(1, count1);
						break;
					case 1:
						String QName = cell.getStringCellValue();
						statement.setString(2, QName);
						break;
					case 2:
						String A = cell.getStringCellValue();
						statement.setString(3, A);
						break;
					case 3:
						String B = cell.getStringCellValue();
						statement.setString(4, B);
						break;
					case 4:
						String C = cell.getStringCellValue();
						statement.setString(5, C);
						break;
					case 5:
						String D = cell.getStringCellValue();
						statement.setString(6, D);
						break;
					case 6:
						String Answer = cell.getStringCellValue();
						statement.setString(7, Answer);
					}
				}
				statement.addBatch();
				if (count % 100 == 0) {
					statement.executeBatch();
				}
			}
			workbook.close();
			
			statement.executeBatch();
			con.commit();
			con.close();
		} catch (IOException ex1) {
			System.out.println("Error reading file");
			ex1.printStackTrace();
		} catch (SQLException ex2) {
			System.out.println("Database error");
			ex2.printStackTrace();
		}
	}
	}
