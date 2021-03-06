package com.survey.restaurant.business.controller.web;

import com.survey.restaurant.model.Answer;
import com.survey.restaurant.business.service.AnswerService;
import com.survey.restaurant.model.Question;
import com.survey.restaurant.model.Survey;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/answer")
public class AnswerController {

    @Autowired
    private AnswerService answerService;

    /**
     * Get: List all answers
     * @return objects question
     */
    @GetMapping("/all")
    @ResponseStatus(HttpStatus.OK)
    public List<Answer> getAll() {
        return answerService.findAll();
    }

    /**
     * Post: stores a answer object
     *
     * @return the answer object stored
     */
    @PostMapping("")
    @ResponseStatus(HttpStatus.CREATED)
    public Answer save(@RequestBody Answer answer) {
        return answerService.save(answer);
    }

}
