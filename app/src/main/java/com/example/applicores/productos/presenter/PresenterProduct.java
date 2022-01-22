package com.example.applicores.productos.presenter;

import com.example.applicores.productos.interfaces.InterfaceProduct;
import com.example.applicores.productos.models.Product;
import com.example.applicores.productos.repository.RepositoryProduct;

import java.util.ArrayList;

public class PresenterProduct implements InterfaceProduct.Presenter {

    private InterfaceProduct.View view;
    private InterfaceProduct.Repository repository;

    public PresenterProduct(InterfaceProduct.View view) {
        this.view = view;
        this.repository = new RepositoryProduct(this);
    }

    @Override
    public void showProducts(ArrayList<Product> listProducts) {

    }

    @Override
    public void errorGetProduct(String message) {

    }
}
