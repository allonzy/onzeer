package fr.univavignon.onzeer.publisher;


import fr.univavignon.onzeer.publisher.impl.StreamingPublisher;

public class PublisherFactory {
	/*public static IPublisher createPublisher(){
		return new Publisher();
	}/**/
	public static IStreamingPublisher createStreamingPublisher(){
		return new StreamingPublisher();
	}
	public static IServerStatusPublisher createServerStatusPublisher(){
		return null;
		//return new ServerStatusPublisher();
	}
	public static IRessourcePublisher createRessourcePublisher(){
		return null;
		//return new RessourcePublisher();
	}
}
