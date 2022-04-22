package study.msa.msadesigntasklecture.domain.model.admin;

import lombok.*;

@Getter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Admin {

    private Long adminId; // 관리자 고유번호

    private String adminName; // 관리자 이름
}
