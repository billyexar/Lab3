public class SoccerGame implements Game{
    private String aHome;
    private String aAway;
    private String aStadium;
    private int aLength;

    public SoccerGame(String pHome, String pAway, String pStadium, int pLength){
        aHome = pHome;
        aAway = pAway;
        aStadium = pStadium;
        aLength = pLength;
    }

    @Override
    public String getInfo() {
        return "Soccer Game: " + aHome + " vs " + aAway + " Stadium: " + aStadium + " Length : " + aLength + " min";
    }

    @Override
    public int getLength() {
        return aLength;
    }
}
