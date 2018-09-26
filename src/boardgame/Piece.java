package boardgame;

public class Piece { // pe�a

	protected Position position; // construtor so da pe�a porque a posicao inicial � nula

	private Board board;

	public Piece(Board board) {
		this.board = board;
		position = null;
	}

	// so quero que o tabuleiro seja acessado so por algumas classes
	protected Board getBoard() { // nao vou deixar public, vou deixar privado
		return board;
	}

	// public void setBoard(Board board) { // nao vou permitir que o tabuleiro seja
	// alterado
	// this.board = board;
	// }

}
