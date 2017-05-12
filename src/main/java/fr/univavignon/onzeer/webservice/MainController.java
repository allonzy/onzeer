package fr.univavignon.onzeer.webservice;
import javax.jws.WebService;
import javax.naming.NamingException;

import java.net.MalformedURLException;
import java.net.Socket;
import java.net.URL;
import java.util.List;
import java.util.stream.Stream;

import javax.jms.JMSException;
import javax.jws.WebMethod;

import fr.univavignon.onzeer.indexer.IIndexer;
import fr.univavignon.onzeer.indexer.IndexerFactory;
import fr.univavignon.onzeer.model.FileMetadata;
import fr.univavignon.onzeer.model.Server;
import fr.univavignon.onzeer.publisher.IStreamingPublisher;
import fr.univavignon.onzeer.publisher.PublisherFactory;
@WebService(name="onzeer")
public class MainController {
	@WebMethod
	public URL startStreaming(String fileName) throws MalformedURLException{
		try {
			IStreamingPublisher publisher;
			publisher = PublisherFactory.createStreamingPublisher();
			IIndexer indexer = IndexerFactory.getIndexer();
			FileMetadata file = indexer.getFileByname(fileName);
			List<Server> servers = indexer.getServersContainingFile(file);
			URL url;
				//return new URL("http://www.abc.net.au/res/streaming/audio/mp3/classic_fm.pls");
				url = publisher.streamFile(file,servers);
				return url;
		} catch (NamingException | JMSException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			return null;
		}
	}
	public List<FileMetadata> getAudioFile(String command){
		return null;
	}
}
