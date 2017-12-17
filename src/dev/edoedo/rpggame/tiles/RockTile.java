package dev.edoedo.rpggame.tiles;

import dev.edoedo.rpggame.gfx.Assets;

public class RockTile extends Tile {

	public RockTile(int id) {
		super(Assets.stone, id);
	}
	
	@Override
	public boolean isSolid() {
		return true;
	}
}
