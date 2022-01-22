package com.example.applicores.productos.repository;

import com.example.applicores.productos.interfaces.InterfaceProduct;

public class RepositoryProduct implements InterfaceProduct .Repository{

    private InterfaceProduct.Presenter presenter;

    public RepositoryProduct(InterfaceProduct.Presenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void getProducts() {

    }
}
