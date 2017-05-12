package fr.univavignon.onzeer.publisher.impl;

import fr.univavignon.onzeer.model.Server;
import fr.univavignon.onzeer.publisher.IPublisher;
import fr.univavignon.onzeer.publisher.TopicName;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.annotation.Resource;
import javax.jms.*;
import javax.naming.InitialContext;
import javax.naming.NamingException;
public abstract class QueuePublisher implements IPublisher  {
	protected QueueConnection connection;
	protected QueueSession session; 
	protected QueueSender sender;
	protected TopicName topicName;
	public QueuePublisher(TopicName topicName) throws NamingException, JMSException  {
		this.topicName = topicName;
		initializeConnection("jms/myConnectionFactory","jms/myQueue");
	}
	public Message publish(Message message) throws JMSException{  
		
		TemporaryQueue callBackQueue = this.session.createTemporaryQueue();
		message.setJMSReplyTo(callBackQueue);
		if(this.topicName != null){
			message.setStringProperty("topic", topicName.toString());
		}
		this.sender.send(message);
		System.out.println("message sended");
		QueueReceiver callBackReceiver = session.createReceiver(callBackQueue);
		Message callBackMessage = callBackReceiver.receive();
		System.out.println("callBack received");
		return callBackMessage;
	}
	@Override
	public void addServer(Server server) {
		
	}
	@Override
	public void removeServer(Server server) {
				
	}
	@Override
	public void disableServer(Server server) {
		
	}
	protected void initializeConnection(String messageServiceName,String queueName) throws JMSException, NamingException{
		InitialContext messaging = new InitialContext();
		QueueConnectionFactory connectionFactory = (QueueConnectionFactory)
		messaging.lookup(messageServiceName);
		Queue queue = (Queue) messaging.lookup(queueName);
		connection = connectionFactory.createQueueConnection();
		session = connection.createQueueSession(false,Session.AUTO_ACKNOWLEDGE);
		connection.start();
		sender = session.createSender(queue);
	}
}
