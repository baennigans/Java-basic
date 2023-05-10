package kr.ac.kopo.day19;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import kr.ac.kopo.util.FileClose;

public class FileIOMain05 {

	// Koala.jpg -> Koala3.jpg 복사
	public static void main(String[] args) {
		
		FileInputStream 	 fis = null;
		FileOutputStream 	 fos = null;
		
		BufferedInputStream  bis = null;
		BufferedOutputStream bos = null;
		
		
		try {
			fis = new FileInputStream("iotest/Desert.jpg");
			bis = new BufferedInputStream(fis);
			
			fos = new FileOutputStream("iotest/Desert5.jpg");
			bos = new BufferedOutputStream(fos);
			
			long start = System.currentTimeMillis();
			
			while(true) {
				int c = bis.read();
				if(c == -1) break;
				bos.write(c);
			}
			bos.flush();
			
			long end = System.currentTimeMillis();
			System.out.println("Desert5.jpg에 복사완료...");
			
			System.out.println("소요시간 : "+(end-start)/1000. +"초");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			FileClose.close(bis, fis);
			FileClose.close(bos, fos);
		}
	}
}
