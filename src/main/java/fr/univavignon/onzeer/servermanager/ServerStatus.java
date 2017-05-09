package fr.univavignon.onzeer.servermanager;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Ice.AsyncResult;
import fr.univavignon.onzeer.exceptions.ServerNotFoundException;
import fr.univavignon.onzeer.indexer.IIndexer;
import fr.univavignon.onzeer.indexer.IndexerFactory;
import fr.univavignon.onzeer.model.FileMetadata;
import fr.univavignon.onzeer.model.Server;
import fr.univavignon.onzeer.publisher.*;

public class ServerStatus extends Thread implements IServerStatus{
	public void run(){
		while (true){
			try{
				this.updateServerStatus();
			}catch(InterruptedException e){
				e.printStackTrace();
				return;
			}
		}

	}
	public static int RESPONSE_WAIT_TIME = 600;
	public static int INTERVAL_TIME = 1500;
	@Override
	public void updateServerStatus() throws InterruptedException{
		/*
		IServerStatusPublisher publisher = PublisherFactory.createServerStatusPublisher();
		IIndexer indexer = IndexerFactory.getIndexer();
		List<Server> servers = indexer.getServers();
		HashMap<Server,AsyncResult> callbacks = publisher.statusCheckMessage(servers);
		Thread.sleep(RESPONSE_WAIT_TIME);
		for (Map.Entry<Server,AsyncResult> entry : callbacks.entrySet()) {
			AsyncResult callback = entry.getValue();
			Server server = entry.getKey();
			if(callback.isCompleted()){
				Status status = (Status)callback;
				server.setActive(true);
				server.setAvailableSpace(status.freeSpace);
			}else{
				callback.cancel();
				server.setActive(false);
			}
		}
		/**/
	}

	@Override
	public Boolean checkServerStatus(Server server) throws ServerNotFoundException, InterruptedException {
		/*IServerStatusPublisher publisher = PublisherFactory.createServerStatusPublisher();
		AsyncResult callback = publisher.statusCheckMessage(server);
		Thread.sleep(RESPONSE_WAIT_TIME);
		if(callback.isCompleted()){
			Status status = (Status)callback;
			server.setActive(true);
			server.setAvailableSpace(status.freeSpace);
			return true;
		}else{
			callback.cancel();
			server.setActive(false);
			return false;
		}
		/**/
		return true;
	}
	@Override
	public Boolean checkFileOnServer(List<FileMetadata> files, Server server) throws ServerNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}
	
}
