package com.orderCraftSpringApp.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String  nom;
    private double prix;
    private int quantite;

    @OneToMany(mappedBy = "produit")
    private Set<CommandeProduit> commandeProduits = new HashSet<>();

    @Override
    public String toString() {
        return "Produit{" +
                ", nom='" + nom + '\'' +
                ", prix=" + prix +
                ", quantite=" + quantite +
                '}';
    }
}
