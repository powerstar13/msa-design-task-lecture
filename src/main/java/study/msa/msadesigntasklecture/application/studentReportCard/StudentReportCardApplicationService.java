package study.msa.msadesigntasklecture.application.studentReportCard;

import org.springframework.web.reactive.function.server.ServerRequest;
import study.msa.msadesigntasklecture.application.studentReportCard.response.StudentReportCardRegistrationResponse;

public interface StudentReportCardApplicationService {

    StudentReportCardRegistrationResponse studentReportCardRegistration(ServerRequest request); // 학생의 성적 입력
}
