package fr.univavignon.pokedex.api;

import org.junit.Before;
import org.junit.Test;

public class IPokemonMetadataProviderTest {

    private IPokemonMetadataProvider metadataProvider;
    private PokemonMetadata bulbizarre;
    private PokemonMetadata aquali;


    @Before
    public void setUp(){

        this.bulbizarre = new PokemonMetadata(
                0,
                "Bulbizarre",
                126,
                126,
                90
        );
        this.aquali = new PokemonMetadata(
                133,
                "Aquali",
                186,
                168,
                260);


    }

    @Test
    public void shouldGetPokemonMetadata() throws PokedexException {





    }
}

