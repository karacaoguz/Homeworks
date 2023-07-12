package hw7;

public class Point {
    int x;
    int y;

    public Point() {
        x = 0;
        y = 0;
    }

    public Point(int x) {
        this.x = x;
        y = 0;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public void distanceToOrigin() {
        double distance = Math.sqrt((getX() * getX()) + (getY() * getY()));
        System.out.println("Distance to origin is " + distance);
    }
    public void distanceToPoint(Point p) {
        int distanceX = Math.abs(getX() - p.getX());
        int distanceY = Math.abs(getY() - p.getY());

        double distanceBetween = Math.sqrt((distanceX * distanceX) + (distanceY * distanceY));
        System.out.println("Distance of one point to another is " + distanceBetween);
    }
    public Point clonePoint() {
        Point p = new Point();
        p.setX(getX());
        p.setY(getY());
        return p;
    }
    public void move(int x, int y) {
        int newX = this.x + x;
        int newY = this.y + y;
        setX(newX);
        setY(newY);
    }

}
