package realTimeCoding;

public class Screen1Presenter extends Presenter<Screen1View> {
    @Override
    public void updateUI(Screen1View view) {
        super.updateUI(view);
        super.view.goToScreen2();
    }

    @Override
    public void stopUI() {
        super.stopUI();
    }
}
