package com.github.perscholas;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    Character[][]board;
    public Board(Character[][] matrix) {
        this.board=matrix;

    }

    public Boolean isInFavorOfX() {
        return isInFavorOf("X");
    }




    public Boolean isInFavorOfO() {
        return isInFavorOf("O");
    }

    public Boolean isTie() {
        return !isInFavorOfO() && !isInFavorOfX();
    }

    public String getWinner() {
        if (isInFavorOfX()) {
            return "X";
        } else if(isInFavorOfO()){
                return "O";
            }return "";
        }

    private Boolean isInFavorOf(String x) {
        if (board[0][0].equals(x) && board[0][1].equals(x) && board[0][2].equals(x)) {
            return true;
        } else if (board[1][0].equals(x) && board[1][1].equals(x) && board[1][2].equals(x)) {
            return true;
        } else if (board[2][0].equals(x) && board[2][1].equals(x) && board[2][2].equals(x)) {
            return true;
        } else if (board[0][1].equals(x) && board[1][1].equals(x) && board[2][1].equals(x)) {
            return true;
        } else if (board[0][2].equals(x) && board[1][2].equals(x) && board[2][2].equals(x)) {
            return true;
        } else if (board[0][0].equals(x) && board[1][0].equals(x) && board[2][0].equals(x)) {
            return true;
        } else if(board[0][0].equals(x) && board[1][1].equals(x) && board[2][2].equals(x)) {
            return true;
        } else if(board[2][0].equals(x) && board[1][1].equals(x) && board[0][2].equals(x)) {
            return true;
        }else {
            return false;
        }
    }

}
