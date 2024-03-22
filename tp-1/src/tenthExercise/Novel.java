package tenthExercise;

public class Novel extends Book {

    private String kind;

    public Novel(String title, String author, String kind) {
        super(title, author);
        this.kind = kind;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    @Override
    public void showInformation() {
        System.out.println("Information about the Novel:");
        super.showInformation();
        System.out.println("Kind: " + kind);
    }
}
