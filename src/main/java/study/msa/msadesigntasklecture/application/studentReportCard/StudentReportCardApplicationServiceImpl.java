package study.msa.msadesigntasklecture.application.studentReportCard;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.server.ServerRequest;
import study.msa.msadesigntasklecture.application.studentReportCard.response.StudentReportCardRegistrationResponse;

@Service
public class StudentReportCardApplicationServiceImpl implements StudentReportCardApplicationService {

    @Override
    public StudentReportCardRegistrationResponse studentReportCardRegistration(ServerRequest request) {
        return StudentReportCardRegistrationResponse.builder().build();
    }
}
