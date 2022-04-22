package study.msa.msadesigntasklecture.application.lecture.response.dto;

import lombok.*;
import study.msa.msadesigntasklecture.application.lectureContents.response.dto.LectureContentsDTO;

import java.util.List;

@Getter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class LectureDTO {

    private Long lectureId; // 강의 고유번호

    private String lectureTitle; // 강의 주제
    private String lectureDescription; // 강의 설명

    private List<LectureContentsDTO> lectureContentsDTOList; // 강의 컨텐츠 목록
}
