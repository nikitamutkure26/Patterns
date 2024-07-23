package patterns;

public class Starpattern2 {
	public static void main(String[] args) {
		int num=9;
		int spaces=5;
		int star=1;
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=spaces;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++) {
				System.out.print("*"+" ");
			}
			if(i<=num/2) {
				star++;
				spaces--;
			}
			else {
				star--;
				spaces++;
			}
			System.out.println();
		}
	}

}
