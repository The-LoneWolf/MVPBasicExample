package ir.technopedia.quote.main;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import dagger.Provides;
import ir.technopedia.quote.R;
import ir.technopedia.quote.root.App;

public class MainActivity extends AppCompatActivity implements MainActivityMVP.View, View.OnClickListener {

    @BindView(R.id.btn_show_message)
    TextView btn_show_message;

    MainActivityMVP.Presenter presenter = new MainActivityPresenter();
    @Inject
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((App) getApplication()).getAppComponent().inject(this);
        ButterKnife.bind(this);
        btn_show_message.setOnClickListener(this);

    }

    @Override
    protected void onResume() {
        super.onResume();
        presenter.setView(this);
    }

    @Override
    public void showToast(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_LONG).show();
    }

    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.btn_show_message) {
            presenter.ShowMessageBtnClicked();
        }

    }
}
