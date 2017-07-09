package Figure;

/**
 * Created by Home911 on 07.07.2017.
 */
public class Square extends AbstractMeth {

    int storona;

    public Square(int storona) {
        this.storona = storona;
    }

    @Override
    public double perimetr() {
        return storona * 4;
    }
}
