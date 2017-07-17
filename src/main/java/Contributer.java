import java.net.URL;
import java.util.StringJoiner;

public class Contributer {
    public String login;
    public Integer id;
    public URL avatar_url;
    public String gravatar_id;
    public URL url;
    public URL html_url;
    public URL followers_url;
    public URL following_url;
    public URL gists_url;
    public URL starred_url;
    public URL subscriptions_url;
    public URL organizations_url;
    public URL repos_url;
    public URL events_url;
    public URL received_events_url;
    public String type;
    public Boolean site_admin;
    public Integer contributions;

    @Override
    public String toString() {
        StringJoiner sj = new StringJoiner(", ", "Contributer[", "]");
        return sj
                .add("login=" + login)
                .add("id=" + id)
                .add("type=" + type)
                .add("site_admin=" + site_admin)
                .add("contributions=" + contributions)
                .toString();
    }
}