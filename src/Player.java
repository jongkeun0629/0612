public interface Player {
    boolean cooperate(int round);

    void recordOpponentMove(boolean opponentMove);

    void print();

    void rom(boolean opponentMove);
}
