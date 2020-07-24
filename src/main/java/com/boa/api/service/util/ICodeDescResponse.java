package com.boa.api.service.util;

/**
 * ICodeDescResponse
 */
public interface ICodeDescResponse {

    public static String SUCCES_CODE = "200";
    public static String CLIENT_ABSENT_CODE = "305";
    public static String FILIALE_ABSENT_CODE = "303";
    public static String PARAM_ABSENT_CODE = "304";
    public static String ECHEC_CODE = "301";
    public static String ECHEC_DESCRIPTION = "Operation echouee.";
    public static String FACTURE_NON_TROUVE = "Facture non trouve.";
    public static String ACCOUNT_PRINCIPAL_NON_TROUVE = "Account Principal non trouve.";
    public static String BILLER_NON_TROUVE = "Biller non trouve.";
    public static String FEES_NON_TROUVE = "Frais non trouve.";
    public static String PARAM_DESCRIPTION = "Parametre(s) obligatoire(s) absent(s)";
    public static String SUCCES_DESCRIPTION = "Operation effectuee avec succes";
    public static String FILIALE_ABSENT_DESC = "Une erreur est survenue. Message = ";
    public static String CLIENT_ABSENT_DESC = "Numero Client absent dans nos livres";
    public static String PARAM_ABSENT_DESC = "Parametre non trouve";
    public static String SERVICE_ABSENT_DESC = "Service non parametre";
    public static String RESPONSE_INC = "Quelque chose d'innatendu s'est produit, veuillez contacter l'Administrateur";
    //public static String ADRESSE_JIRAMA = "http://192.168.222.95/WEBSERVICE_ORACLE_WEB/awws/WebservicePlus.awws";
    //public static String ADRESSE_JIRAMA = "http://172.17.178.5:8088/mockWebservicePlusSOAPBinding";//10.132.4.97
    public static String SERVICE_CHECK_FACTURE_PTF = "Check_facture_ptf"; 
    public static String SERVICE_CHECK_REF_PTF = "Check_ref_ptf";
    public static String SERVICE_GET_BILLER_ACCOUNT = "Biller_Account";
    public static String SERVICE_PAIE_MOBILE = "Paie_Mobile";
    public static String SERVICE_AUTO_INFORMATION = "Auto_information";
    public static String SERVICE_VERIF_TRANSACTION = "Verif_transaction";
    public static String SERVICE_RECU_PAIEMENT = "Recu_paiement";
    public static String SERVICE_CHECK_CLIENT = "Check_client";
    public static String SERVICE_PAIEMENT = "Paie_Mobile";
    public static String BILLER_NAME = "JIRAMA";
    public static String ACCOUNT_PRINCIPAL = "P";

    /*-------------*/
    public static Integer COMPTE_ABSENT_CODE = 406;
    public static String COMPTE_ABSENT_DESC = "Parametre compte absent";
    
    
    public static Integer INSTITUTION_ABSENT_CODE = 407;
    public static String INSTITUTION_ABSENT_DESC = "Parametre client Absent";
    /*------*/

}