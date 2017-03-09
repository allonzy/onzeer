package fr.univavignon.onzeer.publisher;

import java.net.Socket;
import java.util.List;

import fr.univavignon.onzeer.model.*;

public interface IStreamingPublisher extends IPublisher {
	public void streamFile(List<Server> servers,FileMetadata file,Socket client);
}
