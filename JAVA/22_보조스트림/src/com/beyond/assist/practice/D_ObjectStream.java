package com.beyond.assist.practice;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class D_ObjectStream {
	public void fileSave() {
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("c_object.dat"))) {

			oos.writeObject(new Member("hong123", "1234", "홍길동", 30, '남', 3537.456));
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void fileRead() {
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("c_object.dat"))) {
			Member member = (Member) ois.readObject();
			
			System.out.println(member);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void objectsSave() {
		List<Member> members = new ArrayList<>();
		
		members.add(new Member("hong123", "1234", "홍길동", 30, '남', 3537.456));
		members.add(new Member("kim123", "4567", "김철수", 24, '남', 1000.45));
		members.add(new Member("kim456", "1234", "김영희", 24, '여', 2000));
		
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("d_objects.dat"))) {

			for (Member member : members) {
				oos.writeObject(member);
				
				System.out.println(member.getId() + "객체 저장 완료!");
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void objectsRead() {
		List<Member> members = new ArrayList<>();
		
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d_objects.dat"))) {
//			members.add((Member)ois.readObject());
//			members.add((Member)ois.readObject());
//			members.add((Member)ois.readObject());

			try {
				while (true) {
					members.add((Member)ois.readObject());
					
				}
				
			} catch (EOFException e) {
				System.out.println("파일 읽기 완료");
			}
				for (Member member : members) {
					System.out.println(member);
				}
			
//			for (Member member : members) {
//				System.out.println(member);
//			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
//		} catch (EOFException e) {
//			for (Member member : members) {
//				System.out.println(member);
//			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
