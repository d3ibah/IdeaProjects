package Figure;

import static java.lang.Math.PI;

/**
 * Created by Home911 on 07.07.2017.
 */
public class Circle extends AbstractMeth {

    int diametr;

    public Circle(int diametr) {
        this.diametr = diametr;
    }

    @Override
    public double perimetr() {
        return diametr * PI;
    }
}
