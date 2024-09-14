package lab_6;

public class Line {

    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public Line() {

    }

    public Line(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public void findSlop() {
        double slp = ((y2 - y1) / (x2 - x1));
        System.out.println("Slop is : " + slp);
    }

}
