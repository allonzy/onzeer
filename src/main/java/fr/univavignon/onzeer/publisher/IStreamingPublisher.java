package fr.univavignon.onzeer.publisher;

import java.net.Socket;
import java.net.URL;
import java.util.List;
import java.util.stream.Stream;

import javax.jms.JMSException;

import fr.univavignon.onzeer.model.*;

public interface IStreamingPublisher extends IPublisher {
	/**
	 * Select an available server from all server listed and start the streaming
	 * @param servers
	 * @param file
	 * @param servers 
	 * @param client
	 * @return
	 * @throws JMSException 
	 */
	public URL streamFile(FileMetadata file, List<Server> servers) throws JMSException;
}
