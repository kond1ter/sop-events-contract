package edu.konditer.events;

import java.io.Serializable;
import java.util.List;

public record UsersNotificationEvent(
        List<Long> userIds,
        Long vacancyId,
        String vacancyTitle,
        String jobName
) implements Serializable {}

