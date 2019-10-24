package com.vehiculerental.reservations.DAO;

import java.util.Date;


public interface ReservationInterface{



    /**
     * Récupère le nom de famille du client.
     * @return le nom de famille du client
     */
    public Date getDateOfBeginning();

    /**
     * Définit le nom de famille du client
     * @param dateOfBeginning le nom de famille du client
     */
    public void setDateOfBeginning(Date dateOfBeginning);

    /**
     * Récupère le prénom du client.
     * @return le prénom du client
     */
    public Date getDateOfEnd();

    /**
     * Définit le prénom du client.
     * @param dateOfEnd le prénom du client
     */
    public void setDateOfEnd(Date dateOfEnd);

    /**
     * Récupère la date de naissance du client.
     * @return la date de naissance du client
     */
    public int getRentingPrice();

    /**
     * Définit la date de naissance du client.
     * @param rentingPrice la date de naissance du client
     */
    public void setRentingPrice(int rentingPrice);

    /**
     * Récupère le numéro d'obtention du permis.
     * @return le numéro d'obtention du permis
     */
    public int getNumberOfKilometers();

    /**
     * Définit le numéro d'obtention du permis.
     * @param numberOfKilometers le numéro d'obtention du permis
     */
    public void setNumberOfKilometers(int numberOfKilometers);

    /**
     * Récupère l'id du véhicule réservé.
     * @return l'id du véhicule réservé
     */
    public int getVehiculeId();

    /**
     * Définit l'id du véhicule réservé.
     * @param vehiculeId l'id du véhicule réservé
     */
    public void setVehiculeId(int vehiculeId);

    /**
     * Récupère l'id du client locataire.
     * @return l'id du client locataire
     */
    public int getCustomerId();

    /**
     * Définit l'id du client locataire
     * @param customerId du client locataire
     */
    public void setCustomerId(int customerId);


}
