package applitest.fr.testrinko.data;

import java.util.List;

import applitest.fr.testrinko.domain.TestItem;
import retrofit.Call;
import retrofit.http.GET;



public interface ListItemsWS {

    @GET("/Sebas7ien/Android_project/raw/master/data.json")
    Call<List<TestItem>> listTestItem();

}

