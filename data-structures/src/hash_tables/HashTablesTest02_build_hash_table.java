package hash_tables;

import java.util.ArrayList;
import java.util.List;

public class HashTablesTest02_build_hash_table {
	// We consider hash-collisions
	// Nodes that have different keys, but a same hash can be inserted in a same dynamic-array of a hash-table.
	private static class Nodes extends ArrayList<HashTablesTest02_build_node> {
		
	}
	
	private final int length;
	private Nodes[] data;
	
	public HashTablesTest02_build_hash_table(int size) {
		this.length = size;
		this.data = new Nodes[this.length];
	}
	
	// insert: O(1)
	public void set(String key, int value) {
		if (data[hash(key)] == null) {
			data[hash(key)] = new Nodes();
		}
		data[hash(key)].add(new HashTablesTest02_build_node(key, value));
	}
	
	// search : O(1) (there is no hash-collision)
	// It could be O(n) (there are hash-collisions)
	public int get(String key) {
		if (data[hash(key)] == null) {
			return 0;
		}
		
		for (HashTablesTest02_build_node node : this.data[hash(key)]) {
			if (node.getKey().equals(key)) {
				return node.getValue();
			}
		}
		return 0;
	}
	
	// A key gets hashed : O(1)
	private int hash(String key) {
		int hash = 0;
		for (int i = 0; i < key.length(); i++) {
			hash = (hash + key.charAt(i) * i) % length;
		}
		return hash;
	}
	
	// This array have all keys of a hash-table : O of a times b
	public List<String> keys() {
		List<String> keys = new ArrayList<>();
		for (int i = 0; i < this.length; i++) {
			if (data[i] != null) {
				for (int j = 0; j < data[i].size(); j++) {
					keys.add(data[i].get(j).getKey());
				}
			}
		}
		
		return keys;
	}
}
