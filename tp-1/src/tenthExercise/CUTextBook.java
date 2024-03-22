package tenthExercise;

public class CUTextBook extends TextBook {

    private String school;

    public CUTextBook(String title, String author, String course, String school) {
        super(title, author, course);
        this.school = school;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    @Override
    public void showInformation() {
        super.showInformation();
        System.out.println("School: " + school);
    }
}
