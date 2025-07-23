package com.nehal.TrackMyCode.dto;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public class QuestionDto {

    @NotBlank(message = "Title cannot be blank")
    private String title;

    @NotBlank(message = "Difficulty cannot be blank")
    private String difficulty;

    @NotBlank(message = "Topic cannot be blank")
    private String topic;

    @Min(value = 1, message = "Time taken must be at least 1 minute")
    private int timeTaken;

    private String notes;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public int getTimeTaken() {
        return timeTaken;
    }

    public void setTimeTaken(int timeTaken) {
        this.timeTaken = timeTaken;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    
    
}
