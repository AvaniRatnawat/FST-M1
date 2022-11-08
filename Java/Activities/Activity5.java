package activities;

public class Activity5 {

    public static void main(String[] args) {

        String title = "Incognito";
        MyBook newNovel = new MyBook();
        newNovel.setTitle(title);
        System.out.println("Title of the book is : "+newNovel.getTitle());
    }
}
