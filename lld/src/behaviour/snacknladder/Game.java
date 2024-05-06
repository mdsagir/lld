package behaviour.snacknladder;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.stream.Collectors;

public class Game {
    private final Queue<Player> players;
    private final Board board;
    private final IDice dice;

    public Game(List<User> users, List<Jumper> jumpers, int boardSize, IDice iDice) {


        this.players = users.stream().map(Player::new)
                .collect(Collectors.toCollection(LinkedList::new));
        this.board = new Board(boardSize, jumpers);
        this.dice = iDice;
    }

    public User start() {

        while (true) {
            Player currentPlayer = getNextPlayer();
            int diceResult = dice.roll();
            int newPosition = board.move(currentPlayer.getPosition(), diceResult);
            System.out.printf("\nCurrent Player %s , dice result %s new position %s",currentPlayer.getUser().getName(),diceResult,newPosition);
            currentPlayer.setPosition(newPosition);
            if (newPosition == board.getSize()) {
                return currentPlayer.getUser();
            }
        }
    }

    private Player getNextPlayer() {
        Player player = this.players.remove();
        this.players.add(player);
        return player;
    }
}
