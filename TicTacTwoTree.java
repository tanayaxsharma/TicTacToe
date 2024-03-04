package Forest;
import java.util.*;
import TicTacToe.TTTNode;

public class TicTacTwoTree extends Tree {

    /**
    * Create a Game Tree for TicTacTwo... where there is a
    * very simple 2x2 Board that is similar to TicTacToe.
    * In this 2x2 Board we don't care about wins or loses.
    * We only want to demonstrate that we can create a Tree
    * that represents the board all the moves and configurations.
    */
  private char[][] gameTree;

    public static Tree createGameTree() {
        return Tree.createSomeTree();
    }

    public TicTacTwoTree() {
      buildTree(2);
    }

    public void buildTree(int depth) {
      if (depth == 0) {
        return;
      }

      char[][] initialBoard = {{' ', ' '}, {' ', ' '}};
      this.gameTree = initialBoard;
      this.setRoot(new TTTNode(this.gameTree));

      buildGameTree(this.getRoot(), depth, 'X');
    }

    private void buildGameTree(Node node, int remaining, char player) {
      if (remaining == 0) {
        return;
      }

      List<char[][]> nextBoards = getPossibleBoards(node.getBoard(), player);

      for (char[][] nextBoard : nextBoards) {
        TTTNode child = new TTTNode(nextBoard);
        node.addChild(child);    		
      }
    }

    private List<char[][]> getPossibleBoards(char[][] board, char player) {
      List<char[][]> nextBoards = new ArrayList<>();

      for (int i = 0; i < 2; i++) {
        for (int j = 0; j < 2; j++) {

          if (board[i][j] == ' ' ) {
            char[][] newBoard = copyBoard(board);

            newBoard[i][j] = player;

            nextBoards.add(newBoard);
          }
        }
      }

      return nextBoards;
    }

    private char[][] copyBoard() {

    }


}