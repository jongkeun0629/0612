import java.util.Random;

// 랜덤 출력 상대. 마지막은 배신
public class B implements Player{
    final Random rand = new Random();

    @Override
    public boolean cooperate(int round) {
        if (round == 10){
            return false;
        }
        return rand.nextBoolean();
    }

    @Override
    public void recordOpponentMove(boolean opponentMove) {
    }

    @Override
    public void print(){}

    @Override
    public void rom(boolean opponentMove){}
}
