package Work;

import java.util.Scanner;

public class ScanPerfect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		for(int i=1;i<a;i++){
			int sum = 0;
			for(int j=1;j<i; j++){
				if(i%j==0){
					sum+=j;	
				}
			}
			if(sum==i){
				System.out.println(i);
			}
		}
	}

}
