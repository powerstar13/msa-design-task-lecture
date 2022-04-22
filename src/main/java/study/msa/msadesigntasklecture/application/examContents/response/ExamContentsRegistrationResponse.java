package study.msa.msadesigntasklecture.application.examContents.response;

import lombok.*;

@Getter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ExamContentsRegistrationResponse {

    private long examContentsId; // 시험 컨텐츠 고유번호
}
