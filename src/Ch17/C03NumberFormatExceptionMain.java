package Ch17;

public class C03NumberFormatExceptionMain {
	public static void main(String[] args) {

		String data1 = "100";
		String data2 = "3a00";

		int values1 = 0;
		int values2 = 0;

		try {
			values1 = Integer.parseInt(data1);
			values2 = Integer.parseInt(data2); // ���ڰ� ���Ե� ���� Integer

		} catch (NumberFormatException e) {
//			e.printStackTrace();
			System.out.println("���ܹ߻��� �����ڵ�");
		} finally {
			System.out.println("���ܹ߻����� ������� ������ �����ڵ�");
		}
		int result = values1 + values2;
		System.out.println(data1 + "+" + data2 + "=" + result);
	}
}
