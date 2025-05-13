package engine.game;

import engine.logic.IAppLogic;
import engine.logic.Window;
import engine.render.Mesh;
import engine.render.Render;
import engine.runner.Engine;
import engine.scene.Scene;

public class Main implements IAppLogic {

    public static void main(String[] args) {
        Main main = new Main();
        Engine gameEng = new Engine("BisonEngine-Debug", new Window.WindowOptions(), main);
        gameEng.start();
    }

    @Override
    public void cleanup() {

    }

    @Override
    public void init(Window window, Scene scene, Render render) {
        float[] positions = new float[]{
        		-0.5f, 0.5f, -1.0f,
                -0.5f, -0.5f, -1.0f,
                0.5f, -0.5f, -1.0f,
                0.5f, 0.5f, -1.0f,
        };

        float[] colors = new float[]{
            1.0f, 0.0f, 0.0f,  // Red
            0.0f, 1.0f, 0.0f,  // Green
            0.0f, 0.0f, 1.0f,  // Blue
            .0f, 1.0f, 0.0f   // Yellow
        };

        int[] indices = new int[]{
            0, 1, 2, 0, 2, 3
        };

        Mesh mesh = new Mesh(positions, colors, indices);
        scene.addMesh("quad", mesh);
    }

    @Override
    public void input(Window window, Scene scene, long diffTimeMillis) {

    }

    @Override
    public void update(Window window, Scene scene, long diffTimeMillis) {

    }
}
