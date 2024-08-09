import java.util.Optional;

public class TicketManager {
    private static TicketManager instance = null;
    private int count;
    private final int LIMITS = 2;
    private TicketManager() {
        count = 0;
    }
    public  static  TicketManager getInstance() {
        if (instance == null) instance = new TicketManager();
        return instance;
    }
    public   Optional<Ticket> issue() {
        if (count >= LIMITS) return Optional.empty();
        return Optional.of(new Ticket(count++));
    }
}
