package LR2;

/**
 * @author Sanya
 */
public final class ImmutablePoint {

    private final double x, y;


    /**
     * Конструктор по умолчанию - создает точку лежащую в позиции (0,0)
     */
    public ImmutablePoint() {
        x = 0;
        y = 0;
    }

    /**
     * Конструктор с параметрами - создает точку лежащую в позиции, соотвествующей перденным значениям x и y
     *
     * @param x значение по х
     * @param y значение по y
     */
    public ImmutablePoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * геттер для  поля х
     */
    public double getX() {
        return x;
    }

    /**
     * геттер для  поля y
     */
    public double getY() {
        return y;
    }

    /**
     * * смещает точку на переданные велечины по обоим координатам, возвращает новый объект
     *
     * @param x смещение по х
     * @param y смещение по y
     * @return новый объект с результрующими координатами
     */
    public ImmutablePoint translate(double x, double y) {
        return new ImmutablePoint(this.x + x, this.y + y);
    }

    /**
     * умножает обе координаты на переданное значение, возвращает новый объект
     *
     * @param val значение на которое будут умножены координаты
     * @return новый объект с результрующими координатами
     */
    public ImmutablePoint scale(double val) {
        return new ImmutablePoint(this.x * val, this.y * val);
    }

    @Override
    public String toString() {
        return "ImmutablePoint{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
