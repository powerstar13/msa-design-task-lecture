package study.msa.msadesigntasklecture.domain.model.teacher;

import lombok.*;

@Getter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Teacher {

    private Long teacherId; // 강사 고유번호

    private String teacherName; // 이름
}
