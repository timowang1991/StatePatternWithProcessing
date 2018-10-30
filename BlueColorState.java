import processing.core.*;

public class BlueColorState implements ColorState {
    PApplet sketch;

    public BlueColorState(PApplet sketch) {
        this.sketch = sketch;
    }

    public void fillColor() {
        sketch.fill(0, 0, 255);
    }
}
