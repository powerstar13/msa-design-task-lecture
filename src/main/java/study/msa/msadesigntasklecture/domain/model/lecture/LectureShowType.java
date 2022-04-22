package study.msa.msadesigntasklecture.domain.model.lecture;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public enum LectureShowType {

    SHOW("SHOW", "강의 노출"),
    HIDE("HIDE", "강의 숨김");

    private String name;
    private String description;
}
