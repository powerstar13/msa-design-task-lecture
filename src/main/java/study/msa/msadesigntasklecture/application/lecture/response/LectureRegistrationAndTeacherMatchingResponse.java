package study.msa.msadesigntasklecture.application.lecture.response;

import lombok.*;

@Getter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class LectureRegistrationAndTeacherMatchingResponse {

    private long lectureId; // 강의 고유번호
}
