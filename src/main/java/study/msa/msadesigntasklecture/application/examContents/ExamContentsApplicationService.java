package study.msa.msadesigntasklecture.application.examContents;

import org.springframework.web.reactive.function.server.ServerRequest;
import study.msa.msadesigntasklecture.application.examContents.response.ExamContentsRegistrationResponse;
import study.msa.msadesigntasklecture.application.lectureContents.response.LectureContentsRegistrationResponse;

public interface ExamContentsApplicationService {

    ExamContentsRegistrationResponse examContentsRegistration(ServerRequest request); // 시험 컨텐츠 업로드
}
