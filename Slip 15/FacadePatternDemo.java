class HomeTheaterFacade {
    void watchMovie() { System.out.println("Movie is playing"); }
}

public class FacadePatternDemo {
    public static void main(String[] args) {
        HomeTheaterFacade theater = new HomeTheaterFacade();
        theater.watchMovie();
    }
}
