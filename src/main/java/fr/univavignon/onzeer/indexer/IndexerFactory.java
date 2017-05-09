package fr.univavignon.onzeer.indexer;

public class IndexerFactory {
	private static IIndexer indexer = null;
	private static IMusicIndexer musicIndexer = null;
	public static IIndexer getIndexer(){
		if (indexer == null ){
			indexer = new Indexer();
		}
		return indexer;
	}
	private static IMusicIndexer getMusicIndexer(){
		if (musicIndexer == null ){
			musicIndexer = new MusicIndexer();
		}
		return musicIndexer;
	}
}
