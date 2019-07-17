package com.diyinc.gala;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;



import com.diyinc.gala.DataRepository.FakeGalaRepository;
import com.google.android.material.bottomappbar.BottomAppBar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomAppBar bottomAppBar = findViewById(R.id.bottomApp);
        RecyclerView recyclerView = findViewById(R.id.galaRecyclerView);
        FakeGalaRepository repository = new FakeGalaRepository();
        GalaRecyclerViewAdapter galaRecyclerViewAdapter = new GalaRecyclerViewAdapter(this);

        recyclerView.setAdapter(galaRecyclerViewAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        galaRecyclerViewAdapter.setGalaList(repository.getListOfGala());

        RecyclerViewItemDecor recyclerViewItemDecor = new RecyclerViewItemDecor(this);

        recyclerView.addItemDecoration(recyclerViewItemDecor);
        setSupportActionBar(bottomAppBar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.bottom_app_bar_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }
}
