
package application;

import java.util.Scanner;

import chess.ChessMath;
import chess.ChessPiece;
import chess.ChessPosition;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ChessMath chessMatch = new ChessMath();
		
		while (true){
			UI.printBoard(chessMatch.getPieces());
			System.out.println();
			System.out.print("Source: ");
			ChessPosition source = UI.readChessPosition(sc);
			
			System.out.println();
			System.out.print("Target: ");
			ChessPosition target = UI.readChessPosition(sc);
			ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
			
		
	}
	}
}