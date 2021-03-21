import java.util.ArrayList;
public class SudokuCell {
	private String Value;
	private Tuple<Integer, Integer> coordinate;
	private ArrayList<String> candidateList;
	
	public SudokuCell(int row, int col, String value) {
		Value = value;
		coordinate = new Tuple<Integer, Integer>(row, col);
		
		candidateList = new ArrayList<String>();
		
	}
	
	public String getValue() {
		return Value;
	}
	
	public void setValue(String v) {
		Value = v;
	}
	
	public Tuple<Integer, Integer> getCoordinate() {
		return coordinate;
	}
	
	public void setCoordinate(Tuple<Integer, Integer> c) {
		coordinate = c;
	}
	
	public ArrayList<String> getCandidateList() {
		return candidateList;
	}
	
	public void setCandidateList(ArrayList<String> cList) {
		candidateList = cList;
	}
	
	
}
