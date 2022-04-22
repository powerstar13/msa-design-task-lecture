package study.msa.msadesigntasklecture.domain.model.lectureContents;

import lombok.*;

@Getter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class LectureContents {

    private Long lectureContentsId; // 강의 컨텐츠 고유번호

    private String lectureContentsTitle; // 강의 컨텐츠 주제
    private String lectureContentsDescription; // 강의 컨텐츠 설명
}
