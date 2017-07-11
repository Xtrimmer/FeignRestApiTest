import feign.Param;
import feign.RequestLine;

import java.util.List;

/**
 * Created by jtrimmer on 7/10/2017.
 */
public interface GitHub {
    @RequestLine("GET /repos/{owner}/{repo}/contributors")
    List<Contributer> contributors(@Param("owner") String owner, @Param("repo") String repo);
}
