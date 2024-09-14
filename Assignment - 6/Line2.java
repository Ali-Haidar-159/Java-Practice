
package lab_6 ;

class Line2 {
    private double x1, y1, x2, y2;

    public Line2(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public double getX1() {
        return x1;
    }

    public double getY1() {
        return y1;
    }

    public double getX2() {
        return x2;
    }

    public double getY2() {
        return y2;
    }

    public static boolean isIntersecting(Line2 l1, Line2 l2) {
        double x1 = l1.getX1();
        double y1 = l1.getY1();
        double x2 = l1.getX2();
        double y2 = l1.getY2();

        double x3 = l2.getX1();
        double y3 = l2.getY1();
        double x4 = l2.getX2();
        double y4 = l2.getY2();

        double slope1 = (y2 - y1) / (x2 - x1);
        double slope2 = (y4 - y3) / (x4 - x3);

        if (slope1 == slope2) {
            return false;
        }

        double intersectionX = (y3 - y1 - slope2 * x3 + slope1 * x1) / (slope1 - slope2);

        if ((intersectionX >= Math.min(x1, x2) && intersectionX <= Math.max(x1, x2))
                && (intersectionX >= Math.min(x3, x4) && intersectionX <= Math.max(x3, x4))) {
            return true;
        }

        return false;
    }
}