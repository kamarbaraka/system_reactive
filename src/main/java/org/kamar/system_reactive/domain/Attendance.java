package org.kamar.system_reactive.domain;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDateTime;


@Table(name = "attendances")
@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Attendance {

    @Id
    private String studentId;
    private String name;
    private final LocalDateTime timeLoggedIn = LocalDateTime.now();
}
