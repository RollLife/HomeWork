package Work;

public class PerfectNum {

	public static void main(String[] args) {
//		int sum=0;
//		int i;
//		for(i=1;i<6;i++){
//			if(6%i==0){
//				sum+=i;
//			}
//		}
//		System.out.println(sum);
		
		for(int i=1;i<10000;i++){
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
