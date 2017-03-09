package fr.univavignon.onzeer.publisher;

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
