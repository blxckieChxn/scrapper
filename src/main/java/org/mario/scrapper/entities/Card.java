package org.mario.scrapper.entities;

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
    //Core
    @Id
    Long id;
    String lang;
    Long cardmarketId;
    String layout;

    //Gameplay
    String name;
    List<Card> all_parts; //Si la carta pone tokens, o tiene otra mitad con meld, etc
    List<Card> faces; //Si tiene dos caras
    Double cmc; //Algunas cartas de unfinity tienen cmc con decimales
    Color colorIdentity;

    String set;
    //Legality legalities;

    Boolean full_art;
    Boolean textless;
    List<Double> prices; //diferentes monedas(hay que hacerlo de otra forma para fijar solo eur y usd)

    List<String> purchase_uris;
}
