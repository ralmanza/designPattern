package org.designpattern.exercise.scheduler;

import java.time.LocalDateTime;

public class Event {

    private String title;

    private String description;

    private LocalDateTime startDate;

    private LocalDateTime endDate;

    private EventRecurrence recurrence;

    private int dayOfWeek;

    private int dayOfMonth;

    private int dayOfYear;

    public Event(String title, LocalDateTime startDate, LocalDateTime endDate, EventRecurrence recurrence) {
        this.title = title;
        this.description = title;
        this.startDate = startDate;
        this.endDate = endDate;
        this.recurrence = recurrence;
    }

    public boolean matchDate(LocalDateTime dt) {
        if (dt == null || isOutOfDateTime(dt)) return false;
        boolean match;
        switch (recurrence) {
            case DAILY:
                match = dt.toLocalTime().compareTo(startDate.toLocalTime()) == 0;
                break;
            case WEEKLY:
                match = dayOfWeek == dt.getDayOfWeek().getValue() && dt.toLocalTime().compareTo(startDate.toLocalTime()) == 0;
                break;
            case MONTHLY:
                match = dayOfMonth == dt.getDayOfMonth() && dt.toLocalTime().compareTo(startDate.toLocalTime()) == 0;
                break;
            case YEARLY:
                match = dayOfYear == dt.getDayOfYear() && dt.toLocalTime().compareTo(startDate.toLocalTime()) == 0;
                break;
            default:
                match = dt.compareTo(startDate) == 0;
                break;
        }

        return match;
    }

    public boolean isOutOfDateTime(LocalDateTime ldt) {
        return endDate.compareTo(ldt) < 0;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }

    public EventRecurrence getRecurrence() {
        return recurrence;
    }

    public void setRecurrence(EventRecurrence recurrence) {
        this.recurrence = recurrence;
    }

    public int getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(int dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public int getDayOfMonth() {
        return dayOfMonth;
    }

    public void setDayOfMonth(int dayOfMonth) {
        this.dayOfMonth = dayOfMonth;
    }

    public int getDayOfYear() {
        return dayOfYear;
    }

    public void setDayOfYear(int dayOfYear) {
        this.dayOfYear = dayOfYear;
    }
}
