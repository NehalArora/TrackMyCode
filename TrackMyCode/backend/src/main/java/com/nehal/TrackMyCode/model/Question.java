package com.nehal.TrackMyCode.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String difficulty;
    private String topic;
    private int timeTaken;
    private String notes;
    

    // Constructors
    public Question() {}

    public Question(String title, String difficulty, String topic, int timeTaken, String notes) {
        this.title = title;
        this.difficulty = difficulty;
        this.topic = topic;
        this.timeTaken = timeTaken;
        this.notes = notes;
    }


}
