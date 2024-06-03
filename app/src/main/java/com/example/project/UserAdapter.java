package com.example.project;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;

import android.content.Context;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserViewHolder> {

    private List<User> userList;
    private Context context;

    public static class UserViewHolder extends RecyclerView.ViewHolder {
        public TextView nameTextView, ageTextView, locationTextView, genderTextView, hobbiesTextView, jobTextView;
        public Button messageButton, reportButton;
        public ImageView genderImageView;

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
            genderImageView = itemView.findViewById(R.id.img);  // Add this line to bind the ImageView
        }
    }

    public UserAdapter(Context context, List<User> userList) {
        this.context = context; // Initialize context
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

        // Set the image based on gender
        if (user.getGender().equalsIgnoreCase("Feminin")) {
            holder.genderImageView.setImageResource(R.drawable.female_symbol);
        } else {
            holder.genderImageView.setImageResource(R.drawable.male_symbol);
        }

        holder.messageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Inflate the custom layout
                LayoutInflater inflater = LayoutInflater.from(context);
                View dialogView = inflater.inflate(R.layout.dialog_send_message, null);

                // Find the EditText in the custom layout
                EditText messageEditText = dialogView.findViewById(R.id.messageEditText);

                // Create the AlertDialog
                new AlertDialog.Builder(context)
                        .setTitle("Send Message")
                        .setView(dialogView)
                        .setPositiveButton("Send", (dialog, which) -> {
                            // Handle the send button click
                            String message = messageEditText.getText().toString();
                            // For demonstration, just show a toast with the message
                            Toast.makeText(context, "Message: " + message, Toast.LENGTH_SHORT).show();
                        })
                        .setNegativeButton("Cancel", null)
                        .show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return userList.size();
    }
}