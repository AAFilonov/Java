package LR2;

public final class MutablePoint {
    private double x, y;

    /**
     * Конструктор по умолчанию - создает точку лежащую в позиции (0,0)
     */
    public MutablePoint() {
        x = 0;
        y = 0;
    }

    /**
     * Конструктор с параметрами - создает точку лежащую в позиции, соотвествующей перденным значениям x и y
     *
     * @param x значение по х
     * @param y значение по y
     */
    public MutablePoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    /**
     * смещает точку на переданные велечины по обоим координатам
     *
     * @param x смещение по х
     * @param y смещение по y
     */
    public void translate(double x, double y) {
        this.x += x;
        this.y += y;
    }

    /**
     * умножает обе координаты на переданное значение
     *
     * @param val значение на которое будут умножены координаты
     */
    public void scale(double val) {
        this.x *= val;
        this.y *= val;
    }

    @Override
    public String toString() {
        return "MutablePoint{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
