package mytest;

/**
 * @author neptune
 * @create 2018 12 28 12:07
 */
public class FranchClubFactory implements ClubFactory {

    @Override
    public ClubHouse createClubHouse() {
        return new FranchClubHouse();
    }

    @Override
    public ClubCard createClubCard() {
        return new FranchClubCard();
    }
}
