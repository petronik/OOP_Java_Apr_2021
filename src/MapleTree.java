
public class MapleTree {
	
	private String _plantDate;
	private double _height;
	private String _heightDate;

	public void plant(String value) {
		_plantDate = value;
	}
	
	public void germinate(String value) {
		_heightDate = value;
	}
	
	public void height(double value) {
		_height = value;
	}
	
	public void dumpData() {
		System.out.println("Plant date = " + _plantDate);
		System.out.println("Germinate date = " + _heightDate);
		// System.out.println("Initial height = " + String.format("%.4f", _height) + " meters" );
		System.out.printf("Initial height = %.4f meters", _height);
	}
}
