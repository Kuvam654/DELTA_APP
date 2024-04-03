package com.example.moonstruck;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MyAdapter adapter;
    private List<String> dataList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Fetch or create data list
        dataList = fetchData();

        // Initialize adapter with data list
        adapter = new MyAdapter(dataList);
        recyclerView.setAdapter(adapter);
    }

    // Method to fetch or create data list
    private List<String> fetchData() {
        List<String> data = new ArrayList<>();
        // Add sample data
        data.add("Item 1");
        data.add("Item 2");
        data.add("Item 3");
        // Add more items as needed
        return data;
    }
}
