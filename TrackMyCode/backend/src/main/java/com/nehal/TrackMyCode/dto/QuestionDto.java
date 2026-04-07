package com.nehal.TrackMyCode.dto;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
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


    
}
