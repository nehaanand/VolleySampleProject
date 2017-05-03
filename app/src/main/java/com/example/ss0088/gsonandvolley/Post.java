package com.example.ss0088.gsonandvolley;

import java.util.Date;
import com.google.gson.annotations.SerializedName;

public class Post {

    @SerializedName("SubBrandName")
    String subbrandname;

    @SerializedName("Price")
    String price;

    String title;
    String author;
    String url;
    String body;

}