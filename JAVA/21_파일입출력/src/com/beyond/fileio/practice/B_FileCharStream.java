package com.beyond.fileio.practice;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class B_FileCharStream {
	public void fileSave() {
	
		// try-with-resource 문을 통해서 사용한 리소스를 자동으로 close() 시킨다.
		try (FileWriter fw = new FileWriter("b_char.txt", true)) {
			
			fw.write('A');
			fw.write('\n');
			fw.write('홍');
			fw.write('\n');
			fw.write(new char[] {'a', 'p', 'p', 'l', 'e'});
			fw.write('\n');			
			fw.write(new char[] {'a', 'p', 'p', 'l', 'e'}, 2, 3);
			fw.write('\n');			
			fw.write("안녕하세요.\n");
			fw.write("IO 재미있으신가요....???\n");
			fw.write("IO 재미있으신가요....???\n", 10, 7);
			fw.write('\n');			
			fw.flush();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public void fileRead() {
		try (FileReader fr = new FileReader("b_char.txt")) {
			
			int value = 0;
			while ((value = fr.read()) != -1) {
				System.out.print((char)value);
			}
			System.out.println();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
}
