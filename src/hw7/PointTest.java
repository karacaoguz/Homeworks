package hw7;
public class PointTest {

    public static void main(String[] args) {

        Point p1 = new Point();
        Point p2 = new Point();

        p1.setX(3);
        p1.setY(4);

        p2.setX(5);
        p2.setY(10);

        p1.distanceToOrigin();
        p1.distanceToPoint(p2);

        System.out.println(p1.clonePoint().getY());

        if (p1 == p1.clonePoint()) {
            System.out.println("p1 clonePoint a eşit");
        } else {
            System.out.println("değil");
        }

        p1.move(0, 12);
        p2.move(12, 0);
        System.out.println(p1.getY());
        System.out.println(p2.getX());
    }
}