package ir.technopedia.quote.root;

import javax.inject.Singleton;

import dagger.Component;
import dagger.Provides;
import ir.technopedia.quote.main.MainActivity;

/**
 * Created by uTheLoneWolf on 5/4/2017.
 */
@Singleton
@Component(modules = {AppModule.class})
public interface AppComponent {
    void inject(MainActivity activity);
}
