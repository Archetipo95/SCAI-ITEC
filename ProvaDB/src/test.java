/*import java.util.*;

class main {
    public static void main(String[] args) {
        
        ArrayList<Persona> utenti = new ArrayList<>();

        utenti.add(new Persona(1,"EiSiri",true));
        utenti.add(new Persona(2,"Martin2",true));
        utenti.add(new Persona(3,"Martin3",false));
        utenti.add(new Persona(4,"Silvia",true));
        utenti.add(new Persona(5,"Martin3",false));
        utenti.add(new Persona(6,"Silvia2",false));
        utenti.add(new Persona(7,"Silvia3",false));
        utenti.add(new Persona(8,"Martin5",false));

        ArrayList<Casa> casa = new ArrayList<>();

        casa.add(new Casa(1,utenti.get(0)));
        casa.add(new Casa(2,utenti.get(1)));
        casa.add(new Casa(3,utenti.get(2)));
        casa.add(new Casa(4,utenti.get(3)));
        casa.add(new Casa(5,utenti.get(4)));
        casa.add(new Casa(6,utenti.get(5)));  

        Luce lu1 = new Luce(1);
        Luce lu2 = new Luce(2);     
        Luce lu3 = new Luce(3);

        utenti.get(0).addDispositivo(lu1,1);
             
    }
}
*/

/*
N case, 1 owner, più persone

N persone, owner e non, con più case

N dispositiviSmart: luce, presa, elettrodomestico e sensore
-------------------------------------------------------
Idea di Martin & Idee di Silvia

class DataBase:
lista case
lista persone
lista dispositivi

class Casa:
int idCasa
persona proprietaria
persona[] famiglia
---
remove/remove Dispositivo

class Persona:
int idPersona
String nome
boolean isProprietario
---
getListaCaseProprieta
getListaCasa

interface Dispositivi:
---
String getStato()

class Luce implements Dispositivo:

class Presa implements Dispositivo:

class Sensore implements Dispositivo:

class Elettrodomestico implements Dispositivo:

class EiSiri:
---
getListaCase
remove/add Casa
remove/add Dispositivo
remove/add Persona
*/