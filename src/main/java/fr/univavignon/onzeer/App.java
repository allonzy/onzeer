package fr.univavignon.onzeer;

import java.net.URL;
import java.util.List;

import javax.jms.JMSException;
import javax.naming.NamingException;

import fr.univavignon.onzeer.indexer.IIndexer;
import fr.univavignon.onzeer.indexer.IndexerFactory;
import fr.univavignon.onzeer.model.FileMetadata;
import fr.univavignon.onzeer.model.Server;
import fr.univavignon.onzeer.publisher.IStreamingPublisher;
import fr.univavignon.onzeer.publisher.PublisherFactory;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
		try {
			IStreamingPublisher publisher;
			publisher = PublisherFactory.createStreamingPublisher();
			IIndexer indexer = IndexerFactory.getIndexer();
			FileMetadata file = indexer.getFileByname("hotelCalifornia");
			List<Server> servers = indexer.getServersContainingFile(file);
			URL url;
				//return new URL("http://www.abc.net.au/res/streaming/audio/mp3/classic_fm.pls");
				url = publisher.streamFile(file,servers);
				System.out.println(url);
		} catch (NamingException | JMSException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
    }
}
