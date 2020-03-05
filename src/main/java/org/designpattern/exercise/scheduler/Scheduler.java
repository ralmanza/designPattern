package org.designpattern.exercise.scheduler;

import org.designpattern.exercise.Filter.IFilter;

public class Scheduler {

    private Event event;

    private IFilter filterAcion;

    public Scheduler(Event event, IFilter filterAcion) {
        this.event = event;
        this.filterAcion = filterAcion;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public IFilter getFilterAcion() {
        return filterAcion;
    }

    public void setFilterAcion(IFilter filterAcion) {
        this.filterAcion = filterAcion;
    }
}
