package study.msa.msadesigntasklecture.domain.model.lecture;

import lombok.*;
import study.msa.msadesigntasklecture.domain.model.examContents.ExamContents;
import study.msa.msadesigntasklecture.domain.model.lectureContents.LectureContents;
import study.msa.msadesigntasklecture.domain.model.student.Student;

import java.util.List;

@Getter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Lecture {

    private Long lectureId; // 강의 고유번호

    private Long teacherId; // 매칭된 강사 고유번호

    private String lectureTitle; // 강의 주제
    private String lectureDescription; // 강의 설명
    private LectureShowType lectureShowType; // 강의 노출 여부

    private List<LectureContents> lectureContentsList; // 강의 컨텐츠 목록
    private List<ExamContents> examContentsList; // 시험 컨텐츠 목록
    private List<Student> studentList; // 수강 신청한 학생
}
