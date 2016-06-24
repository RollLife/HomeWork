package Work;

import java.util.Scanner;

public class ArrayGame {

	public static void main(String[] args) {
		int[][] bae = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};		
		Scanner scan = new Scanner(System.in);
		
		//while문 반복할 수 있게 해주는 변수
		boolean loop = true;
		
		while(loop){
			//while문의 반복을 멈추게해주는 변수(0으로 초기화 시켜줘야함 )
			int count=0;
			
			//count가 16이 되면 종료			
			for(int i=0; i<4;i++){
				for(int j=0;j<4;j++){
					if(bae[i][j] == 0)
						count++;
					System.out.println(count);
				}
			}
			if(count==16){
				break;
			}
			System.out.println("\n1: 좌, 2: 우, 3: 위, 4: 아래");
			int a = scan.nextInt();
			switch(a){
				//왼쪽으로 쉬프트 
				case 1:
					for(int i=0;i<4;i++){
						for(int j=0;j<3;j++){
							bae[i][j] = bae[i][j+1];
						}
						bae[i][3] = 0;
					}
					outpri(bae);
					break;
				//오른쪽으로 쉬프트
				case 2:
					for(int i=0;i<4;i++){
						for(int j=3;j>0;j--){
							bae[i][j] = bae[i][j-1];
						}
						bae[i][0] =0;
					}
					outpri(bae);
					break;
				// 위쪽으로 쉬프트
				case 3:
					for(int i=0;i<4;i++){
						for(int j=0;j<4;j++){
							if(i==3)
								bae[3][j] = 0;
							else
								bae[i][j] = bae[i+1][j]; 
						}
					}
					outpri(bae);
					break;
				// 아래쪽으로 쉬프트
				case 4:
					for(int i=3;i>=0;i--){
						for(int j=0;j<4;j++){
							if(i==0)
								bae[0][j] = 0;
							else
								bae[i][j] = bae[i-1][j];
						}
					}
					outpri(bae);
					break;
				default:
					System.out.println("잘못입력하셨어요 다시입력하세요");
			}
			
		}

		//메소드 네개를 만들고 그 배열변수를 안에다 집어넣기 ( 모듈화)
	}

	private static void outpri(int[][] bae) {
		// TODO Auto-generated method stub
		for(int i=0; i<bae.length; i++){
			System.out.println();
			for(int j=0;j<bae[i].length;j++){
				System.out.print(bae[i][j]+" ");
			}
		}
	}

}
