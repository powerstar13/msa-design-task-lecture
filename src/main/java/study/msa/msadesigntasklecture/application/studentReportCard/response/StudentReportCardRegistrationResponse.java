package study.msa.msadesigntasklecture.application.studentReportCard.response;

import lombok.*;

@Getter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class StudentReportCardRegistrationResponse {

    private long studentReportCardId; // 학생 성적표 고유번호
}
