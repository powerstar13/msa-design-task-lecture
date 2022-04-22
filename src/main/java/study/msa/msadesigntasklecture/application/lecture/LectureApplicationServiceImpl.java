package study.msa.msadesigntasklecture.application.lecture;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.server.ServerRequest;
import study.msa.msadesigntasklecture.application.lecture.response.FindLectureListByStudentResponse;
import study.msa.msadesigntasklecture.application.lecture.response.FindLectureListByTeacherResponse;
import study.msa.msadesigntasklecture.application.lecture.response.LectureHideAndFindLectureScoreResponse;
import study.msa.msadesigntasklecture.application.lecture.response.LectureRegistrationAndTeacherMatchingResponse;

@Service
public class LectureApplicationServiceImpl implements LectureApplicationService {

    @Override
    public LectureRegistrationAndTeacherMatchingResponse lectureRegistrationAndTeacherMatching(ServerRequest request) {
        return LectureRegistrationAndTeacherMatchingResponse.builder().build();
    }

    @Override
    public LectureHideAndFindLectureScoreResponse lectureHideAndFindLectureScore(ServerRequest request) {
        return LectureHideAndFindLectureScoreResponse.builder().build();
    }

    @Override
    public FindLectureListByTeacherResponse findLectureListByTeacher(ServerRequest request) {
        return FindLectureListByTeacherResponse.builder().build();
    }

    @Override
    public FindLectureListByStudentResponse findLectureListByStudent(ServerRequest request) {
        return FindLectureListByStudentResponse.builder().build();
    }

    @Override
    public void lectureShow(ServerRequest request) {}

    @Override
    public void applyForLecture(ServerRequest request) {}

    @Override
    public void lectureScoreRegistration(ServerRequest request) {}
}
