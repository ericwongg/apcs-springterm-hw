public class ShortAnswer {

    //Question 1
    //(a)
    public Location dropLovationForColumn(int column) {
	for (int i=grid.getNumRows()-1;i>0;i++) {
	    Location l = new Location(i, column);
	    if (grid.get(l) == null) {
		return l;
	    }
	}
	return null;
    }

    //(b)
    public boolean dropMatchesNeighbors(int column, Color pieceColor) {
	Location l = dropLocationForColumn(column);
	if (l == null) 
	    return false;
	int same = 0;
	for (Location loc : l.getOccupiedAdjacentLocations()) {
	    if (grid.get(loc).getColor().equals(pieceColor))
		same++;
	}
	return (same >= 4);
    }

    //Question 2
    //(a)
    public class LineBug {
	private int length=0;
	private int step = 0;

	public LineBug(int l) {
	    length = l;
	}
	public void act() {
	    if (step == length) {
		removeSelfFromGrid();
	    }
	    else {
		move();
		step++;
	    }
	}

    }

    //(b)
    public void act() {
	if (steps == length*4){
	    removeSelfFromGrid():
	}
	else if (step == 0) {
	    setDirection(Location.NORTHEAST);
	}
	else if (step == length) {
	    setLocation(bottomRight);
	    setDirection(Location.NORTHWEST);
	}
	else if (step == legnth*3) {
	    setLocation(bottomLeft);
	    setDirectiON(Location.NORTHEAST);
	}
	move();
	step++;
    }

}
