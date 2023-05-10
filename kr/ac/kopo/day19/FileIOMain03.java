package kr.ac.kopo.day19;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileIOMain03 {

	// Koala.jpg -> Koala3.jpg 복사
	public static void main(String[] args) {
		
		try {
			FileInputStream fis = new FileInputStream("iotest/Desert.jpg");
			BufferedInputStream bis = new BufferedInputStream(fis);
			
			FileOutputStream fos = new FileOutputStream("iotest/Desert3.jpg");
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			
			long start = System.currentTimeMillis();
			
			while(true) {
				int c = bis.read();
				if(c == -1) break;
				bos.write(c);
			}
			bos.flush();
			
			long end = System.currentTimeMillis();
			System.out.println("Desert3.jpg에 복사완료...");
			
			System.out.println("소요시간 : "+(end-start)/1000. +"초");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

