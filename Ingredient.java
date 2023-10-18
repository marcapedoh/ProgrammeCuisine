public class Ingredient{
    public String nom_aliment,etat;
    private int quantite;
    private String unite;

    public Ingredient(String n,String e,int q, String unite){
        this.nom_aliment=n;
        this.etat=e;
        this.quantite=q;
        this.unite=unite;
    }
    
    public boolean equals(Ingredient ingredient){
        if(this.nom_aliment==ingredient.nom_aliment && this.etat==ingredient.etat){
            return true;
        }else{
            return false;
        }
    }

    public String cuire(int temp){
        this.etat="cuit";
        if(temp<0){
            return null;
        }
        return "cet ingredient doit etre cuit pour "+temp+" degré";
    }

    public String decoupe(){
        this.etat="découpé";
        return this.etat;
    }
}