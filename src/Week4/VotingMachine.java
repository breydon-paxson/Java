package Week4;

public class VotingMachine {
    private int numberYesVotes;
    private int numberNoVotes;
    private String names;

    public void voteYes() {
        numberYesVotes++;
    }
    public void voteNo() {
        numberNoVotes++;
    }
    public int returnYesCount() {
        return numberYesVotes;
    }
    public int returnNoCount() {
        return numberNoVotes;
    }
    public void clearMachine() {
        numberNoVotes = 0;
        numberYesVotes = 0;
    }

    //public String toString() {
        //int out = returnYesCount() + returnNoCount();
          //  return out;
    //}
}
