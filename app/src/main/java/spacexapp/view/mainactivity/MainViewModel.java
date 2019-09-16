package spacexapp.view.mainactivity;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

import spacexapp.model.Launch;
import spacexapp.repository.SpaceXRepo;

public class MainViewModel extends AndroidViewModel {
    private SpaceXRepo repository;

    public MainViewModel(@NonNull Application application) {
        super(application);
        repository = SpaceXRepo.getInstance();
    }

    void loadLaunchData() {
        repository.loadLaunchHistory();
    }

    public void loadNext() {
        repository.loadNext();
    }

    LiveData<List<Launch>> getLaunchListLiveData() {
        return repository.getLaunchResponseLive();
    }
}
