package com.boa.api.response;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * PayementResponse
 */
@XmlRootElement
public class PayementResponse extends GenericResponse{
    private AnnulationPaiement annulationPaiement;

    public AnnulationPaiement getAnnulationPaiement() {
        return this.annulationPaiement;
    }

    public void setAnnulationPaiement(AnnulationPaiement annulationPaiement) {
        this.annulationPaiement = annulationPaiement;
    }

    @Override
    public String toString() {
        return "{" +
            ", annulationPaiement='" + annulationPaiement + "'" +
            "}";
    }

}