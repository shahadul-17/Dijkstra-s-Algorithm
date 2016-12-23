package dijkstra.s.algorithm;

public class Vertex {
	
	public int index, key = Integer.MAX_VALUE;
	public boolean visited = false;
	
	public Vertex parent;
	
	@Override
	public String toString() {
		Vertex element = this;
		String text = " - " + element.key;
		
		while (element.parent != null) {
			text = ", " + Main.toCharacter(element.index) + text;
			element = element.parent;
		}
		
		return Main.toCharacter(element.index) + text;
	}
	
}