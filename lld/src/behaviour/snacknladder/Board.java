package behaviour.snacknladder;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Board {
    private final int size;
    private final Map<Integer, Integer> jumpers;

    public Board(int size, List<Jumper> jumpers) {
        if (areValidJumper(jumpers)) {
            this.jumpers = jumpers.stream().collect(Collectors.toMap(Jumper::getStart, Jumper::getEnd));
            this.size = size;
        } else {
            this.size = 0;
            this.jumpers = null;
        }


    }

    public int getSize() {
        return size;
    }

    public boolean areValidJumper(List<Jumper> jumpers) {

        return true;
    }


    public int move(int currentPosition, int diceResult) {
        // 1. Make for move
        // 2. Check for any jumper there if it is make it jump there, or ladder there make it down there
        // 3. Check if its goes beyond game, don't make move.
        int newPosition = currentPosition + diceResult;
        int jumperPosition = jumpers.getOrDefault(newPosition, -1);
        if (jumperPosition != -1) {
            newPosition = jumperPosition;
            System.out.printf("\nFind the Jumper %s", newPosition);
        }
        if (newPosition > size) {
            System.out.println("\nYou can't go beyond the game!");
            return currentPosition;
        }

        return newPosition;
    }
}
