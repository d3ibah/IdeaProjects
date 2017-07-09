package Figure;

/**
 * Created by Home911 on 07.07.2017.
 */
public class Main  {
    public static void main (String[] args){

        AbstractMeth figure;
        figure = new Circle(17);
        System.out.println("Периметр круга " + figure.perimetr());

        figure = new Square(17);
        System.out.println("Периметр квадрата " + figure.perimetr());

        figure = new Triangle(17, 17, 17);
        System.out.println("Периметр треугольника " + figure.perimetr());
    }
}
