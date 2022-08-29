package test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Sample {
	long[] ph= new long[10];String name;long s1;
	Scanner s = new Scanner(System.in);
public void input() {
	System.out.println("enter your phone number : ");
	for (int i = 0; i <1; i++) {
		int phone = s.nextInt();
		ph[i]=phone;
		}
//System.out.println("enter your name");
//name = s.next();
	}

public void compare() {
for (int i = 0; i < ph.length; i++) {
	 s1=ph[i]+ph[i+1];
	ph[i]=s1;
	
}System.out.println(s1);
}
	
	

	
public static void main(String[] args) {
	
	Sample s = new Sample();
	s.input();
	s.compare();
}
}