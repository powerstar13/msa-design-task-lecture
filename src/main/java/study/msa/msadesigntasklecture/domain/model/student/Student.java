package study.msa.msadesigntasklecture.domain.model.student;

import lombok.*;

@Getter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    private Long studentId; // 학생 고유번호

    private String studentName; // 이름
}
