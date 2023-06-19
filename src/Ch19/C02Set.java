package Ch19;

import java.util.*;

public class C02Set {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<>(Arrays.asList("HTML/CSS/JS","React","Redux","Typescript"
				,"Mysql"));
		
		System.out.println("개수 확인 : "+set.size());
		set.remove("React");
		System.out.println("개수 확인 : "+set.size());
		
		for(String el : set) {
			System.out.println(el);
		}
	}
}
