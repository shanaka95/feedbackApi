package com.feedback.app.Feedback.Services;

import com.feedback.app.Feedback.Entity.Feedback;
import com.feedback.app.Feedback.Interface.FeedbackInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;

@Service
public class FeedbackService {

    @Autowired
    private FeedbackInterface feedbackInterface;

    public List<Feedback> getFeedbacks(){
        return (List<Feedback>) feedbackInterface.findAll();
    }
    public Feedback addFeedback(Feedback feedback){
        System.out.println(feedback);
        return feedbackInterface.save(feedback);
    }
}
