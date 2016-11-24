package com.javaweb.training;

/**
 * Hello world!
 *
 */
public class MementoGame {
	public static void main(String[] args) {
		Game game = new Game();
		game.set(30, "1");
		System.out.println(game);
		
		File file = new File();
		file.setSave(game.save());
		
		game.set(1000, "2");
		System.out.println(game);
		
		game.load(file.getSave());
		System.out.println("Loaded game : " + game);
	}
}

class Game {
	private int ms;
	private String level;

	public void set(int ms, String level) {
		this.ms = ms;
		this.level = level;
	}
	
	public void load(Save save){
		level = save.getLevel();
		ms = save.getMs();
	}
	public Save save(){
		return new Save(ms, level);
	}

	@Override
	public String toString() {
		return "Game [ms=" + ms + ", level=" + level + "]";
	}
	
	
}

class Save {
	private final int ms;
	private final String level;
	public Save(int ms, String level) {
		super();
		this.ms = ms;
		this.level = level;
	}
	public int getMs() {
		return ms;
	}
	public String getLevel() {
		return level;
	}
}
class File{
	Save save;

	public Save getSave() {
		return save;
	}

	public void setSave(Save save) {
		this.save = save;
	} 
	
}