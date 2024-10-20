public class Main {
    public static void main(String[] args) {
        Author antonChehov = new Author("Антон", "Чехов");
        Author antonChehov2 = new Author("Антон", "Чехов");
        Book gull = new Book("Чайка", 1895, antonChehov);
        Author mikhailBulgakov = new Author("Михаил", "Булгаков");
        Book dogHeart = new Book("Собачье сердце", 1925, mikhailBulgakov);
        System.out.println(antonChehov.hashCode());
        System.out.println(antonChehov2.hashCode());
        System.out.println(antonChehov.equals(antonChehov2));

        System.out.println(gull.hashCode());
        System.out.println(dogHeart.hashCode());
        System.out.println(gull.equals(dogHeart));

        System.out.println(gull.getAuthor());
        System.out.println(gull);

        System.out.println(dogHeart.getAuthor());
        System.out.println(dogHeart);
    }
}