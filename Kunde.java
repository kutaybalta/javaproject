import java.util.ArrayList;

public class Kunde extends Person {
    private boolean hat_führerschein;
    private ArrayList<Reisepaket> kundenPaketen = new ArrayList<>();

    Kunde(String name,String nach_name,String buerger_id,int alter,Boolean hat_führerschein){
        super(name, nach_name, buerger_id, alter);
        this.hat_führerschein = hat_führerschein;

    }
    Kunde(String buerger_id){
        super(buerger_id);
    }

    public void setFührerschein(boolean hat_führerschein){
        this.hat_führerschein = hat_führerschein;
    }

    public boolean getFührerschein(){
        return this.hat_führerschein;
    }

    public void setKundenPaketen(Reisepaket paket){
        this.kundenPaketen.add(paket);
    }
    public ArrayList<Reisepaket> getKundenPaketen(){
        return kundenPaketen;
    }



}
