package umn.ac.week11_32761;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface JsonPlaceHolderApi {
    @GET("posts")
    Call<List<umn.ac.week11_32761.Post>> getPosts();
}
