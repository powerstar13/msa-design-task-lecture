package study.msa.msadesigntasklecture.domain.model.lectureScore;

import lombok.*;

@Getter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class LectureScore {

    private Long lectureScoreId; // 강의 별점 고유번호

    private Long lectureId; // 강의 고유번호
    private Long studentId; // 학생 고유번호

    private int lectureScoreResult; // 강의 별점 결과
}
