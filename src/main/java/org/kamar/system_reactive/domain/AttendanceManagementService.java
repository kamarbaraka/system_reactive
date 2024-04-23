package org.kamar.system_reactive.domain;


import reactor.core.publisher.Mono;

public interface AttendanceManagementService {

    void logAttendance(Attendance attendance);
    Mono<Attendance> getAttendanceById(String id);
}
