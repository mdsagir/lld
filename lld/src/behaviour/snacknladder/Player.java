package behaviour.snacknladder;

public class Player {
    private User user;
    private int position;

    public Player(User user) {
        this.user = user;
        this.position = 0;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}
