package blockathon.carpool.services;

import org.json.JSONObject;

import blockathon.carpool.model.CarODive;
import retrofit2.Call;
import retrofit2.http.GET;

public interface RegisterService {

    @GET(".")
    Call<CarODive> registerEmployee(JSONObject employee);
}
