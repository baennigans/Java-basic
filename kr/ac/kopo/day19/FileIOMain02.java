package kr.ac.kopo.day19;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIOMain02 {

	// iotest/koala.jpg 파일을 iotest/koala2.jpg에 복사
	public static void main(String[] args) {
		
		
		try {
			FileInputStream fis = new FileInputStream("iotest/Desert.jpg");
			FileOutputStream fos = new FileOutputStream("iotest/Desert2.jpg");
			
			long start = System.currentTimeMillis();
			
			while(true) {
				int c = fis.read();
				if(c==-1)break;
				fos.write(c);
			}
			fos.flush();
			long end = System.currentTimeMillis();
			System.out.println("Desert2.jpg에 복사완료...");
		
			System.out.println("소요시간 : "+(end-start)/1000. +"초");
			
		}catch(FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		}catch(IOException io) {
			io.printStackTrace();
		}
	}
}
