package com.beyond.fileio.practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class A_FileByteStream {
	public void fileSave() {
		FileOutputStream fos = null;
		byte[] array = {99, 100, 101, 102};
		
		try {
//			fos = new FileOutputStream("a_byte.dat");
			fos = new FileOutputStream("a_byte.dat", true);
			
			fos.write(97); // 'a'
			fos.write('b');
			fos.write(10); // 줄바꿈
			fos.write('a');
			fos.write(10); // 줄바꿈
			fos.write('홍');
			fos.write(10); // 줄바꿈
			fos.write(array);
			fos.write(10); // 줄바꿈
			fos.write(array, 1, 2);
			
			fos.flush();
			
			/*
			 *  위의 write() 메소드에서 IOException이 발생했을 경우 close()가 실행되지 않는다.
			 *  따라서, finally 블록 안에서 close() 메소드를 실행해야 한다.
			 */
//			fos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void fileRead() {
		FileInputStream fis = null;
		byte[] array = new byte[50];
		
		try {
			// 파일이 존재하지 않으면 FileNotFoundException 예외가 발생한다.
			fis = new FileInputStream("a_byte.dat");
			
//			System.out.println((char)fis.read());
//			System.out.println((char)fis.read());
//			System.out.println((char)fis.read());
////			System.out.println(fis.read(array));
//			System.out.println(fis.read(array, 10, 10));
//			System.out.println(Arrays.toString(array));
//			System.out.println(fis.read());
			
			// read() 메소드가 2번 실행되기 때문에 정상적으로 값을 출력할 수 없다.
//			while(fis.read() != -1) {
//				System.out.println((char)fis.read());
//			}

			int value = 0;
			while((value = fis.read()) != -1) {
				System.out.print((char) value);
			}
			System.out.println();
						
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
