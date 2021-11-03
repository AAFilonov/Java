package LR4.geometry;

public class LabeledPoint  extends Point{

    private final String label;

    public LabeledPoint(String label, double x, double y) {
        super(x, y);
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    public String getXY(){
        return  String.valueOf(this.x)+this.y;
    }
}
