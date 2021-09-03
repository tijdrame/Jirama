package com.boa.api.response;

public class CategorieBiller {
    private String libelle;
    private String code;

    public CategorieBiller() {
    }

    public CategorieBiller(String libelle, String code) {
        this.libelle = libelle;
        this.code = code;
    }

    public String getLibelle() {
        return this.libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public CategorieBiller libelle(String libelle) {
        setLibelle(libelle);
        return this;
    }

    public CategorieBiller code(String code) {
        setCode(code);
        return this;
    }


    @Override
    public String toString() {
        return "{" +
            " libelle='" + getLibelle() + "'" +
            ", code='" + getCode() + "'" +
            "}";
    }

}
