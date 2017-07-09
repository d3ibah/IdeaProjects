package Figure;

/**
 * Created by Home911 on 07.07.2017.
 */
public class Triangle extends AbstractMeth {

    int storona1, storona2, storona3;

    public Triangle(int storona1, int storona2, int storona3) {
        this.storona1 = storona1;
        this.storona2 = storona2;
        this.storona3 = storona3;
    }

    @Override
    public double perimetr() {
        return storona1 + storona2 + storona3;
    }
}
