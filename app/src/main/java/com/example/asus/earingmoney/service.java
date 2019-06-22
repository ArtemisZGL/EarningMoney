package com.example.asus.earingmoney;
import com.example.asus.earingmoney.model.GetMissionsObj;
import com.example.asus.earingmoney.model.GetTokenObj;
import com.example.asus.earingmoney.model.Questionare;
import org.json.JSONObject;
import com.example.asus.earingmoney.model.Mission;

import java.util.List;

import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import rx.Observable;

public interface service{

    @Headers({"Content-Type:application/json;charset=utf-8", "Accept:application/json;"})
    @POST("/tokens")
    Observable<GetTokenObj> post_to_get_token(@Query("username") String username, @Query("password") String password);

    //@HEAD()
    @GET("/tasks/{taskID}/questionares")
    Call<Questionare> get_questionare(@Path("taskID") int taskID);

    @Headers({"Content-Type:application/json;charset=utf-8", "Accept:application/json;"})
    @GET("/missions/AllMissions")
    Observable<GetMissionsObj> getMissions(@Header("authorization") String token);

    @GET("/missions/{missionID}")
    Observable<Mission> getMissionsDetail(@Path("missionID") int missionID);
}
