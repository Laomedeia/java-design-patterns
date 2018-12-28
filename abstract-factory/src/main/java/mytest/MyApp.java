package mytest;


/**
 * @author neptune
 * @create 2018 12 28 11:55
 */

public class MyApp {

    private ClubCard clubCard;
    private ClubHouse clubHouse;


    public void createClub(final ClubFactory factory) {
        setClubCard(factory.createClubCard());
        setClubHouse(factory.createClubHouse());
    }

    public ClubCard getClubCard() {
        return clubCard;
    }

    public void setClubCard(ClubCard clubCard) {
        this.clubCard = clubCard;
    }

    public ClubHouse getClubHouse() {
        return clubHouse;
    }

    public void setClubHouse(ClubHouse clubHouse) {
        this.clubHouse = clubHouse;
    }

    public static class ClubMaker {

        public enum ClubFactoryType {
            ENG,
            FRN,
            ERROR
        }

        public static ClubFactory buildClubFactory(ClubFactoryType type) {
            switch (type) {
                case ENG:
                    return new EnglishClubFactory();
                case FRN:
                    return new FranchClubFactory();
                default:
                    throw new IllegalArgumentException("Can NOT found the properly club.");
            }
        }
    }
    public static void main(String[] args) {
        MyApp myApp = new MyApp();
        myApp.createClub(ClubMaker.buildClubFactory(ClubMaker.ClubFactoryType.ENG));
        System.out.println(myApp.getClubCard().clubCard());
        System.out.println(myApp.getClubCard().getDescription());
        System.out.println(myApp.getClubHouse().clubName());
        System.out.println(myApp.getClubHouse().getDescription());
        System.out.println("------------------------------------------------------");
        myApp.createClub(ClubMaker.buildClubFactory(ClubMaker.ClubFactoryType.FRN));
        System.out.println(myApp.getClubCard().clubCard());
        System.out.println(myApp.getClubCard().getDescription());
        System.out.println(myApp.getClubHouse().clubName());
        System.out.println(myApp.getClubHouse().getDescription());

        // throw error
        myApp.createClub(ClubMaker.buildClubFactory(ClubMaker.ClubFactoryType.ERROR));

    }
}
