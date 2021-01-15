import java.util.ArrayList;

public class House {

    private final int idHouse;
    private final Person owner;
    private ArrayList<Person> family = new ArrayList<>();
//    private ArrayList<Dispositivo> oggettiSmart = new ArrayList<>();

    public House(int idHouse, Person owner) {
        this.idHouse = idHouse;
        this.owner = owner;
    }

    // getters
    public int getIdHouse() {
        return idHouse;
    }

    public Person getOwner() {
        return owner;
    }

    public ArrayList<Person> getFamiglia() {
        return family;
    }

//    public ArrayList<Dispositivo> getOggettiSmart() {
//        return this.oggettiSmart;
//    }

    // Add member to family
    public void addMember(Person member) {
        family.add(member);
    }

    // Remove member from family
    public void removeMember(Person member) {
        int index = 0;
        for(Person memberFound : family) {
            if(memberFound.getIdPerson() == member.getIdPerson()) {
            	family.remove(index);
            	break;
            }
            index++;
        }
    }

    //addDispositivo
//    public void addDispositivo(Dispositivo oggetto){
//        this.oggettiSmart.add(oggetto);
//    }

        // removeDispositivo
//    public void removeDispositivo(Dispositivo oggetto) {
        //int x corrispondente a dove si trova il l'oggetto
//        int x = 0;
//        int i = 0;
//        for(Dispositivo oggettoS : oggettiSmart) {
//            if(oggettoS.getIdDispositivo() == oggetto.getIdDispositivo())
//                x = i;
//            i++;
//        }
//        this.oggettiSmart.remove(x);
//    }
    
    @Override
    public String toString() {
    	return ("House ") + getIdHouse() + ("  is owned by ") + owner.getName();
    }

}