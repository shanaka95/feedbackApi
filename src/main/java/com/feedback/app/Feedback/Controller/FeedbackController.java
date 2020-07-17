package com.feedback.app.Feedback.Controller;

import com.feedback.app.Feedback.Entity.Feedback;
import com.feedback.app.Feedback.Services.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FeedbackController {

    @Autowired
    private FeedbackService feedbackService;

    @GetMapping("/feedbacks")
    public List<Feedback> getAllFeedbacks(){
        return feedbackService.getFeedbacks();
    }
    @PostMapping("/feedbacks")
    Feedback newEmployee(@RequestBody Feedback newFeedback) {
        return feedbackService.addFeedback(newFeedback);
    }

}
