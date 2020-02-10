package com.example.Chapter3;

import org.springframework.context.ApplicationEvent;

public class CourseFullEvent<Course> extends ApplicationEvent {
    private final Course course;

    public CourseFullEvent(Object source, Course course) {
        super(source);
        this.course = course;
    }
    public Course getCourse() {
        return course;
    }
}
