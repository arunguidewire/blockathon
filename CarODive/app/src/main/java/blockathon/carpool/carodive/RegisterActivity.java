package blockathon.carpool.carodive;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import blockathon.carpool.model.CarODive;
import blockathon.carpool.model.Employee;
import blockathon.carpool.services.RegisterService;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.File;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_user);
    }

    public void registerEmployee(View v) throws JSONException {
        Employee employee = new Employee();
        employee.setCompanyName("EY");
        employee.setEmailID("arunkumar.rajendran1@in.ey.com");
        employee.setEmpID("INO1042187");
        employee.setITPark("DLF");
        ObjectMapper objectMapper = new ObjectMapper();
        String url = "http://192.168.1.6:3000/createEmployee";

        Gson gson = new GsonBuilder().create();
        String json = gson.toJson(employee);
        JSONObject jsonObj = new JSONObject(json);

        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(
                Request.Method.POST,
                url,
                jsonObj,
                null,
                null
        );

        RequestQueue requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(jsonObjectRequest);
    }
}
