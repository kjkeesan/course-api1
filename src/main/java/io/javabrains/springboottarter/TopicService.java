package io.javabrains.springboottarter;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	private List<Topic> topics=Arrays.asList(
			new Topic("1","Logeesan","First project"),
			
			new Topic("2","Logee","Second project"));
			
	public List<Topic> getAllTopics(){
		return topics;
	}
}
