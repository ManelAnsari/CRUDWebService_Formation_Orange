package com.orange.test.crudwebservice.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.orange.test.crudwebservice.Models.User;
import com.orange.test.crudwebservice.R;

import java.util.List;

public class UserAdapter extends  RecyclerView.Adapter<UserViewHolder>{

    private Context context;
    private List<User> userList;
    public UserAdapter(Context context, List<User> apiObjects){
        this.context = context;
        this.userList =  apiObjects;
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_user, viewGroup, false);
        return new UserViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder userViewHolder, int i) {
        User user = userList.get(i);
        userViewHolder.email.setText(user.getEmail());
        userViewHolder.name.setText(user.getfName());
    }

    @Override
    public int getItemCount() {
        return userList.size();
    }

}
