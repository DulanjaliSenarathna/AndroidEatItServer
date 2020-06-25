package com.example.dul.androideatitserver.Remote;

import com.example.dul.androideatitserver.Model.MyResponse;
import com.example.dul.androideatitserver.Model.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAAxQNTZX4:APA91bF6QVM3CvEgRIFXWqr9WBkkb4D-zFTIfrFKDSlNgeG9LNYv2bEkKIJVlTul8IlE6G7vU4fZmaoZZlJVTWmMR7p-JtU2TbLdHduMg0IWjGg7cYvdwJehO_TNPNORnydKA-F5y1XO"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification (@Body Sender body);

}
