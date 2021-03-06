package Class;

public class Deadline extends Task {
    protected String by;

    public Deadline(String description, String by) {
        super(description);
        this.by = by;
    }

    @Override
    public String getDescription() {
        return "[D][" + super.getStatusIcon() + "] " + super.getDescription() + " (by: " + by + ")";
    }

    public String getType() {
        return "deadline";
    }

    public String getTime() {
        return this.by;
    }
}
