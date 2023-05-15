public class Mitarbeiter extends Person{
    private String position = "";

    Mitarbeiter(String buerger_id){
        super(buerger_id);
    }

    Mitarbeiter(String name,String nach_name,String buerger_id,int alter,String position){
        super(name, nach_name, buerger_id, alter);
        this.position = position;
    }

    public void setPosition(String position){
        this.position = position;
    }

    public String getPosition(){
        return this.position;
    }




}