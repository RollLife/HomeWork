package Work;

public class CarBoard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//오름차순
//		try{
//			String Car = "";
//			
//			
//			
//		}catch(Exception e){
//			System.out.println("챱");
//		}
		for(int serial=0;serial<10000;serial++){
			String number = String.format("%04d", serial);
			if(Integer.parseInt(number.substring(0, 1))<Integer.parseInt(number.substring(1, 2))&&
					Integer.parseInt(number.substring(0, 1))<Integer.parseInt(number.substring(2, 3))&&
					Integer.parseInt(number.substring(0, 1))<Integer.parseInt(number.substring(3, 4))&&
					Integer.parseInt(number.substring(1, 2))<Integer.parseInt(number.substring(2, 3))&&
					Integer.parseInt(number.substring(1, 2))<Integer.parseInt(number.substring(3, 4))&&
					Integer.parseInt(number.substring(2, 3))<Integer.parseInt(number.substring(3, 4))){
				System.out.println(number);
			}
		}
		
		

	}

}
