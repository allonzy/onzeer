package fr.univavignon.onzeer.publisher;

import java.util.HashMap;
import java.util.List;

import Ice.AsyncResult;
import IceStorm.TopicPrx;
import Server.*;
import fr.univavignon.onzeer.model.Server;

public class ServerStatusPublisher extends Publisher implements IServerStatusPublisher{

	@Override
	public HashMap<Server,AsyncResult> statusCheckMessage(List<Server> servers) {
		HashMap<Server,AsyncResult> callbacks = new HashMap<Server,AsyncResult>();
		for(Server server : servers){
		    AsyncResult callback = statusCheckMessage(server);
		    callbacks.put(server,callback);
		}
		return callbacks;
	}

	@Override
	public AsyncResult statusCheckMessage(Server server) {
		TopicPrx topic = getServerTopic(server);
	    Ice.ObjectPrx pub = topic.getPublisher().ice_oneway();
	    ManagePrx monitor = ManagePrxHelper.uncheckedCast(pub);
		return monitor.begin_getStatus();
	}

}
