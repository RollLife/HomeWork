package test1;

public class BlizardGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Blizard[] bli = new Blizard[6];
		bli[0] = new StarCraft();
		bli[1] = new WarCraft();
		bli[2] = new Diablo();
		bli[3] = new HearthStone();
		bli[4] = new HerosOfStorm();
		bli[5] = new OverWatch();
		
		for(Blizard game : bli){
			game.name();
			game.release();
			game.genre();
			game.platform();
			System.out.println("------------------");
		}

	}

}
