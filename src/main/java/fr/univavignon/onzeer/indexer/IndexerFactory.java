package fr.univavignon.onzeer.indexer;

public class IndexerFactory {
	private static IIndexer indexer = null;
	public static IIndexer getIndexer(){
		if (indexer == null ){
			indexer = new Indexer();
		}
		return indexer;
	}
}
