/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesMetier;

/**
 *
 * @author jacqu
 */
public class Action
{
    // A vous de jouer
    private int idAction;
    private String nomAction;
    private double valeurActionR;
    private double valeurActionA;
    private int quantiteAction;
    
    
    
       public Action(int unId,String unNom,double uneValeurR,double uneValeurA,int uneQuantite)
{
    idAction = unId;
    nomAction = unNom;
    valeurActionR = uneValeurR;
    valeurActionA = uneValeurA;
    quantiteAction = uneQuantite;
}

    /**
     * @return the idAction
     */
    public int getIdAction() {
        return idAction;
    }

    /**
     * @return the nomAction
     */
    public String getNomAction() {
        return nomAction;
    }

    /**
     * @return the valeurActionR
     */
    public double getValeurActionR() {
        return valeurActionR;
    }

    /**
     * @return the valeurActionA
     */
    public double getValeurActionA() {
        return valeurActionA;
    }

    /**
     * @return the quantiteAction
     */
    public int getQuantiteAction() {
        return quantiteAction;
    }

    /**
     * @param quantiteAction the quantiteAction to set
     */
    public void setQuantiteAction(int quantiteAction) {
        this.quantiteAction = quantiteAction;
    }
    
}

 
