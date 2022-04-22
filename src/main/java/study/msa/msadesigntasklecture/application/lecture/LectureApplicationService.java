package study.msa.msadesigntasklecture.application.lecture;

import org.springframework.web.reactive.function.server.ServerRequest;
import study.msa.msadesigntasklecture.application.lecture.response.FindLectureListByStudentResponse;
import study.msa.msadesigntasklecture.application.lecture.response.FindLectureListByTeacherResponse;
import study.msa.msadesigntasklecture.application.lecture.response.LectureHideAndFindLectureScoreResponse;
import study.msa.msadesigntasklecture.application.lecture.response.LectureRegistrationAndTeacherMatchingResponse;

public interface LectureApplicationService {

    LectureRegistrationAndTeacherMatchingResponse lectureRegistrationAndTeacherMatching(ServerRequest request); // 강의 개설과 강사 매칭
    LectureHideAndFindLectureScoreResponse lectureHideAndFindLectureScore(ServerRequest request); // 강의의 노출을 종료하고 별점 열람

    FindLectureListByTeacherResponse findLectureListByTeacher(ServerRequest request); // 강사에 매칭된 강의 목록 조회
    FindLectureListByStudentResponse findLectureListByStudent(ServerRequest request); // 학생이 수강한 강의 목록 조회

    void lectureShow(ServerRequest request); // 강의 노출
    void applyForLecture(ServerRequest request); // 수강 신청
    void lectureScoreRegistration(ServerRequest request); // 수강한 강의에 별점 남기기
}
