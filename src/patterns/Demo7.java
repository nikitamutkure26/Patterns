package patterns;

public class Demo7 {
	public static void main(String[] args) {
		int num=5;
		int count=1;
		for(int i=1;i<num;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(count);
				count++;
			}
			System.out.println();
		}
	}

}
