package org.kamar.system_reactive.domain;


import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AttendanceRepository extends ReactiveCrudRepository<Attendance, String> {
}
