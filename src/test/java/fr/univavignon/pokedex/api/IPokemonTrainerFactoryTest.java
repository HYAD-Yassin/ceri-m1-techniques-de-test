package fr.univavignon.pokedex.api;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;


public class IPokemonTrainerFactoryTest {

    private IPokemonTrainerFactory pokemonTrainerFactory;


    @Before
    public void setUp(){
        this.pokemonTrainerFactory = Mockito.mock(IPokemonTrainerFactory.class);
    }

    @Test
    public void canCreateTrainer(){


    }

}
