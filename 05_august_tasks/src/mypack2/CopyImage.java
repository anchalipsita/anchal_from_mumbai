// Task 1 - Create file copy of an image.
	//          InputStream -> FileInputStream, BufferedInputStream
	//          OutputStream - FileOutputStream, BufferedOutputStream

package mypack2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.*;

public class CopyImage {

	public static void main(String[] args) {
		try {
			FileInputStream reader = new FileInputStream("C:\\Users\\HP\\Pictures\\Saved Pictures\\droplet_photo.jpg");
			BufferedInputStream br = new BufferedInputStream(reader);
			BufferedOutputStream bw = new BufferedOutputStream(new FileOutputStream("C:\\Users\\HP\\Pictures\\Camera Roll\\water.jpg"));
			byte[] buffer = new byte[1024];
			int length;
			while ((length = br.read(buffer)) > 0) {
				System.out.print((byte) length);
				bw.write(buffer,0,length);
			}
			
			br.close();			
			reader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}

