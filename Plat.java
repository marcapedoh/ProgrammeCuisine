import java.util.List;

public class Plat {
    private String nom_Plat;
    private List<Ingredient> lIngredients;


    public Plat(String nom){
        this.nom_Plat=nom;
    }

    public String getNom_Plat(){
        return this.nom_Plat;
    }

    public List<Ingredient> getLIngredients(){
        return this.lIngredients;
    }

    public void setLIngredients(Ingredient ingredient){
        if(ingredient==null){
            return;
        }
        this.lIngredients.add(ingredient);
    }
    public static void main(String[] args){
        Plat plat=new Plat("choucroute");

        Ingredient i1=new Ingredient("choucroute", "cuite", 500, "g");
        Ingredient i2= new Ingredient("lard", "cuit et entier", 150, "g");
        Ingredient i3= new Ingredient("saucisses", "cuit et entier", 2, "cardinalité");

        plat.setLIngredients(i1);
        plat.setLIngredients(i2);
        plat.setLIngredients(i3);

    }

    public boolean equals(Plat plat){
        int retour=0;
        for(Ingredient ingredient:lIngredients){
            for(Ingredient ingredient2:plat.lIngredients){
                if(ingredient.nom_aliment==ingredient2.nom_aliment && ingredient.etat==ingredient2.etat){
                    retour=1;
                }
            }
        }
        if(retour==1){
            return true;
        }else{
            return false;
        }
        
    }
}
