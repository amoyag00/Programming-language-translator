package pl4;

/**
 * 
 * @author Carlos Fernández Valladares / Samuel Lebrero Alonso / Alejandro Moya García
 *
 */
public class Token {
	public int index;
	public String text;
	public String type;
	public int line;
	public int column;

	public Token(int index, String text, String type, int line, int column) {
		this.index = index;
		this.text = text;
		this.type = type;
		this.line = line;
		this.column = column;

	}
	
	public Token(String type) {
		this.type=type;
	}

	public String toString() {
		return "Text   : " + this.text + "\ntype:" + this.type + "\nindex : " + this.index + "\nline  : " + this.line
				+ "\nccolumn. : " + this.column;

	}

	public void ErrorMatch(String refStrToken) {
		System.out.println("Error leyendo token: " + this.type + " se esperaba " + refStrToken + " en linea "
				+ (this.line + 1) + " columna: " + (this.column + 1));
	}

	public void Error(String msg) {
		System.out.println(
				msg + ": error leido token: " + this.type + " en linea " + (this.line + 1) + " columna: " + (this.column + 1));
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getLine() {
		return line;
	}

	public void setLine(int line) {
		this.line = line;
	}

	public int getColumn() {
		return column;
	}

	public void setColumn(int column) {
		this.column = column;
	}
	
	
}
