package com.feedback.app.Feedback.Interface;

import com.feedback.app.Feedback.Entity.Feedback;
import org.springframework.data.repository.CrudRepository;

public interface FeedbackInterface extends CrudRepository<Feedback,Integer> {

}
