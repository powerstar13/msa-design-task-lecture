package study.msa.msadesigntasklecture.application.lectureContents.response;

import lombok.*;
import study.msa.msadesigntasklecture.application.lectureContents.response.dto.LectureContentsDTO;

@Getter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class FindLectureContentsResponse {

    private LectureContentsDTO lectureContentsDTO; // 강의 컨텐츠 정보
}
