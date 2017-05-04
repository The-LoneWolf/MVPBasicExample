package ir.technopedia.quote.main;

/**
 * Created by uTheLoneWolf on 5/4/2017.
 */

public interface MainActivityMVP {

    interface View {
        void showToast(String msg);
    }

    interface Presenter {
        void setView(MainActivityMVP.View view);

        void ShowMessageBtnClicked();
    }

    interface Model {

    }
}
