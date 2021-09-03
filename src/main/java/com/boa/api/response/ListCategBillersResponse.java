package com.boa.api.response;

import java.util.ArrayList;
import java.util.List;


public class ListCategBillersResponse extends GenericResponse {
    private List<CategorieBiller> listCategoriesBillers = new ArrayList<>();

    public ListCategBillersResponse() {
    }

    public ListCategBillersResponse(List<CategorieBiller> listCategoriesBillers) {
        this.listCategoriesBillers = listCategoriesBillers;
    }

    public List<CategorieBiller> getListCategoriesBillers() {
        return this.listCategoriesBillers;
    }

    public void setListCategoriesBillers(List<CategorieBiller> listCategoriesBillers) {
        this.listCategoriesBillers = listCategoriesBillers;
    }

    public ListCategBillersResponse listCategoriesBillers(List<CategorieBiller> listCategoriesBillers) {
        setListCategoriesBillers(listCategoriesBillers);
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " listCategoriesBillers='" + getListCategoriesBillers() + "'" +
            "}";
    }

}
