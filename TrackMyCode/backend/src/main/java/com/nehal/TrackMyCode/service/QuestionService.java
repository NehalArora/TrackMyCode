package com.nehal.TrackMyCode.service;

//import java.time.LocalDate;
//import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nehal.TrackMyCode.dto.QuestionDto;
import com.nehal.TrackMyCode.model.Question;
import com.nehal.TrackMyCode.repository.QuestionRepository;

@Service
public class QuestionService {
    @Autowired
    private QuestionRepository questionRepository;

    public List<Question> getAllQuestions(){
        return questionRepository.findAll();
    }

    public Question createQuestion(QuestionDto dto){
        Question question = new Question();
        question.setTitle(dto.getTitle());
        question.setDifficulty(dto.getDifficulty());
        question.setTopic(dto.getTopic());
        question.setTimeTaken(dto.getTimeTaken());
        question.setNotes(dto.getNotes());
        return questionRepository.save(question);
    }

    public Optional<Question> updateQuestion(Long id, Question updatedQuestion) {
        return questionRepository.findById(id).map(question -> {
            question.setTitle(updatedQuestion.getTitle());
            question.setDifficulty(updatedQuestion.getDifficulty());
            question.setTopic(updatedQuestion.getTopic());
            question.setTimeTaken(updatedQuestion.getTimeTaken());
            question.setNotes(updatedQuestion.getNotes());
            return questionRepository.save(question);
        });
    }

    public boolean deleteQuestion(Long id) {
        if (questionRepository.existsById(id)) {
            questionRepository.deleteById(id);
            return true;
        }
        return false;
    }


}
