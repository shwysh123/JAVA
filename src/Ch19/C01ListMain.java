package Ch19;

import java.util.*;

/* CRUD(Create, Read, Update, Delete)
    삽입
    조회
    수정
    삭제
 */

public class C01ListMain {
		public static void main(String[] args) {
			List<String> list1 = new ArrayList<String>();
				
			//추가,삽입
				list1.add("HTML/CSS/JS");
				list1.add("React");
				list1.add("Redux");
				list1.add("Typescript");
				list1.add("Mysql");
				list1.add("JAVA");
				list1.add("JSP/Servlet");
				list1.add("SpringFramework");
				list1.add("SpringBoot");
				list1.add("Git/Github");
				list1.add("AWS");
				list1.add("AWS");//중복허용 확인
			//조희	
				System.out.println("개수확인 : "+list1.size());
				System.out.println("1 idx의 값 : "+list1.get(1));
				System.out.println("JAVA가 저장된 idx : "+list1.indexOf("JAVA"));
			//삭제
				list1.remove(0);  //HTML/CSS/JS 삭제
				list1.remove("Mysql"); //Mysql 삭제
				System.out.println("개수확인 : "+list1.size());
				String result = "";
				for(int i=0;i<list1.size(); i++) {
					result += list1.get(i);
					result += ",";
				}	result = result.substring(0,result.length() -1);
					System.out.println(result);
					
					for(String el : list1) {
						System.out.println(el);
					}
					list1.clear();
					for(String el : list1) {
						System.out.println(el);
					}
				
			}
		}

