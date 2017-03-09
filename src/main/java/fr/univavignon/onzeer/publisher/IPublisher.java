package fr.univavignon.onzeer.publisher;

import IceStorm.*;
import fr.univavignon.onzeer.model.*;

public interface IPublisher {
	/**
	 * Get a topic with a valid name(aka in {@link TopicList})
	 * @param topicName
	 */
	public TopicPrx getTopic(String topicName);
	/**
	 * 
	 * @param server
	 * @param topicName
	 * @return
	 */
	public TopicPrx getServerTopic(Server server);
	/**
	 * 
	 * @param server
	 * @param topic
	 */
	public void addStreamingServer(Topic topic);
	/**
	 * 
	 * @param server
	 * @param topic
	 */
	public void removeStreamingServerFromTopic(Server server,Topic topic);
}
