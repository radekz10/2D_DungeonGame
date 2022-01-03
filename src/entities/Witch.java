package entities;
import map.Map;

public class Witch extends Enemy {

	public Witch(int x, int y, Map g) {
		super(x, y, 38, 20, 38,   g, "Witch");
		g.setCoordinate(x, y, 'W');
	}
	public String getRace() {

		return "Witch";

	}

}
