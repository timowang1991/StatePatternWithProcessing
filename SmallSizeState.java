import processing.core.*;

public class SmallSizeState implements SizeState {
    PApplet sketch;

    public SmallSizeState(PApplet sketch) {
        this.sketch = sketch;
    }

    public void drawWithSize() {
        sketch.ellipse(sketch.mouseX, sketch.mouseY, 10, 10);
    }
}
