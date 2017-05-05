package fr.univavignon.onzeer.publisher;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.TemporaryQueue;

import IceStorm.*;
import fr.univavignon.onzeer.model.*;

public interface IPublisher {
	public void addServer(Server server);
	public void removeServer(Server server);
	public void disableServer(Server server);
	public Message publish(Message message) throws JMSException;
}
