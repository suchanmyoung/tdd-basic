package chap05;

public class Game {

    private GameNumGen gameNumGen;

    public Game(GameNumGen genMock) {
        this.gameNumGen = genMock;
    }

    public void init(GameLevel easy) {
        gameNumGen.generate(easy);
    }
}
