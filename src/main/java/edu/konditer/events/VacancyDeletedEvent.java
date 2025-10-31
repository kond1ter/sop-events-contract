package edu.konditer.events;

import java.io.Serializable;

public record VacancyDeletedEvent(
        Long id
) implements Serializable {}
