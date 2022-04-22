package study.msa.msadesigntasklecture.application.lectureContents;

import org.springframework.web.reactive.function.server.ServerRequest;
import study.msa.msadesigntasklecture.application.lecture.response.LectureRegistrationAndTeacherMatchingResponse;
import study.msa.msadesigntasklecture.application.lectureContents.response.FindLectureContentsResponse;
import study.msa.msadesigntasklecture.application.lectureContents.response.LectureContentsRegistrationResponse;

public interface LectureContentsApplicationService {

    LectureContentsRegistrationResponse lectureContentsRegistration(ServerRequest request); // 강의 컨텐츠 업로드

    FindLectureContentsResponse findLectureContents(ServerRequest request); // 강의 컨텐츠 정보 조회
}
