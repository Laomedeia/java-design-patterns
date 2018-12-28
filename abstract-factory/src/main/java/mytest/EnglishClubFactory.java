package mytest;

/**
 * @author neptune
 * @create 2018 12 28 12:07
 */
public class EnglishClubFactory implements ClubFactory {

    @Override
    public ClubHouse createClubHouse() {
        return new EnglishClubHouse();
    }

    @Override
    public ClubCard createClubCard() {
        return new EnglishClubCard();
    }
}
