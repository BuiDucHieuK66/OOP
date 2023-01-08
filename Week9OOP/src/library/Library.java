package library;

import java.util.concurrent.TimeUnit;

public class Library {
    Rent[] rents;

    public Library(Rent[] rents) {
        this.rents = rents;
    }

    public Rent getLongestRent() {
        long longestRent = 0;
        int index = 0;
        for (int i = 0; i < rents.length; i++) {
            long diffInMillies = Math.abs(rents[i].getEnd().getTime() - rents[i].getBegin().getTime());
            long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
            if (diff > longestRent) {
                longestRent = diff;
                index = i;
            }
        }

        return rents[index];
    }
}
