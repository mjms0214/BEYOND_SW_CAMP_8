package com.beyond.stream.practice;

import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Student implements Comparable<Student>{
	private String name;
	private int age;
	private String gender;
	private int math;
	private int english;
	
	public double avg() {
		return (this.math + this.english) / 2.0;
	}
	
	@Override
	public int compareTo(Student student) {
	    return this.age - student.age;
	}
	
	
//	@Override
//	public int hashCode() {
//		return Objects.hash(age, english, gender, math, name);
//	}
//	
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Student other = (Student) obj;
//		return age == other.age && english == other.english && Objects.equals(gender, other.gender)
//				&& math == other.math && Objects.equals(name, other.name);
//	}
}
