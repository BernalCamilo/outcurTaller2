package co.edu.icesi.dev.outcome_curr.mgmt.rs.curriculum_qa;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name ="StudentOutcomeWebService")
@RestController
@RequestMapping(value = "/v1/auth/faculties/{facultyId}/acad_programs/{acadprogramId}/assessemnt_plans/{asgplaId}/"
        + "student_outcomes")
public interface AuthStudentOutcomeController {

}
