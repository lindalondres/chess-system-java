package boardgame;

public class Board { // tabuleiro

	private int rows; // quantidade de linhas
	private int columns; // quantidade de colunas
	private Piece[][] pieces; // uma matriz de pe�as, o segundo � o nome da matriz
	// ex de como se pensa a linha: vou criar uma matriz de pe�as(private Piece[][])
	// como o nome de pe�as (pieces);

	public Board(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns];// le que vou instanciar as pe�as/pieces dentro da matriz pe�a/Piece;
	
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getColumns() {
		return columns;
	}

	public void setColumns(int columns) {
		this.columns = columns;
	}

}
