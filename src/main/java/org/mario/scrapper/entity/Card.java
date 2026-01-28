package org.mario.scrapper.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name="cards")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Card {
    @Id
    Long id;
    String name;


    String lang;
    String set;
    //Legality legalities;

    Boolean full_art;
    Boolean textless;
    List<Double> prices; //diferentes monedas(hay que hacerlo de otra forma para fijar solo eur y usd)

    List<String> purchase_uris;
}
