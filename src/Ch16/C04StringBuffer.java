package Ch16;

public class C04StringBuffer {

			public static void main(String[] args) {
				
				String str1 = "Hello";
				System.out.println("STR1 : "+ System.identityHashCode(str1));
				String str2 = " Wapper";
				str1 = str1.concat(str2);
				System.out.println(str1);
				System.out.println("STR1 : "+ System.identityHashCode(str1));
				
				long startTime = System.currentTimeMillis(); 
//				String str="";	
//				for(int i=0;i<=1000000000;i++) {
//						str+="H";
//					}
				
				StringBuffer buffer = new StringBuffer();
				for(int i = 0 ; i <= 500000;i++) {
					buffer.append('H');
				}
				long endTime = System.currentTimeMillis();
				
				System.out.println("소요시간 "+ (endTime-startTime)+"ms");
				
			}
}
