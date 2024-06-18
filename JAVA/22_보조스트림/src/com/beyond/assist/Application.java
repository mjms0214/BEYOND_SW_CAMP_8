package com.beyond.assist;

import com.beyond.assist.practice.A_ByteToCharStream;
import com.beyond.assist.practice.B_BufferedStream;
import com.beyond.assist.practice.C_DataStream;
import com.beyond.assist.practice.D_ObjectStream;

public class Application {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		
//		new A_ByteToCharStream().inputStreamReader();
//		new A_ByteToCharStream().outputStreamReader();
		
//		new B_BufferedStream().fileSave();
//		new B_BufferedStream().fileRead();
		
//		new C_DataStream().fileSaveAndRead();
		
//		new D_ObjectStream().fileSave();
//		new D_ObjectStream().fileRead();
//		new D_ObjectStream().objectsSave();
		new D_ObjectStream().objectsRead();

		System.out.println("프로그램 종료");
	}

}
