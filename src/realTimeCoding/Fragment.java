package realTimeCoding;

public abstract class Fragment<V extends View,T extends Presenter<V>> {
    private T presenter;

    public Fragment(T presenter) {
        this.presenter = presenter;
    }

    public void onPause() {
        presenter.stopUI();
    }
    public void onResume(V view) {
        presenter.updateUI(view);
    }
}
