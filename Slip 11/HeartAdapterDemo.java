interface BeatModelInterface {
    void beat();
}

class HeartModelAdapter implements BeatModelInterface {
    public void beat() {
        System.out.println("Heart is beating");
    }
}

public class HeartAdapterDemo {
    public static void main(String[] args) {
        BeatModelInterface heartModel = new HeartModelAdapter();
        heartModel.beat();
    }
}
