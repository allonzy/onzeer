package fr.univavignon.onzeer.publisher;

import Ice.*;
import IceStorm.*;
import fr.univavignon.onzeer.model.Server;

public class Publisher extends Application implements IPublisher  {
	
	IceStorm.TopicManagerPrx topicManager ;
	public Publisher(){
		 Ice.ObjectPrx obj = communicator().stringToProxy("IceStorm/TopicManager:tcp -p 9999");
		 topicManager = IceStorm.TopicManagerPrxHelper.checkedCast(obj);

	}
	@Override
	public TopicPrx getTopic(String topicName) {
	    IceStorm.TopicPrx topic = null;
	    while (topic == null) {
	        try {
	            topic = topicManager.retrieve(topicName);
	        } catch (IceStorm.NoSuchTopic e1) {
	            try {
	                topic = topicManager.create(topicName);
	            } catch (IceStorm.TopicExists e2) {
	                // Another client created the topic.
	            }
	        }
	    }
		return topic;
	}

	@Override
	public TopicPrx getServerTopic(Server server) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int run(String[] arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void addStreamingServer(Topic topic) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void removeStreamingServerFromTopic(Server server, Topic topic) {
		// TODO Auto-generated method stub
		
	}
	
}
