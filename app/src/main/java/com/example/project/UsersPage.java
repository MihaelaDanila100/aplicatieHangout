package com.example.project;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class UsersPage extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_users_page);

        List<User> users = new ArrayList<>();
        users.add(new User("Ana", 28, "Bucuresti", "Feminin", "Calatorii, Fotografie", "Marketing Manager"));
        users.add(new User("Alex", 23, "Bucuresti", "Masculin", "Gratar, Sport", "Contabil"));
        users.add(new User("Felicia", 40, "Bucuresti", "Feminin", "Citit, Poezie", "Industria Bijutiera"));
        users.add(new User("Ana", 22, "Bucuresti", "Feminin", "Socializare, Beletirstica", "Medic"));
        users.add(new User("Ana", 28, "Bucuresti", "Feminin", "Calatorii, Fotografie", "Marketing Manager"));
        users.add(new User("Alex", 23, "Bucuresti", "Masculin", "Gratar, Sport", "Contabil"));
        users.add(new User("Felicia", 40, "Bucuresti", "Feminin", "Citit, Poezie", "Industria Bijutiera"));
        users.add(new User("Ana", 22, "Bucuresti", "Feminin", "Socializare, Beletirstica", "Medic"));

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);

        // Set up GridLayoutManager with 2 columns
        layoutManager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(layoutManager);

        adapter = new UserAdapter(users);
        recyclerView.setAdapter(adapter);
    }
}