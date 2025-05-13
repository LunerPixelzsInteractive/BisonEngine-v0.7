package engine.logic;

import engine.render.Render;
import engine.scene.Scene;

public interface IAppLogic {
	void cleanup();
	
	void init(Window window, Scene scene, Render render);
	
	void input(Window window, Scene scene, long diffTimeMils);
	
	void update(Window window, Scene scene, long diffTimeMils);
}
