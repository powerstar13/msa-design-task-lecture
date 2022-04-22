package study.msa.msadesigntasklecture.application.examContents;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.server.ServerRequest;
import study.msa.msadesigntasklecture.application.examContents.response.ExamContentsRegistrationResponse;

@Service
public class ExamContentsApplicationServiceImpl implements ExamContentsApplicationService {

    @Override
    public ExamContentsRegistrationResponse examContentsRegistration(ServerRequest request) {
        return ExamContentsRegistrationResponse.builder().build();
    }
}
