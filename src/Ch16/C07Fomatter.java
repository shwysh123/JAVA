package Ch16;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class C07Fomatter {
		public static void main(String[] args) throws Exception {
			Scanner sc = new Scanner(System.in);
			System.out.println("YYYY/MM/DD �Է� : " );
			String ymd =sc.next();
			//������ ��ü ����(�Է¹������� ������)
			SimpleDateFormat fmtin = new SimpleDateFormat("yyyy/MM/dd");
			
			System.out.println(ymd);
			Date date = fmtin.parse(ymd);
			System.out.println(date);
			
			//������ ��ü ����(����Ҷ��� ������)
			SimpleDateFormat fmtout = new SimpleDateFormat("yyyy-MM-dd");
			System.out.println(fmtout.format(date));
		}
}
