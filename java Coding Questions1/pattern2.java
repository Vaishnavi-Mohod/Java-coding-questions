public class pattern2{
	public static void printpattern(int n){
		int i,j,k;
		
		for(i = n;i >= 1;i--){
			for(j = i;j<n; j++){
				System.out.print(" ");
			}
			for(k=1;k <= (2*i-1);k++){
				if(k == 1 || i == n || k == (2 * i -1)){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}
		
	}
	public static void main(String[] args){
		int n = 5;
		printpattern(n);
	}
}