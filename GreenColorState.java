import processing.core.*;

public class GreenColorState implements ColorState {
    PApplet sketch;

    public GreenColorState(PApplet sketch) {
        this.sketch = sketch;
    }

    public void fillColor() {
        sketch.fill(0, 255, 0);
    }
}
