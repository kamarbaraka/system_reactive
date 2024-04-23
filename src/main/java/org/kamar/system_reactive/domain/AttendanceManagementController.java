package org.kamar.system_reactive.domain;


import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(value = {"api/v1/attendance"})
@RequiredArgsConstructor
public class AttendanceManagementController {

    private final AttendanceManagementService service;

    @PostMapping
    public ResponseEntity<Void> logAttendance(@RequestBody AttendanceDto dto){

        Attendance attendance = Attendance.builder()
                .name(dto.name())
                .studentId(dto.studentId())
                .build();
        service.logAttendance(attendance);

        return ResponseEntity.ok()
                .build();
    }
    @Operation(
                summary = "get attendance",
                description = "get the attendance with the provided student ID."
    )
    @GetMapping
    public Mono<ResponseEntity<Attendance>> getAttendance(@RequestParam("studentId") Mono<String> studentId){


        return studentId
                .flatMap(service::getAttendanceById)
                .map(ResponseEntity::ok);
    }
}
