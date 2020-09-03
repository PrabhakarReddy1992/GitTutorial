package com;


import java.util.Arrays;
import java.util.List;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> namesList=Arrays.asList("Prabha","Raji");
		for(int i=0;i<namesList.size();i++ ) {
			System.out.println(namesList.get(i));
		}

	}

}
