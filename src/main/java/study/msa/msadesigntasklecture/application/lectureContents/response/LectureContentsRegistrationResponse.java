package study.msa.msadesigntasklecture.application.lectureContents.response;

import lombok.*;

@Getter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class LectureContentsRegistrationResponse {

    private long lectureContentsId; // 강의 컨텐츠 고유번호
}
