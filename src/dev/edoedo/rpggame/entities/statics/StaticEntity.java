package dev.edoedo.rpggame.entities.statics;

import dev.edoedo.rpggame.Handler;
import dev.edoedo.rpggame.entities.Entity;

public abstract class StaticEntity extends Entity{

	public StaticEntity(Handler handler, float x, float y, int width, int height) {
		super(handler, x, y, width, height);
	}

}
