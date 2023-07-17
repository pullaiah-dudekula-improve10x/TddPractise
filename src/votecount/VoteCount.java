package votecount;

public class VoteCount {

    public int voteCount(int upVotes, int downVotes) {
        if (upVotes == 0 && downVotes == 0) {
            return 0;
        } else if (upVotes < 0 && downVotes < 0) {
            return -1;
        } else {
            int voteCount = 0;
            voteCount = upVotes - downVotes;
            return voteCount;
        }
    }
}
