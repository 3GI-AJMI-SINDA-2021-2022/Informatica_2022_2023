
public class Lavatrice
{
    private String marca;
    private String modello;
    private double prezzo;
    private int programma;
    private int temperatura;
    private int giriCentrifuga;
    private int kg;
    private boolean acceso;
    private double tempo;
    
    public Lavatrice(){
        this.marca = "anonimo";
        this.modello = "anonimo";
        this.prezzo = 0;
        this.programma = 0;
        this.temperatura = 0;
        this.giriCentrifuga = 0;
        this.kg = 0;
        this.acceso = false;
        this.tempo = 0;
    }
    public Lavatrice(String m, String mod, double p, int t, int c, int kg,boolean a, double tempo, int pro){
        if(m!=null){
        this.marca=m;
        }else{
        this.marca="anonimo";
        }
        if(mod!=null){
        this.modello=mod;
        }else{
        this.modello="anonimo";
        }
        if(p<0.0){
        this.prezzo=0.0;
        }else{
        this.prezzo=p;
        }
        if(t>0){
        this.temperatura=t;
        }else{
        this.temperatura=0;
        }
        if(c>0){
        this.giriCentrifuga=c;
        }else{
        this.giriCentrifuga=0;
        }
        if(tempo<0.0){
        this.tempo=t;
        }else{
        this.tempo=0;
        }
        if(kg>0){
        this.kg=kg;
        }else{
        this.kg=0;
        }
        if(pro>0){
        this.programma=pro;
        }else{
        this.programma=0;
        }
        if(a){
        this.acceso=a;
        }else{
        this.acceso=false;
        }
    }
    public String toString(){
        String out= "la lavatrice:  ";
        out+= "di marca" +this.marca+ "/n";
        out+= "modello" +this.modello+ "/n";
        out+= "prezzo" +this.prezzo+ "/n";
        if(this.acceso){
            out+= "è accesa";
        }else{
            out+= "è spenta";
        }
        out+= "il programma impostato è:" +this.programma+ "/n";
        out+= "la temperatura scelta è:" +this.temperatura+ "/n";
        out+= "i giri della centrifuga sono:" +this.giriCentrifuga+ "/n";
        out+= "i kg di bucato sono:" +this.kg+ "/n";
        out+= "il programma impiegherà:" +this.tempo+ "ore";
        return out;
    }
    public void accesa(){
        this.acceso=true;
    }
    public void spenta(){
        this.acceso=false;
    }
}