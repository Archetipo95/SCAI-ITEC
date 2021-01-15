import java.util.ArrayList;

public class Person{

    private final int idPerson;
    private final String name;
    private ArrayList<House> HouseOfProperty = new ArrayList<>();
//    private ArrayList<Casa> listaCase = new ArrayList<>();

    public Person(int idPerson, String name) {
        this.idPerson = idPerson;
        this.name = name;
    }

	// getters
    public String getName() {
        return name;
    }

    public int getIdPerson() {
        return idPerson;
    }

    public ArrayList<House> getListaCaseProprieta() {
        return this.HouseOfProperty;
    }
//    public ArrayList<Casa> getListaCase() {
//        return this.listaCase;
//    }
    
    // Add member to house
    public void addMemberToHouse(Person member, int idHouse) {
        // controllo se la persona che chiama il metodo è un proprietario
        // controllo se la casa esiste
        for(House casa : HouseOfProperty) {
            if(casa.getIdHouse() == idHouse)
                casa.addMember(member);
        }
    }

    // Remove member from house
    public void removeMemberFromHouse(Person member, int idHouse) {
    	// controllo se la persona che chiama il metodo è un proprietario
        // controllo se la casa esiste
    	// controlla se membro esiste
        for(House casa : HouseOfProperty) {
            if(casa.getIdHouse() == idHouse)
                casa.removeMember(member);
        }
    }
   
    //add dispositivo(dispositivo, casa)
//    public void addDispositivo(Dispositivo oggetto, int idCasa) {
//        // vari conrolli
//        for(Casa casa : listaCaseProprieta) {
//            if(casa.getIdCasa() == idCasa)
//                casa.addDispositivo(oggetto);
//        }
//    }

    //remove membro
//    public void removeDispositivo(Dispositivo oggetto , int idCasa) {
//        // vari controlli
//        for(Casa casa : listaCaseProprieta) {
//            if(casa.getIdCasa() == idCasa)
//                casa.removeDispositivo(oggetto);
//        }
//    }

//    public void toggle(int idDispositivo) {
//        
//    }
    
    @Override
    public String toString() {
    	return getIdPerson() + (" ") + getName();
    }

}