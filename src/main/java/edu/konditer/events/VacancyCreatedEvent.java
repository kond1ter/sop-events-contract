package edu.konditer.events;

import java.io.Serializable;

public record VacancyCreatedEvent(
        Long id,
        String title,
        String authorFullName,
        String jobName
) implements Serializable {}
