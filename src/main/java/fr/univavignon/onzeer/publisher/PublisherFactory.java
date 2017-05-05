package fr.univavignon.onzeer.publisher;

import fr.univavignon.onzeer.publisher.impl.Publisher;
import fr.univavignon.onzeer.publisher.impl.ServerStatusPublisher;
import fr.univavignon.onzeer.publisher.impl.StreamingPublisher;

public class PublisherFactory {
	public static IPublisher createPublisher(){
		return new Publisher();
	}
	public static IStreamingPublisher createStreamingPublisher(){
		return new StreamingPublisher();
	}
	public static IServerStatusPublisher createServerStatusPublisher(){
		return new ServerStatusPublisher();
	}
	public static IRessourcePublisher createRessourcePublisher(){
		return new RessourcePublisher();
	}
}
