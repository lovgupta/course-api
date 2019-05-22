package io.javabrains.springbootstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service // it is singleton object which spring creates while startup
public class TopicService {
	
	private List<Topic> topics = new ArrayList<>(
			Arrays.asList(
			new Topic ("spring", "spring framework", "Spring framework description"),
			new Topic ("java", "core java", "Core Java description"),
			new Topic ("javascript", "Javascript", "javascript description")
			));

	public List<Topic> getAllTopics(){
		return topics;
	}
	
	public Topic getTopicById(String topicId) {
		return topics.stream().filter(t -> t.getId().equals(topicId)).findFirst().get();
	}

	public void addTopic(Topic topic) {
		System.out.println("Adding topic");
		topics.add(topic);
	}

	public void updateTopic(Topic topic, String topicId) {
		for(int i = 0 ; i < topics.size(); i++) {
			if(topics.get(i).getId().equals(topicId)){
				topics.set(i, topic);
			}
		}		
	}
	
	public void deleteTopic(String topicId) {
		 topics.removeIf(t -> t.getId().equals(topicId));
	}
}
