package com.mahesh.Array_List;

public class StudentComparable implements Comparable<StudentComparable> {
	int age;
	String loc;
	
	
	
	
	public StudentComparable(int age,String loc) {
		this.age=age;
		this.loc=loc;
	}

	@Override
	public String toString() {
		return "StudentComparable [age=" + age + ", loc=" + loc + "]";
	}


@Override
public int compareTo(StudentComparable studentComparable) {
// TODO Auto-generated method stub
	if(age==studentComparable.age) {
		return 0;
	}
	else if(age>studentComparable.age) {
		return 1;
	}
	else {
	return -1;
}
} 
	

public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}

