package iopack;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileDemo2 {

	public static void main(String[] args) {
		File file = new File("applog.txt");

		System.out.println(file.getAbsoluteFile());

		System.out.println(file.canExecute());

		System.out.println(file.exists());
		FileReader fis = null;
		FileWriter fos = null;
		try {
			fis = new FileReader(file);
			fos = new FileWriter("newfile.txt");
			char[] b = new char[4];
			int bytesread = 0;
			while ((bytesread = fis.read(b)) != -1) {
				// String s=new String(b,0,bytesread);
				fos.write(b, 0, bytesread);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fos.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
