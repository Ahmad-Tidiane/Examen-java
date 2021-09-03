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
public class Employer {
    private int id;
    private String prenom;
    private String nom;
    private float salaire;
    private float sal_base;
    private float nb_heur;
    private float taux_horaire;
    // heur_Golf = Heure passé sur le cours de Golf
    private float heur_Golf;
    // heur_Comm = Heure de communication
    private float heur_Comm;

    public Employer(int id, String prenom, String nom, float sal_base, float nb_heur, float taux_horaire, float heur_Golf, float heur_Comm) {
        this.id = id;
        this.prenom = prenom;
        this.nom = nom;
        this.sal_base = sal_base;
        this.nb_heur = nb_heur;
        this.taux_horaire = taux_horaire;
        this.heur_Golf = heur_Golf;
        this.heur_Comm = heur_Comm;
    }

    public Employer(String prenom, String nom, float sal_base, float nb_heur, float taux_horaire, float heur_Golf, float heur_Comm) {
        this.prenom = prenom;
        this.nom = nom;
        this.sal_base = sal_base;
        this.nb_heur = nb_heur;
        this.taux_horaire = taux_horaire;
        this.heur_Golf = heur_Golf;
        this.heur_Comm = heur_Comm;
    }

    public int getId() {
        return id;
    }


    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public float getSalaire() {
        return salaire;
    }


    public float getSal_base() {
        return sal_base;
    }

    public void setSal_base(float sal_base) {
        this.sal_base = sal_base;
    }

    public float getNb_heur() {
        return nb_heur;
    }

    public void setNb_heur(float nb_heur) {
        this.nb_heur = nb_heur;
    }

    public float getTaux_horaire() {
        return taux_horaire;
    }

    public void setTaux_horaire(float taux_horaire) {
        this.taux_horaire = taux_horaire;
    }

    public float getHeur_Golf() {
        return heur_Golf;
    }

    public void setHeur_Golf(float heur_Golf) {
        this.heur_Golf = heur_Golf;
    }

    public float getHeur_Comm() {
        return heur_Comm;
    }

    public void setHeur_Comm(float heur_Comm) {
        this.heur_Comm = heur_Comm;
    }
    
  
    

    public float payeHebdo() {
        //float Salarire_de_base = this.taux_horaire;
        if(this.nb_heur <= 40){
            this.sal_base = nb_heur * taux_horaire;
            this.salaire=this.sal_base;
        }
        if(nb_heur > 40 && nb_heur <= 60){
            this.sal_base = nb_heur * taux_horaire;
            this.salaire = 3/2 * this.sal_base;
        }
        if(nb_heur > 60) {
            return 0;
        }
     return this.salaire;   
    }
}
