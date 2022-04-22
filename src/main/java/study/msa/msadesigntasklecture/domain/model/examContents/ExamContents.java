package study.msa.msadesigntasklecture.domain.model.examContents;

import lombok.*;

@Getter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ExamContents {

    private Long examContentsId; // 시험 컨텐츠 고유번호

    private String examContentsQuiz; // 시험 컨텐츠 문제
    private String examContentsCorrectAnswer; // 시험 컨텐츠 정답
}
