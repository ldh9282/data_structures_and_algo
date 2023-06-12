package hash_tables;

public class HashTablesTest02_Example {

	public static void main(String[] args) {
		HashTablesTest02_build_hash_table hashTable = 
				new HashTablesTest02_build_hash_table(100);
		hashTable.set("ABC", 10); 
		hashTable.set("XYZ", 10);
		hashTable.set("IJK", 10);
		
		System.out.println(hashTable.get("XYZ"));
		System.out.println(hashTable.keys());
		
		
	}

}
