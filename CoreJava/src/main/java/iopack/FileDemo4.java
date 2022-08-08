package iopack;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class FileDemo4 {

	public static void main(String[] args) {
		URLConnection urlcon=null;
		//urlcon.getInputStream();
		try {
		URL url=new URL("http://www.google.com/index.html");
		 urlcon=url.openConnection();
		}catch(Exception e) {
			e.printStackTrace();
		}
		//try with resources...
		try(
				
				BufferedReader fis=new BufferedReader(new InputStreamReader(urlcon.getInputStream()));
				FileWriter fos=new FileWriter("newfile.html");
			){		
			
		char[] b=new char[128];
		int bytesread=0;
		while((bytesread=fis.read(b))!=-1) {
			//String s=new String(b,0,bytesread);
			fos.write(b, 0, bytesread);
		}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
