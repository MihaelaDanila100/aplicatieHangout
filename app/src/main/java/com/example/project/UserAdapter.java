package com.example.project;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserViewHolder> {

    private List<User> userList;

    public static class UserViewHolder extends RecyclerView.ViewHolder {
        public TextView nameTextView, ageTextView, locationTextView, genderTextView, hobbiesTextView, jobTextView;
        public Button messageButton, reportButton;

        public UserViewHolder(View itemView) {
            super(itemView);
            nameTextView = itemView.findViewById(R.id.nameTextView);
            ageTextView = itemView.findViewById(R.id.ageTextView);
            locationTextView = itemView.findViewById(R.id.locationTextView);
            genderTextView = itemView.findViewById(R.id.genderTextView);
            hobbiesTextView = itemView.findViewById(R.id.hobbiesTextView);
            jobTextView = itemView.findViewById(R.id.jobTextView);
            messageButton = itemView.findViewById(R.id.messageButton);
            reportButton = itemView.findViewById(R.id.reportButton);
        }
    }

    public UserAdapter(List<User> userList) {
        this.userList = userList;
    }

    @Override
    public UserViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_item, parent, false);
        return new UserViewHolder(view);
    }

    @Override
    public void onBindViewHolder(UserViewHolder holder, int position) {
        User user = userList.get(position);
        holder.nameTextView.setText(user.getName());
        holder.ageTextView.setText(String.valueOf(user.getAge()));
        holder.locationTextView.setText(user.getLocation());
        holder.genderTextView.setText(user.getGender());
        holder.hobbiesTextView.setText(user.getHobbies());
        holder.jobTextView.setText(user.getJob());
    }

    @Override
    public int getItemCount() {
        return userList.size();
    }
}
