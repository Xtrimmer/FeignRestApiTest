
public class CallGitHubAPI {
    public static void main(String[] args) {
        GitHub.api.getContributors("Xtrimmer", "javabook")
                .forEach(System.out::println);

    }
}
