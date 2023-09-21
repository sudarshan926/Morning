package unmodifide;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class unmodifide1 {

	public static void main(String[] args) {
		ArrayList<Integer> a1 = new ArrayList();
		a1.add(100);
		a1.add(13);

		System.out.println("unmodifiable list");
		List<Integer> i = Collections.singletonList(13);
		i.add(100);// unmodifiablelist
		System.out.println(13);
	}
	

	
	}


