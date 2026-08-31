package day06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetAndList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List <String> ls = new ArrayList<String>();
		ls.add("Noor");
		ls.add("Ola");
		ls.add("Lyana");
		ls.add("Farah");
		   System.out.println(ls.get(0));
		for (String name : ls) {
			System.out.println(name);
		}
		Collections.sort(ls);
		 
		
		Set<Integer> st =new HashSet<Integer>();
		st.add(21);
		st.add(44);
		st.add(78);
		st.add(67);
		st.add(100);
		
		for (Integer num : st) {
			System.out.println(num);
		}
		
		List<Integer> list= new ArrayList<Integer>(st);
		System.out.println(list.get(0));
		System.out.println(list.get(2));
		
	}
		

}
