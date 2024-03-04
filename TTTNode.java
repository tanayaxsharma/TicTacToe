package TicTacToe;

import Forest.Node;

/*
 * This class 
 */
public class TTTNode extends Node {

    // Instance fields should store information about the board,
    // wins, losses, draws and which move is the best
  // TODO: add instance fields here
  private int wins = 0;
  private int losses = 0;
  private int draws = 0;
  private char[][] board;

    // Create Node that represents the board at this stage
  public TTTNode(char[][] board) {
        // Must call super() first!
        super();
        // TODO: set instance fields as necessary
        this.board = board;
  }

    // TODO: update the signature of this API to return the best Move
    // as you've designed your classes. Perhaps an int?
  public Move getBestMove() {
        // TODO: return the instance field for the best move
    return null;
  }

    public String toString() {
        // TODO: Update this to nicely present this Node
        return String.format("Wins: %s", "Update me!!!");
    }

    public char[][] getBoard() {
      return this.board;
    }

}