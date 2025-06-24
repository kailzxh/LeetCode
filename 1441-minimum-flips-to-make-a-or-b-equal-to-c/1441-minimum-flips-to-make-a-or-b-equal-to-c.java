class Solution {
    public int minFlips(int a, int b, int c) {
        int flips = 0;

        for (int i = 0; i < 32; i++) {
            int bitA = (a >> i) & 1;
            int bitB = (b >> i) & 1;
            int bitC = (c >> i) & 1;

            if ((bitA | bitB) != bitC) {
                if (bitC == 0) {
                    // both bits must be 0, so flip any 1s in a and b
                    flips += bitA + bitB;
                } else {
                    // bitC is 1 but both are 0, so need one flip
                    flips += 1;
                }
            }
        }

        return flips;
    }
}
