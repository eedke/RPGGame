package dev.edoedo.rpggame;

import dev.edoedo.rpggame.gfx.GameCamera;
import dev.edoedo.rpggame.input.KeyManager;
import dev.edoedo.rpggame.input.MouseManager;
import dev.edoedo.rpggame.worlds.World;

public class Handler {
	
	private Game game;
	private World world;
	
	public Handler(Game game) {
		this.game = game;
	}
	
	public int getWidth() {
		return game.getWidth();
	}
	
	public MouseManager getMouseManager() {
		return game.getMouseManager();
	}
	
	public int getHeight() {
		return game.getHeight();
	}

	public GameCamera getGameCamera(){
		return game.getGameCamera();
	}
	
	public KeyManager getKeyManager() {
		return game.getKeyManager();
	}
	
	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}

	public World getWorld() {
		return world;
	}

	public void setWorld(World world) {
		this.world = world;
	}

}
