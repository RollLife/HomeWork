
public class RoomOpen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= new int[100];
		

		for(int i=0;i<100;i++){
			a[i]=0;

		}
		for(int i=2;i<=100;i++){
			for(int j=0;j<100;j++){
				if((j+1)%i==0){
					if(a[j]==1){
						a[j]=0;
					}else if(a[j]==0){
						a[j]=1;
					}
				}
			}
		}
		
		//1이란 값을 닫힘이라고 적고 -1은 열림이라고 적음 count를 -1 
		System.out.println("닫힌문");
		for(int i=0;i<100;i++){
			if(a[i] == 0) System.out.println((i+1) + "번문");
		}
		System.out.println("열린 문");
		for(int i = 0; i < 100; i++){
			if(a[i] == 1) System.out.println((i+1) + "번문");
		}
		
	}

}
