import javax.swing.*;
import java.awt.*;

public class TicTacToeViewer extends JFrame {
    // TODO: Complete this class
    private final int HEIGHT = 1000, WIDTH = 800,
                    X_OFFSET = 100, Y_OFFSET = 100, BOX_SIZE = 180;
    private Square[][] board;

    public TicTacToeViewer(Square[][] board)
    {
        this.board = board;
        this.setSize(WIDTH, HEIGHT);
        this.setTitle("TicTacToe");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    public void paint(Graphics g)
    {
        int x = 0;
        int y = 0;
        g.setColor(Color.WHITE);
        g.fillRect(x, y, WIDTH, HEIGHT);
        //draw squares
        g.setColor(Color.BLACK);
        for (int row = 0; row < 3; row++) {
            String p = row + "";
            g.drawString(p, (X_OFFSET)+(BOX_SIZE * row) + BOX_SIZE/2, Y_OFFSET-10);
            for (int col = 0; col < 3; col++) {
                g.drawString(p, X_OFFSET/2, (Y_OFFSET)+(BOX_SIZE * row) +BOX_SIZE/2);
                x = X_OFFSET + col * BOX_SIZE;
                y = Y_OFFSET + row * BOX_SIZE;
                board[row][col].draw(g, x, y, BOX_SIZE, this);
            }
        }
    }
}
