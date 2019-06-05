package com.orange.test.crudwebservice.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;
import com.orange.test.crudwebservice.Adapters.UserAdapter;
import com.orange.test.crudwebservice.Models.User;
import com.orange.test.crudwebservice.R;
import com.orange.test.crudwebservice.retro.ApiUtil;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView textView = (TextView)findViewById(R.id.tvTitle);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setHasFixedSize(true);
        //get all users
        ApiUtil.getServiceClass().getAllUsers().enqueue(new Callback<List<User>>() {
            @Override
            public void onResponse(Call<List<User>> call, Response<List<User>> response) {
                List<User> userList = response.body();
                UserAdapter adapter = new UserAdapter(getApplicationContext(), userList);
                recyclerView.setAdapter(adapter);
               // textView.setText(userList.get(0).getEmail());
            }

            @Override
            public void onFailure(Call<List<User>> call, Throwable t) {
                textView.setText("error");
            }
        });

        //get user by id
    /*    ApiUtil.getServiceClass().getUserById(5).enqueue(new Callback<User>() {
            @Override
            public void onResponse(Call<User> call, Response<User> response) {
                User user = response.body();
                textView.setText(user.getEmail());

            }

            @Override
            public void onFailure(Call<User> call, Throwable t) {
                textView.setText("error");

            }
        });*/
    //delete user by id
        /*ApiUtil.getServiceClass().deleteUserById(5).enqueue(new Callback<User>() {
            @Override
            public void onResponse(Call<User> call, Response<User> response) {
                User user = response.body();
                if(user != null)
                textView.setText(user.getEmail());
                else
                    textView.setText("user null");

            }

            @Override
            public void onFailure(Call<User> call, Throwable t) {
                textView.setText("error");

            }
        });
*/
        // Add user
       /* ApiUtil.getServiceClass().addUser("ahmed@gmail.com","ahmed","neffati",23,"5665566","tunisia").enqueue(new Callback<User>() {
            @Override
            public void onResponse(Call<User> call, Response<User> response) {
                User user = response.body();
                if(user != null)
                    textView.setText(user.getEmail()+" id = "+user.getId());
                else
                    textView.setText("user null");

            }

            @Override
            public void onFailure(Call<User> call, Throwable t) {
                textView.setText("error");

            }
        });*/
        // update user
      /* ApiUtil.getServiceClass().updateUser(13,13,"ahmedneffati@gmail.com","ahmed","neffati",23,"5665566","tunisia").enqueue(new Callback<User>() {
            @Override
            public void onResponse(Call<User> call, Response<User> response) {

            }

            @Override
            public void onFailure(Call<User> call, Throwable t) {
                textView.setText("error");

            }
        });*/



    }
}
