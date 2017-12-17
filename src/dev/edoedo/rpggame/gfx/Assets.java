package dev.edoedo.rpggame.gfx;

import java.awt.image.BufferedImage;

public class Assets {
	
	private static final int width = 32, height = 32;

	public static BufferedImage grass, dirt, stone, tree;
	public static BufferedImage[] player_down, player_up, player_left, player_right;
	public static BufferedImage zombie_down, zombie_up, zombie_left, zombie_right;
	public static BufferedImage wood;
	public static BufferedImage[] btn_start;
	
	public static void init() {
		
		SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("/textures/spritesheet.png"));
		SpriteSheet sheet2 = new SpriteSheet(ImageLoader.loadImage("/textures/runningchar.png"));
		SpriteSheet sheet3 = new SpriteSheet(ImageLoader.loadImage("/textures/spritestart.png"));
		SpriteSheet sheet4 = new SpriteSheet(ImageLoader.loadImage("/textures/zombie70.png"));
		
		btn_start = new BufferedImage[2];
		btn_start[0] = sheet3.crop(0,  0,  width*8, height*4);
		btn_start[1] = sheet3.crop(0,  height*4,  width*8, height*4);
		
		player_down = new BufferedImage[2];
		player_up = new BufferedImage[2];
		player_left = new BufferedImage[2];
		player_right = new BufferedImage[2];
		
		wood = new SpriteSheet(ImageLoader.loadImage("/textures/twigs.png")).crop(width*0, 0, width*2, height*2);
		
		zombie_down = sheet4.crop(width*0, 0, width*2, height*2);
		zombie_up = sheet4.crop(width*0, height*4, width*2, height*2);
		zombie_left = sheet4.crop(width*0, height*6, width*2, height*2);
		zombie_right = sheet4.crop(width*2, height*2, width*2, height*2);
		
		player_down[0] = sheet2.crop(width*0, 0, width, height);
		player_down[1] = sheet2.crop(width*1, 0, width, height);
		player_up[0] = sheet2.crop(width*2, 0, width, height);
		player_up[1] = sheet2.crop(width*3, 0, width, height);
		player_right[0] = sheet2.crop(width*0, height, width, height);
		player_right[1] = sheet2.crop(width*1, height, width, height);
		player_left[0] = sheet2.crop(width*2, height, width, height);
		player_left[1] = sheet2.crop(width*3, height, width, height);
		
		grass = sheet.crop(2*width, 0, width, height);
		dirt = sheet.crop(3*width, 0, width, height);
		stone = sheet.crop(0, height, width, height);
		tree = new SpriteSheet(ImageLoader.loadImage("/textures/a_little_treegif.gif")).crop(width*0, 0, width, height);
	}
	
}
