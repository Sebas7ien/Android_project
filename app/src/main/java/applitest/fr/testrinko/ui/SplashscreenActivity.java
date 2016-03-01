package applitest.fr.testrinko.ui;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.widget.Toast;

import java.util.List;

import applitest.fr.testrinko.R;
import applitest.fr.testrinko.data.DataProvider;
import applitest.fr.testrinko.data.ListItemsWS;
import applitest.fr.testrinko.domain.TestItem;
import retrofit.Call;
import retrofit.Callback;
import retrofit.GsonConverterFactory;
import retrofit.Response;
import retrofit.Retrofit;

/**
 * Created by SAN13988 on 01/03/2016.
 */
public class SplashscreenActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://github.com")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        ListItemsWS service = retrofit.create(ListItemsWS.class);

        Call<List<TestItem>> items = service.listTestItem();
        items.enqueue(new Callback<List<TestItem>>() {
            @Override
            public void onResponse(Response<List<TestItem>> response, Retrofit retrofit) {
                DataProvider.getInstance().setItems(response.body());
                startActivity(MainActivity.getIntent(getApplicationContext()));
            }

            @Override
            public void onFailure(Throwable t) {
                Toast.makeText(getApplication(),"Error",Toast.LENGTH_SHORT).show();
            }
        });
    }

}
