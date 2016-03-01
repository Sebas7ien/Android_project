package applitest.fr.testrinko.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import applitest.fr.testrinko.data.ListItemsWS;
import retrofit.Retrofit;

/**
 * Created by SAN13988 on 01/03/2016.
 */
public class MainActivity extends FragmentActivity {

    /*Acitivté pricinpale qui doit contenir un fragment Avec une recyclerView*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    public  static Intent getIntent(Context context){
        Intent intent = new Intent(context,MainActivity.class);
        return intent;
    }
}
