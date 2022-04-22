package study.msa.msadesigntasklecture.infrastructure.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.config.EnableWebFlux;
import org.springframework.web.reactive.config.WebFluxConfigurer;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;
import study.msa.msadesigntasklecture.presentation.lecture.LectureHandler;

import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
@EnableWebFlux // WebFlux 설정 활성화
public class WebFluxRouterConfig implements WebFluxConfigurer {

    @Bean
    public RouterFunction<ServerResponse> routerBuilder(LectureHandler handler) {

        return route()
            .path("/lecture", helloBuilder ->
                helloBuilder.nest(accept(APPLICATION_JSON), builder ->
                    builder
                        .POST("/lectureRegistrationAndTeacherMatching", handler::lectureRegistrationAndTeacherMatching) // 강의 개설과 강사 매칭
                        .GET("/findLectureListByTeacher", handler::findLectureListByTeacher) // 강사에 매칭된 강의 목록 조회
                        .POST("/lectureContentsRegistration", handler::lectureContentsRegistration) // 강의 컨텐츠 업로드
                        .POST("/examContentsRegistration", handler::examContentsRegistration) // 시험 컨텐츠 추가
                        .PUT("/lectureShow", handler::lectureShow) // 강의 노출
                        .POST("/applyForLecture", handler::applyForLecture) // 수강 신청
                        .GET("/findLectureListByStudent", handler::findLectureListByStudent) // 학생이 수강한 강의 목록 조회
                        .GET("/findLectureContents", handler::findLectureContents) // 강의 컨텐츠 정보 조회
                        .POST("/studentReportCardRegistration", handler::studentReportCardRegistration) // 학생의 성적 입력
                        .POST("/lectureScoreRegistration", handler::lectureScoreRegistration) // 수강한 강의에 별점 남기기
                        .PUT("/lectureHideAndFindLectureScore", handler::lectureHideAndFindLectureScore) // 강의의 노출을 종료하고 별점 열람
                )
            )
            .build();
    }
}
