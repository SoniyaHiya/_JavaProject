public class LevelManager {

    int level;

    // Original constructor
    public LevelManager() {
        level = 1;
    }

    //  Overloaded constructor
   // public LevelManager(int startLevel) {
     //   level = startLevel;
   // }

    public int getLevel() {
        return level;
    }

    public void nextLevel() {
        level++;
    }

    public void resetLevel() {
        level = 1;
    }

    public void increaseSpeed(Ball ball) {

        if (ball.xDir > 0) ball.xDir++;
        else ball.xDir--;

        if (ball.yDir > 0) ball.yDir++;
        else ball.yDir--;
    }
}
