package osztalyokEsObjektumok.references.socialnetwork;

public class SocialNetwroksMain {
    public static void main(String[] args) {
       SocialNetwork socialNetwork = new SocialNetwork();
       socialNetwork.addMember("Pocahontas");
       socialNetwork.addMember("Mulan");
       socialNetwork.addMember("Arielle");
       socialNetwork.addMember("Megara");
       socialNetwork.connect("Mulan", "Megara");
       socialNetwork.connect("Megara", "Mulan");

        System.out.println(socialNetwork.bidirectionalConnections());
    }

}
