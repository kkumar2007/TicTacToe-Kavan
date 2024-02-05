import javax.swing.*;
import java.awt.*;

public class TicTacToeViewer extends JFrame {
    // TODO: Complete this class
    private final int HEIGHT = 1000, WIDTH = 800,
            X_OFFSET = 100, Y_OFFSET = 100, BOX_SIZE = 180;
    private Square[][] board;
    private TicTacToe game;

    public TicTacToeViewer(TicTacToe game) {
        this.game = game;
        this.board = game.getBoard();
        this.setSize(WIDTH, HEIGHT);
        this.setTitle("TicTacToe");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public void paint(Graphics g) {

        int x = X_OFFSET+20;
        int y = Y_OFFSET-30;
        for (int j = 0; j < 3; j++) {
            String n2 = String.valueOf(j);
            g.setFont(new Font("Serif", Font.PLAIN, 35));
            g.drawString(n2, x, y);
            x += BOX_SIZE+50;

        }
        x = 50;
        y = 200;
        for (int i = 0; i < 3; i++) {
            String n = String.valueOf(i);
            g.setFont(new Font("Serif", Font.PLAIN, 35));
            g.drawString(n, x, y);
            y += 200;
        }

//fix
        board = game.getBoard();
        if (board != null) {
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[0].length; j++) {
                    this.board[i][j].draw(g, X_OFFSET + j * BOX_SIZE, Y_OFFSET + i * BOX_SIZE, BOX_SIZE);
                }
            }
        }
    }
}
