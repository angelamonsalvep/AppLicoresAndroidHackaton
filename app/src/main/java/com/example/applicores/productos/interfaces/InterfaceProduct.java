package com.example.applicores.productos.interfaces;

import com.example.applicores.productos.models.Product;

import java.util.ArrayList;

public interface InterfaceProduct {

    interface View{
        void viewGetProducts(ArrayList<Product> listProducts);
        void errorGetProducts(String message);
    }

    interface Presenter {
        void showProducts(ArrayList<Product> listProducts);
        void errorGetProduct(String message);
    }

    interface Repository {
        void getProducts();
    }

}
