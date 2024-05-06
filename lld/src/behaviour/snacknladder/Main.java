package behaviour.snacknladder;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {

        List<Jumper> jumpers=new ArrayList<>();
        jumpers.add(new Jumper(2,5));
        jumpers.add(new Jumper(7,10));
        jumpers.add(new Jumper(25,39));
        jumpers.add(new Jumper(37,58));

        User user1=new User(UUID.randomUUID(),"Govind");
        User user2=new User(UUID.randomUUID(),"Aditya");

        Game game=new Game(List.of(user1,user2),jumpers,100,new NormalDice());
        User winner = game.start();
        System.out.println("Game winner is "+winner.getName());
    }
}
