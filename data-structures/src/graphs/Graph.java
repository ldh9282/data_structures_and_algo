package graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class Graph {

	private HashMap<Integer, List<Integer>> adjacentList;
	private int numberOfNodes;
	
	public Graph() {
		adjacentList = new HashMap<>();
		numberOfNodes = 0;
	}
	
	// build a node of the graph
	public void addNode(int value) {
		adjacentList.put(value, new ArrayList<>());
		numberOfNodes++;
	}
	
	// build a undirected graph
	public void addEdge(int value1, int value2) {
		adjacentList.get(value1).add(value2);
		adjacentList.get(value2).add(value1);
	}
	
	public void showConnections() {
		Set<Integer> nodes = adjacentList.keySet();
		
		for (Integer node : nodes) {
			List<Integer> nodeConnections = adjacentList.get(node);
			StringBuilder connections = new StringBuilder();
			
			for (int edge : nodeConnections) {
				connections.append(edge).append(" ");
				
			}
			
			System.out.println(node + "-->" + connections);
		}
	}
}
