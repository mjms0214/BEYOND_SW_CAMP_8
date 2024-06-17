package com.beyond.assist.practice;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class C_DataStream {
	public void fileSaveAndRead() {
		try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("b_data.txt"));
			 DataInputStream dis =  new DataInputStream(new FileInputStream("b_data.txt"))){
			// 파일에 출력하기
			dos.writeUTF("홍길동");
			dos.writeInt(30);
			dos.writeDouble(170.5);
			dos.writeChar('남');
			dos.writeBoolean(false);
			
			System.out.printf("이름은 %s이고 나이는 %d세, 키는 %.1fcm, 성별은 %C, 결혼 여부는 %b입니다.\n",
					dis.readUTF(), dis.readInt(), dis.readDouble(), dis.readChar(), dis.readBoolean());
			
//			System.out.println(dis.readUTF());
//			System.out.println(dis.readInt());
//			System.out.println(dis.readDouble());
//			System.out.println(dis.readChar());
//			System.out.println(dis.readBoolean());
			
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
