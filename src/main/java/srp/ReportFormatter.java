package srp;

import java.time.LocalDateTime;

public class ReportFormatter {
    public String format(int sum, double avg) {
        return "=== Report ===\n"
                + "Sum: " + sum + "\n"
                + "Average: " + avg + "\n"
                + "Generated at: " + LocalDateTime.now() + "\n";
    }
}