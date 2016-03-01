package applitest.fr.testrinko.data;

import android.os.AsyncTask;

import java.util.List;

import applitest.fr.testrinko.domain.TestItem;
import retrofit.Callback;
import retrofit.Response;
import retrofit.Retrofit;

/**
 * Created by SAN13988 on 01/03/2016.
 */
public class DataProvider {

    //faire un singleton


    public List<TestItem> getItems() {
        return items;
    }

    public void setItems(List<TestItem> items) {
        this.items = items;
    }

    private List<TestItem> items;

    public static DataProvider getInstance(){
        return  InstanceHolder.instance;
    }


    private static class InstanceHolder {
        private static final DataProvider instance = new DataProvider();
    }

}
