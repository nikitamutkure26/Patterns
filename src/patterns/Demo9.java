package patterns;

public class Demo9 {
	public static void main(String[] args) {
		int num=5;
		for(int i=1;i<=num;i++) {
			if(i%2!=0) {
			for(int j=1;j<=num;j++) {
				System.out.print(j+" ");
			}
		}
			else {
				for(int j=num;j>0;j--) {
					System.out.print(j+" ");
				}
			}
			System.out.println();
			}
	}

}
