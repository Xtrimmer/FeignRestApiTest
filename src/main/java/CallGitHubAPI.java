import feign.Feign;
import feign.jackson.JacksonDecoder;

import java.util.List;

/**
 * Created by jtrimmer on 7/10/2017.
 */
public class CallGitHubAPI {
    public static void main(String[] args) {
        GitHub github = Feign.builder()
                .decoder(new JacksonDecoder())
                .target(GitHub.class, "https://api.github.com");

        // Fetch and print a list of the contributors to this library.
        List<Contributer> contributors = github.contributors("Xtrimmer", "javabook");
        for (Contributer contributor : contributors) {
            System.out.println(contributor.id + " - " + contributor.login + " (" + contributor.contributions + ")");
        }
    }
}
