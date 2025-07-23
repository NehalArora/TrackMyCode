package com.nehal.TrackMyCode;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.nehal.TrackMyCode.model.Question;
import com.nehal.TrackMyCode.repository.QuestionRepository;

@SpringBootApplication
public class TrackMyCodeApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrackMyCodeApplication.class, args);
	}

	@Bean
	public CommandLineRunner demoData(QuestionRepository repo){
		return args -> {
			repo.save(new Question("Two Sum", "Easy", "Array", 5,"Used Two Pointer"));
			repo.save(new Question("Add Two Numbers", "Medium", "Linked List", 10,"something"));
			repo.save(new Question("Longest Substring Without Repeating Characters", "Medium", "String", 15,"notes"));
			repo.save(new Question("Median of Two Sorted Arrays", "Hard", "Array", 20,"location"));
		};
	}

}
