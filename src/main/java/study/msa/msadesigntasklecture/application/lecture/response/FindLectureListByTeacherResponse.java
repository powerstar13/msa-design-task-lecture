package study.msa.msadesigntasklecture.application.lecture.response;

import lombok.*;
import study.msa.msadesigntasklecture.application.lecture.response.dto.LectureDTO;

import java.util.List;

@Getter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class FindLectureListByTeacherResponse {

    private List<LectureDTO> lectureDTOList; // 강의 목록 정보
}
