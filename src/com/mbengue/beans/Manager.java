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
public class Manager extends Employer{
    //nb_heure_golf = nombre d'heure passé sur le golf
    private float nb_heure_golf;

    public Manager(int id, String prenom, String nom, float sal_base, float nb_heur, float taux_horaire, float heur_Golf, float heur_Comm) {
        super(id, prenom, nom, sal_base, nb_heur, taux_horaire, heur_Golf, heur_Comm);
        this.nb_heure_golf=0;
    }

    

    public float getNb_heure_golf() {
        return nb_heure_golf;
    }

    public void setNb_heure_golf(float nb_heure_golf) {
        this.nb_heure_golf = nb_heure_golf;
    }
    // nb_heur_Cours_Golf = nombre d'heure passé sur le cours de golf
    public void AjouterHeureGolf(float nb_heure_Cours_Golf) {
        this.nb_heure_golf += this.nb_heure_golf + nb_heure_Cours_Golf;
        float newNbrHeureTravail = this.getNb_heur() + nb_heure_Cours_Golf;
        this.setNb_heur(newNbrHeureTravail);
        
    }
    
    
}
