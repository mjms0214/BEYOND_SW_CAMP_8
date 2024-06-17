package com.beyond.assist.practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class B_BufferedStream {
	public void fileSave() {
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("a_buffer.txt", true));
			bw.write("안녕하세요.");
			bw.newLine(); // BufferedWriter가 제공하는 메소드이다. (개행할 때 사용)
			bw.write("줄바꿈이 적용되었나요??");
			bw.newLine();
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void fileRead() {
		try (BufferedReader br = new BufferedReader(new FileReader("a_buffer.txt"))) {
			
			String line = null;
			
			// BufferedReader가 제공하는 메소드, 파일에서 한 줄을 읽어올 때 사용한다.
//			line = br.readLine();
//			System.out.println(line);
//
//			line = br.readLine();
//			System.out.println(line);
			
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
