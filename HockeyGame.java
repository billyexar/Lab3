public class HockeyGame implements Game{
    private String aHome;
    private String aAway;
    private String aArena;
    private int aLength;

    public HockeyGame(String pHome, String pAway, String pArena, int pLength){
        aHome = pHome;
        aAway = pAway;
        aArena = pArena;
        aLength = pLength;
    }

    @Override
    public String getInfo() {
        return "Hockey Game: " + aHome + " vs " + aAway + " Arena: " + aArena + " Length : " + aLength + " min";
    }

    @Override
    public int getLength() {
        return aLength;
    }
}
