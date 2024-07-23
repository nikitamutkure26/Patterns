package patterns;

public class Demopattern2 {
	public static void main(String[] args) {
		int count=1;
		int num=5;
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(count+" ");
				count++;
			}
			System.out.println();
		}
	}

}
