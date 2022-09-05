package realTimeCoding;

public abstract class Presenter<V extends View> {
    protected V view;
    public void updateUI(V view) {
        this.view = view;
    }

    public  void stopUI() {
        view = null;
    }
}
