/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesMetier;

import java.util.ArrayList;

/**
 *
 * @author jacqu
 */
public class Trader
{
    // A vous de jouer
    
    private int idTrader;
    private String nomTrader;
    private ArrayList<Action> lesActions;
    
    public Trader(int unId, String unNom)
    {
        idTrader = unId;
        nomTrader = unNom;
        lesActions = new ArrayList<Action>();
    }

    /**
     * @return the idTrader
     */
    public int getIdTrader() {
        return idTrader;
    }

    /**
     * @return the nomTrader
     */
    public String getNomTrader() {
        return nomTrader;
    }

    /**
     * @return the lesActions
     */
    public ArrayList<Action> getLesActions() {
        return lesActions;
    }
    
    
}
