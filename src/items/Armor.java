package items;
import map.Map;

public class Armor extends Item {

    public Armor(int x, int y, Map generator) {

        super(x, y, generator);

        generator.setCoordinate(x, y, 'A');

    }

}