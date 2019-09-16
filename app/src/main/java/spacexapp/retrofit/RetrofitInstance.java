package spacexapp.retrofit;


import org.jetbrains.annotations.NotNull;

import io.reactivex.schedulers.Schedulers;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitInstance {
    private static final String BASE_URL = "https://api.spacexdata.com/v3/";

    private RetrofitInstance() { }

    @NotNull
    public static <S> S createService(Class<S> serviceClass) {
        return RetrofitInstanceHolder.INSTANCE.create(serviceClass);
    }

    private static OkHttpClient getInterceptor() {
        HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor();
        loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

        return new OkHttpClient.Builder()
                .addInterceptor(loggingInterceptor)
                .build();
    }

    private static class RetrofitInstanceHolder {

        private static Retrofit INSTANCE = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.createWithScheduler(Schedulers.io()))
                .client(getInterceptor())
                .build();
    }
}