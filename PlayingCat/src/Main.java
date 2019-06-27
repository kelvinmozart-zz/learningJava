public class Main {

    public static void main(String[] args) {

        boolean catPlaying = PlayingCat.isCatPlaying(true, 10);
        System.out.println(catPlaying);
        catPlaying = PlayingCat.isCatPlaying(false, 36);
        System.out.println(catPlaying);
        catPlaying = PlayingCat.isCatPlaying(false, 35);
        System.out.println(catPlaying);
    }
}
