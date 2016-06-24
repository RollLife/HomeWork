package Work;

import java.util.Scanner;

public class ArrayGame {

	public static void main(String[] args) {
		int[][] bae = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};		
		Scanner scan = new Scanner(System.in);
		
		//while�� �ݺ��� �� �ְ� ���ִ� ����
		boolean loop = true;
		
		while(loop){
			//while���� �ݺ��� ���߰����ִ� ����(0���� �ʱ�ȭ ��������� )
			int count=0;
			
			//count�� 16�� �Ǹ� ����			
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
			System.out.println("\n1: ��, 2: ��, 3: ��, 4: �Ʒ�");
			int a = scan.nextInt();
			switch(a){
				//�������� ����Ʈ 
				case 1:
					for(int i=0;i<4;i++){
						for(int j=0;j<3;j++){
							bae[i][j] = bae[i][j+1];
						}
						bae[i][3] = 0;
					}
					outpri(bae);
					break;
				//���������� ����Ʈ
				case 2:
					for(int i=0;i<4;i++){
						for(int j=3;j>0;j--){
							bae[i][j] = bae[i][j-1];
						}
						bae[i][0] =0;
					}
					outpri(bae);
					break;
				// �������� ����Ʈ
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
				// �Ʒ������� ����Ʈ
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
					System.out.println("�߸��Է��ϼ̾�� �ٽ��Է��ϼ���");
			}
			
		}

		//�޼ҵ� �װ��� ����� �� �迭������ �ȿ��� ����ֱ� ( ���ȭ)
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
