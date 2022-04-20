package com.techelevator.model;

import java.time.LocalDate;
import java.util.Date;

public class Workout {

    private Long workoutId;
    private Long userId;
    private Long trainerId;
    private boolean isCompleted;
    private LocalDate dateCompleted;


    public Workout() {}

    public Workout(Long workoutId, Long userId, Long trainerId, boolean isCompleted, LocalDate dateCompleted){
        this.workoutId = workoutId;
        this.userId = userId;
        this.trainerId = trainerId;
        this.isCompleted = isCompleted;
        this.dateCompleted = dateCompleted;

    }

    public LocalDate getDateCompleted() {
        return dateCompleted;
    }

    public void setDateCompleted(LocalDate dateCompleted) {
        this.dateCompleted = dateCompleted;
    }

    public long getId() {
        return workoutId;
    }

    public void setId(Long workoutId) {
        this.workoutId = workoutId;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public long getTrainerId() {
        return trainerId;
    }

    public void setTrainerId(long trainerId) {
        this.trainerId = trainerId;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }

    @Override
    public String toString() {
        return "Workout{" +
                "workoutId = " + workoutId +
                ", userId = " + userId +
                ", trainer Id = " + trainerId +
                ", Completed = " + isCompleted +
                ", date completed = " + dateCompleted +
                "}";
    }

}

