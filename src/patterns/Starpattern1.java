package patterns;

public class Starpattern1 {
	public static void main(String[] args) {
		int num=5;
		int star=1;
		int spaces=num-1;
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=spaces;j++) {
				System.out.print(" "+" ");
			}
			for(int j=1;j<=star;j++) {
				System.out.print("*"+" ");
			}
			star++;
			spaces--;
			System.out.println();
		}
	}

}
