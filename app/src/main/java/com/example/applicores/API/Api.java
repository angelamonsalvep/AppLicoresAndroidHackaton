package com.example.applicores.API;

import com.example.applicores.productos.models.Product;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

public interface Api {

    //Metodos de manipulación
    @GET("xxxxx")
    @Headers("Content-Type:application/json;charset=UTF-8")
    Call<ArrayList<Product>> getDatosConsultarOperadores();
}
