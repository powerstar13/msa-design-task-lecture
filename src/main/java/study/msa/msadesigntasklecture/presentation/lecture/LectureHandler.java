package study.msa.msadesigntasklecture.presentation.lecture;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;
import study.msa.msadesigntasklecture.application.examContents.ExamContentsApplicationService;
import study.msa.msadesigntasklecture.application.examContents.response.ExamContentsRegistrationResponse;
import study.msa.msadesigntasklecture.application.lecture.LectureApplicationService;
import study.msa.msadesigntasklecture.application.lecture.response.FindLectureListByStudentResponse;
import study.msa.msadesigntasklecture.application.lecture.response.FindLectureListByTeacherResponse;
import study.msa.msadesigntasklecture.application.lecture.response.LectureHideAndFindLectureScoreResponse;
import study.msa.msadesigntasklecture.application.lecture.response.LectureRegistrationAndTeacherMatchingResponse;
import study.msa.msadesigntasklecture.application.lectureContents.LectureContentsApplicationService;
import study.msa.msadesigntasklecture.application.lectureContents.response.FindLectureContentsResponse;
import study.msa.msadesigntasklecture.application.lectureContents.response.LectureContentsRegistrationResponse;
import study.msa.msadesigntasklecture.application.studentReportCard.StudentReportCardApplicationService;
import study.msa.msadesigntasklecture.application.studentReportCard.response.StudentReportCardRegistrationResponse;
import study.msa.msadesigntasklecture.presentation.shared.response.ServerResponseFactory;

@Component
@RequiredArgsConstructor
public class LectureHandler {

    private final ServerResponseFactory serverResponseFactory;
    private final LectureApplicationService lectureApplicationService;
    private final LectureContentsApplicationService lectureContentsApplicationService;
    private final ExamContentsApplicationService examContentsApplicationService;
    private final StudentReportCardApplicationService studentReportCardApplicationService;

    /**
     * 강의 개설과 강사 매칭
     * --> 사이트 운영자’는 ‘강의’를 개설하고 ‘강사’를 매칭할 수 있다.
     * @param request : 개설할 강의 정보 및 매칭할 강사 정보
     * @return Mono<ServerResponse> : 개설된 강의 정보
     */
    public Mono<ServerResponse> lectureRegistrationAndTeacherMatching(ServerRequest request) {

        LectureRegistrationAndTeacherMatchingResponse response = lectureApplicationService.lectureRegistrationAndTeacherMatching(request);

        return serverResponseFactory.successBodyValue(response);
    }

    /**
     * 강사에 매칭된 강의 목록 조회
     * --> ‘강사’ 는 과거에 매칭된 ‘강의’ 목록을 조회할 수 있다.
     * @param request : 조회할 강사의 정보
     * @return Mono<ServerResponse> : 조호된 강의 목록 정보
     */
    public Mono<ServerResponse> findLectureListByTeacher(ServerRequest request) {

        FindLectureListByTeacherResponse response = lectureApplicationService.findLectureListByTeacher(request);

        return serverResponseFactory.successBodyValue(response);
    }

    /**
     * 강의 컨텐츠 업로드
     * --> ‘강사’ 는 매칭된 ‘강의’에 컨텐츠를 업로드할 수 있다.
     * @param request : 업로드할 강의 컨텐츠 정보
     * @return Mono<ServerResponse> : 업로드된 강의 컨텐츠 정보
     */
    public Mono<ServerResponse> lectureContentsRegistration(ServerRequest request) {

        LectureContentsRegistrationResponse response = lectureContentsApplicationService.lectureContentsRegistration(request);

        return serverResponseFactory.successBodyValue(response);
    }

    /**
     * 시험 컨텐츠 추가
     * --> ‘강사’ 는 ‘강의’에 ‘시험’ 컨텐츠를 추가할 수 있다.
     * @param request : 추가할 시험 컨텐츠 정보
     * @return Mono<ServerResponse> : 추가된 시험 컨텐츠 정보
     */
    public Mono<ServerResponse> examContentsRegistration(ServerRequest request) {

        ExamContentsRegistrationResponse response = examContentsApplicationService.examContentsRegistration(request);

        return serverResponseFactory.successBodyValue(response);
    }

    /**
     * 강의 노출
     * --> ‘사이트 운영자’는 ‘강의’를 ‘학생’ 회원에게 노출할 수 있다.
     * @param request : 노출할 강의 정보
     * @return Mono<ServerResponse> : 노출된 강의 정보
     */
    public Mono<ServerResponse> lectureShow(ServerRequest request) {

        lectureApplicationService.lectureShow(request);

        return serverResponseFactory.successOnly();
    }

    /**
     * 수강 신청
     * --> ‘학생’ 회원은 원하는 강의를 선택해서 ‘수강 신청’ 할 수 있다.
     * @param request : 수강 신청할 정보
     * @return Mono<ServerResponse> : 수강 신청 완료
     */
    public Mono<ServerResponse> applyForLecture(ServerRequest request) {

        lectureApplicationService.applyForLecture(request);

        return serverResponseFactory.successOnly();
    }

    /**
     * 학생이 수강한 강의 목록 조회
     * --> ‘학생’ 회원은 수강한 강의의 목록을 조회할 수 있다.
     * @param request : 강의 목록을 조회할 학생의 정보
     * @return Mono<ServerResponse> : 조회된 강의 목록 정보
     */
    public Mono<ServerResponse> findLectureListByStudent(ServerRequest request) {

        FindLectureListByStudentResponse response = lectureApplicationService.findLectureListByStudent(request);

        return serverResponseFactory.successBodyValue(response);
    }

    /**
     * 강의 컨텐츠 정보 조회
     * --> ‘학생’ 회원은 ‘수강 신청’한 강의 컨텐츠를 열람할 수 있다.
     * @param request : 조회할 강의 컨텐츠 정보
     * @return Mono<ServerResponse> : 조회된 강의 컨텐츠 정보
     */
    public Mono<ServerResponse> findLectureContents(ServerRequest request) {

        FindLectureContentsResponse response = lectureContentsApplicationService.findLectureContents(request);

        return serverResponseFactory.successBodyValue(response);
    }

    /**
     * 학생의 성적 입력
     * --> ‘강사’ 는 ‘강의’를 수강한 학생들의 성적을 입력할 수 있다.
     * @param request : 입력할 성적 정보
     * @return Mono<ServerResponse> : 입력된 성적 정보
     */
    public Mono<ServerResponse> studentReportCardRegistration(ServerRequest request) {

        StudentReportCardRegistrationResponse response = studentReportCardApplicationService.studentReportCardRegistration(request);

        return serverResponseFactory.successBodyValue(response);
    }

    /**
     * 수강한 강의에 별점 남기기
     * --> ‘학생’ 회원은 수강한 강의에 대해 별점을 남길 수 있다.
     * @param request : 별점 점수와 강의 정보
     * @return Mono<ServerResponse> : 별점 남기기 완료
     */
    public Mono<ServerResponse> lectureScoreRegistration(ServerRequest request) {

        lectureApplicationService.lectureScoreRegistration(request);

        return serverResponseFactory.successOnly();
    }

    /**
     * 강의의 노출을 종료하고 별점 열람
     * --> ‘사이트 운영자’는 ‘강의’ 노출을 종료하고 ‘학생’ 회원이 제출한 별점을 열람할 수 있다.
     * @param request : 노출을 종료할 강의 정보
     * @return Mono<ServerResponse> : 강의 별점 정보
     */
    public Mono<ServerResponse> lectureHideAndFindLectureScore(ServerRequest request) {

        LectureHideAndFindLectureScoreResponse response = lectureApplicationService.lectureHideAndFindLectureScore(request);

        return serverResponseFactory.successBodyValue(response);
    }

}
