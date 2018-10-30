import processing.core.*;

public class RedColorState implements ColorState {
    PApplet sketch;

    public RedColorState(PApplet sketch) {
        this.sketch = sketch;
    }

    public void fillColor() {
        sketch.fill(255, 0, 0);
    }
}