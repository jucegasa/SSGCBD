package reportes.view;

public class MergedRegion {
	
	private String text;
	
	private int firstColumn;
	
	private int lastColumn;
	
	private int firstRow;
	
	private int lastRow;
	
	// Es posible que una region tenga otras regiones conenidas
	// private ArrayList<MergedRegions> subMergedRegions;

	public MergedRegion(String text, int firstColumn, int lastColumn,
			int firstRow, int lastRow) {
		super();
		this.text = text;
		this.firstColumn = firstColumn;
		this.lastColumn = lastColumn;
		this.firstRow = firstRow;
		this.lastRow = lastRow;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public int getFirstColumn() {
		return firstColumn;
	}

	public void setFirstColumn(int firstColumn) {
		this.firstColumn = firstColumn;
	}

	public int getLastColumn() {
		return lastColumn;
	}

	public void setLastColumn(int lastColumn) {
		this.lastColumn = lastColumn;
	}

	public int getFirstRow() {
		return firstRow;
	}

	public void setFirstRow(int firstRow) {
		this.firstRow = firstRow;
	}

	public int getLastRow() {
		return lastRow;
	}

	public void setLastRow(int lastRow) {
		this.lastRow = lastRow;
	}
	
}
