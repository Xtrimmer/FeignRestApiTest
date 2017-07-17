import feign.Feign;
import feign.Param;
import feign.RequestLine;
import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;

import java.util.List;

/**
 * Created by jtrimmer on 7/10/2017.
 */
public interface GitHub {

    GitHub api = Feign.builder()
            .decoder(new JacksonDecoder())
            .encoder(new JacksonEncoder())
            .target(GitHub.class, "https://api.github.com");

    @RequestLine("GET /repos/{owner}/{repo}/contributors")
    List<Contributer> getContributors(@Param("owner") String owner, @Param("repo") String repo);
}
