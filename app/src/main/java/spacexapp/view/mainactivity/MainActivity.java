package spacexapp.view.mainactivity;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.spacexapp.R;
import spacexapp.adapter.LaunchListAdapter;
import spacexapp.model.Launch;
import spacexapp.view.launchdetail.LaunchDetailFragment;

public class MainActivity extends AppCompatActivity implements LaunchListAdapter.ItemClickListener, LaunchDetailFragment.OnFragmentInteractionListener {

    private MainViewModel viewModel;
    private LaunchListAdapter adapter;
    private RecyclerView rvLaunchList;
    private LaunchDetailFragment launchDetailFragment;
    private FrameLayout flDetails;
    private ProgressBar loader;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewModel = ViewModelProviders.of(this).get(MainViewModel.class);
        flDetails = findViewById(R.id.fl_launch_details);
        loader = findViewById(R.id.progress);
        loader.setVisibility(View.VISIBLE);
        initRecyclerView();
        initLaunchObserver();
        initDetailFragment();
        viewModel.loadLaunchData();
    }

    private void initRecyclerView() {
        rvLaunchList = findViewById(R.id.rv_launch_list);
        rvLaunchList.setLayoutManager(new LinearLayoutManager(this));
        rvLaunchList.setHasFixedSize(true);
        adapter = new LaunchListAdapter();
        adapter.setClickListener(this);
        rvLaunchList.setAdapter(adapter);
        rvLaunchList.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
    }

    private void initLaunchObserver() {
        viewModel.getLaunchListLiveData().observe(this, launches -> {
            if (launches != null)
                adapter.loadList(launches);
            else
                Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();
            loader.setVisibility(View.GONE);
        });
    }

    private void initDetailFragment() {
        launchDetailFragment = new LaunchDetailFragment();
        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.fl_launch_details, launchDetailFragment)
                .commit();
    }

    @Override
    public void onItemClick(View view, int position) {
        Launch launch = adapter.getLaunchItem(position);
        launchDetailFragment.loadDetails(launch);
        flDetails.setVisibility(View.VISIBLE);
    }

    @Override
    public void closeDetails() {
        flDetails.setVisibility(View.GONE);
    }
}