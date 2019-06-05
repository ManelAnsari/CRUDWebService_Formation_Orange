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

public class UserViewHolder extends RecyclerView.ViewHolder  {
public TextView email;
public TextView name;
public UserViewHolder(@NonNull View itemView) {
        super(itemView);
        email = (TextView) itemView.findViewById(R.id.user_email);
        name = (TextView) itemView.findViewById(R.id.user_name);
        }
        }
