package spacexapp.repository;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import java.util.List;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.observers.DisposableObserver;
import spacexapp.model.Launch;
import spacexapp.retrofit.RetrofitInstance;
import spacexapp.retrofit.SpaceXService;

public class SpaceXRepo {
    private static final String SORT_BY = "launch_date_utc";
    private static final String ORDER_BY = "desc";
    private static final int SIZE_LIMIT = 50;

    private final SpaceXService service;
    private int offsetLimit = 0;
    private MutableLiveData<List<Launch>> launchResponseLive = new MutableLiveData<>();

    private SpaceXRepo() {
        this.service = RetrofitInstance.createService(SpaceXService.class);
    }

    public static SpaceXRepo getInstance() {
        return SpaceXRepoInstanceHolder.INSTANCE;
    }

    public void loadNext() {
        offsetLimit = offsetLimit + SIZE_LIMIT;
        loadLaunchHistory();
    }

    public void loadLaunchHistory() {
        service.getData(SORT_BY, ORDER_BY, SIZE_LIMIT, offsetLimit)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new DisposableObserver<List<Launch>>() {
                    @Override
                    public void onNext(List<Launch> launchList) {
                        launchResponseLive.setValue(launchList);
                    }

                    @Override
                    public void onError(Throwable e) {
                        launchResponseLive.setValue(null);
                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }

    public LiveData<List<Launch>> getLaunchResponseLive() {
        return launchResponseLive;
    }

    private static class SpaceXRepoInstanceHolder {
        private static final SpaceXRepo INSTANCE = new SpaceXRepo();
    }
}