package study.msa.msadesigntasklecture.application.lecture.response;

import lombok.*;

@Getter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class LectureHideAndFindLectureScoreResponse {

    private int lectureScoreResult; // 강의 별점 결과
}
