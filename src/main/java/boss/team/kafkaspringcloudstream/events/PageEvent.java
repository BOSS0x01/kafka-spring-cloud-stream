package boss.team.kafkaspringcloudstream.events;

import java.time.Duration;
import java.util.Date;

public record PageEvent(String name, String user, Date date, long duration) {
}
