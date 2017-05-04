package ir.technopedia.quote.main;

/**
 * Created by uTheLoneWolf on 5/4/2017.
 */

public class MainActivityPresenter implements MainActivityMVP.Presenter {

    private MainActivityMVP.View view;

    @Override
    public void setView(MainActivityMVP.View view) {
        this.view = view;
    }

    @Override
    public void ShowMessageBtnClicked() {
        if (view != null) {
            view.showToast("Btn Clicked By MVP Pattern!");
        }
    }
}
