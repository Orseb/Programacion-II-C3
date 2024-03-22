package tenthExercise;

public class TenthExercise {
    public static void tenthExercise() {

        System.out.println("====== TEXT BOOK ======");
        TextBook textBook = new TextBook("Java Programming", "John Smith", "Programming");
        textBook.setPrice(20);
        textBook.showInformation();

        System.out.println("\n====== CU TEXT BOOK ======");
        CUTextBook cuTextBook = new CUTextBook("History of Colombia", "Juan Pérez", "History", "Generic History School");
        cuTextBook.setPrice(15);
        cuTextBook.showInformation();

        System.out.println("\n====== NOVEL ======");
        Novel novel = new Novel("To Kill a Mockingbird", "Harper Lee", "Classic");
        novel.setPrice(30);
        novel.showInformation();
    }
}
