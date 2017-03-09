package fr.univavignon.onzeer.publisher;

import java.util.List;
import java.util.HashMap;

import Ice.AsyncResult;
import fr.univavignon.onzeer.model.*;

public interface IServerStatusPublisher extends IPublisher {
	public HashMap<Server,AsyncResult> statusCheckMessage(List<Server> servers);
	public AsyncResult statusCheckMessage(Server server);

}
