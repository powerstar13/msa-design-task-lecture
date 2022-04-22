package study.msa.msadesigntasklecture.domain.model.studentReportCard;

import lombok.*;

@Getter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class StudentReportCard {

    private Long studentReportCardId; // 학생 성적표 고유번호

    private Long studentId; // 학생 고유번호
    private Long lectureId; // 강의 고유번호

    private Integer studentReportCardScore; // 학생 성적표 점수
}
