package org.kamar.system_reactive.domain;

import java.io.Serializable;

public record AttendanceDto(
        String name,
        String studentId
) implements Serializable {
}
