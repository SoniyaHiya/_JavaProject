import java.awt.*;

public class BrickManager {

    int bricks[][];
    int brickWidth = 65, brickHeight = 20;

    Color[] mainRowColors = {Color.pink, Color.red, Color.green, Color.blue};

    public BrickManager() {
        bricks = new int[9][9];
        initialize();
    }

    public void initialize() {
        for (int i = 0; i < bricks.length; i++) {
            int cols = (i < 2) ? 7 : 9;
            for (int j = 0; j < cols; j++)
                bricks[i][j] = 1;
            for (int j = cols; j < 9; j++)
                bricks[i][j] = 0;
        }
    }

    public void draw(Graphics g) {
        int startX = 10, startY = 10;

        for (int i = 0; i < bricks.length; i++) {
            int cols = (i < 2) ? 7 : 9;

            for (int j = 0; j < cols; j++) {
                if (bricks[i][j] == 1) {

                    if (i == 0) g.setColor(Color.cyan);
                    else if (i == 1) g.setColor(Color.orange);
                    else {
                        int idx = (i - 2) % mainRowColors.length;
                        g.setColor(mainRowColors[idx]);
                    }

                    g.fillRect(startX + j * brickWidth,
                               startY + i * brickHeight,
                               brickWidth, brickHeight);

                    g.setColor(Color.black);
                    g.drawRect(startX + j * brickWidth,
                               startY + i * brickHeight,
                               brickWidth, brickHeight);
                }
            }
        }
    }

    public Rectangle getBrickRect(int i, int j) {
        return new Rectangle(10 + j * brickWidth,
                             10 + i * brickHeight,
                             brickWidth, brickHeight);
    }
}