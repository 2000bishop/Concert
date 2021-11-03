package org.vashonsd;

public class Main {

    /**
     * For now, use the main() method to print out the name of a show.
     * Create several Performers by giving them names and descriptions.
     * If you want a performer to have had one or more hit songs, use the performer's
     * .addHit() method along with the name of the hit.
     * Then print out the performers.
     */
    public static void main(String[] args) {

        System.out.println("welcome to the admiral");
        Performer jackNicholson = new Performer("jackNicholson","played primarily in movies");
        jackNicholson.addHit("Batman");
        System.out.println(jackNicholson);
        Performer stanly = new Performer("stanly","directed movies");
        stanly.addHit("spiderman");
        System.out.println(stanly);
        Performer johnnydepp = new Performer("johnnydepp","worked closely with tim berten");
        johnnydepp.addHit("pirates of the carabean");
        System.out.println(johnnydepp);

    }
}
