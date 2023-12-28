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
public class Commande {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String referance;
    private String status ;
    private Double prix ;

    @ManyToOne
    @JoinColumn(name = "id_client", nullable = false) // Define the foreign key relationship
    private Client client;

    @OneToMany(mappedBy = "commande")
    private Set<CommandeProduit> commandeProduits = new HashSet<>();

    @Override
    public String toString() {
        return "Commande{" +
                ", referance='" + referance + '\'' +
                ", status='" + status + '\'' +
                ", prix=" + prix +
                ", client=" + client +
                '}';
    }
}
