package study.msa.msadesigntasklecture.presentation.lecture;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.reactive.server.WebTestClient;
import study.msa.msadesigntasklecture.application.examContents.response.ExamContentsRegistrationResponse;
import study.msa.msadesigntasklecture.application.lecture.response.FindLectureListByStudentResponse;
import study.msa.msadesigntasklecture.application.lecture.response.FindLectureListByTeacherResponse;
import study.msa.msadesigntasklecture.application.lecture.response.LectureHideAndFindLectureScoreResponse;
import study.msa.msadesigntasklecture.application.lecture.response.LectureRegistrationAndTeacherMatchingResponse;
import study.msa.msadesigntasklecture.application.lectureContents.response.FindLectureContentsResponse;
import study.msa.msadesigntasklecture.application.lectureContents.response.LectureContentsRegistrationResponse;
import study.msa.msadesigntasklecture.application.studentReportCard.response.StudentReportCardRegistrationResponse;
import study.msa.msadesigntasklecture.infrastructure.config.WebFluxRouterConfig;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class LectureHandlerTest {

    private WebTestClient webTestClient;

    @Autowired
    private WebFluxRouterConfig webFluxRouterConfig;
    @Autowired
    private LectureHandler lectureHandler;

    @BeforeEach
    void setUp() {
        webTestClient = WebTestClient
            .bindToRouterFunction( // WebFluxConfig에서 작성한 router를 WebTestClient에 바인딩해준다.
                webFluxRouterConfig.routerBuilder(lectureHandler)
            )
            .build();
    }

    /**
     * 강의 개설과 강사 매칭
     */
    @Test
    void lectureRegistrationAndTeacherMatching() {

        webTestClient
            .post()
            .uri("/lecture/lectureRegistrationAndTeacherMatching")
            .accept(MediaType.APPLICATION_JSON)
            .exchange()
            .expectStatus().isOk()
            .expectBody(LectureRegistrationAndTeacherMatchingResponse.class);
    }

    /**
     * 강사에 매칭된 강의 목록 조회
     */
    @Test
    void findLectureListByTeacher() {

        webTestClient
            .get()
            .uri("/lecture/findLectureListByTeacher")
            .accept(MediaType.APPLICATION_JSON)
            .exchange()
            .expectStatus().isOk()
            .expectBody(FindLectureListByTeacherResponse.class);
    }

    /**
     * 강의 컨텐츠 업로드
     */
    @Test
    void lectureContentsRegistration() {

        webTestClient
            .post()
            .uri("/lecture/lectureContentsRegistration")
            .accept(MediaType.APPLICATION_JSON)
            .exchange()
            .expectStatus().isOk()
            .expectBody(LectureContentsRegistrationResponse.class);
    }

    /**
     * 시험 컨텐츠 추가
     */
    @Test
    void examContentsRegistration() {

        webTestClient
            .post()
            .uri("/lecture/examContentsRegistration")
            .accept(MediaType.APPLICATION_JSON)
            .exchange()
            .expectStatus().isOk()
            .expectBody(ExamContentsRegistrationResponse.class);
    }

    /**
     * 강의 노출
     */
    @Test
    void lectureShow() {

        webTestClient
            .put()
            .uri("/lecture/lectureShow")
            .accept(MediaType.APPLICATION_JSON)
            .exchange()
            .expectStatus().isOk();
    }

    /**
     * 수강 신청
     */
    @Test
    void applyForLecture() {

        webTestClient
            .post()
            .uri("/lecture/applyForLecture")
            .accept(MediaType.APPLICATION_JSON)
            .exchange()
            .expectStatus().isOk();
    }

    /**
     * 학생이 수강한 강의 목록 조회
     */
    @Test
    void findLectureListByStudent() {

        webTestClient
            .get()
            .uri("/lecture/findLectureListByStudent")
            .accept(MediaType.APPLICATION_JSON)
            .exchange()
            .expectStatus().isOk()
            .expectBody(FindLectureListByStudentResponse.class);
    }

    /**
     * 강의 컨텐츠 정보 조회
     */
    @Test
    void findLectureContents() {

        webTestClient
            .get()
            .uri("/lecture/findLectureContents")
            .accept(MediaType.APPLICATION_JSON)
            .exchange()
            .expectStatus().isOk()
            .expectBody(FindLectureContentsResponse.class);
    }

    /**
     * 학생의 성적 입력
     */
    @Test
    void studentReportCardRegistration() {

        webTestClient
            .post()
            .uri("/lecture/studentReportCardRegistration")
            .accept(MediaType.APPLICATION_JSON)
            .exchange()
            .expectStatus().isOk()
            .expectBody(StudentReportCardRegistrationResponse.class);
    }

    /**
     * 수강한 강의에 별점 남기기
     */
    @Test
    void lectureScoreRegistration() {

        webTestClient
            .post()
            .uri("/lecture/lectureScoreRegistration")
            .accept(MediaType.APPLICATION_JSON)
            .exchange()
            .expectStatus().isOk();
    }

    /**
     * 강의의 노출을 종료하고 별점 열람
     */
    @Test
    void lectureHideAndFindLectureScore() {

        webTestClient
            .put()
            .uri("/lecture/lectureHideAndFindLectureScore")
            .accept(MediaType.APPLICATION_JSON)
            .exchange()
            .expectStatus().isOk()
            .expectBody(LectureHideAndFindLectureScoreResponse.class);
    }
}