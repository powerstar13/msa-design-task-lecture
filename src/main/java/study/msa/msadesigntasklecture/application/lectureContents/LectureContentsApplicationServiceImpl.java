package study.msa.msadesigntasklecture.application.lectureContents;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.server.ServerRequest;
import study.msa.msadesigntasklecture.application.lectureContents.response.FindLectureContentsResponse;
import study.msa.msadesigntasklecture.application.lectureContents.response.LectureContentsRegistrationResponse;

@Service
public class LectureContentsApplicationServiceImpl implements LectureContentsApplicationService {

    @Override
    public LectureContentsRegistrationResponse lectureContentsRegistration(ServerRequest request) {
        return LectureContentsRegistrationResponse.builder().build();
    }

    @Override
    public FindLectureContentsResponse findLectureContents(ServerRequest request) {
        return FindLectureContentsResponse.builder().build();
    }
}
