package org.kamar.system_reactive.domain;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
@RequiredArgsConstructor
public class AttendanceManagement implements AttendanceManagementService {

    private final AttendanceRepository repository;

    @Override
    public void logAttendance(Attendance attendance) {

        repository.save(attendance);
    }

    @Override
    public Mono<Attendance> getAttendanceById(String id) {

        return repository.findById(id);
    }
}
