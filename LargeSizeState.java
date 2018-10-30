import processing.core.*;

public class LargeSizeState implements SizeState {
    PApplet sketch;

    public LargeSizeState(PApplet sketch) {
        this.sketch = sketch;
    }

    public void drawWithSize() {
        sketch.ellipse(sketch.mouseX, sketch.mouseY, 20, 20);
    }
}
