/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mbengue.beans;

/**
 *
 * @author tidia
 */
public class Ingenieur extends Employer {
    //nb_heure_Comm  = nombre d'heure de communication
    private float nb_heure_Comm;

    public Ingenieur(int id, String prenom, String nom, float sal_base, float nb_heur, float taux_horaire, float heur_Golf, float heur_Comm) {
        super(id, prenom, nom, sal_base, nb_heur, taux_horaire, heur_Golf, heur_Comm);
        this.nb_heure_Comm=0;
    }
    public void AjouterHeureCommunication(float nb_heure_Cours_Comm) {
        this.nb_heure_Comm += this.nb_heure_Comm + nb_heure_Cours_Comm;
        float newNbrHeureTravail = this.getNb_heur() + nb_heure_Cours_Comm;
        this.setNb_heur(newNbrHeureTravail);
        
    }

    public void setNb_heure_Comm(float nb_heure_Comm) {
        this.nb_heure_Comm = nb_heure_Comm;
    }

    public float getNb_heure_Comm() {
        return nb_heure_Comm;
    }
}
