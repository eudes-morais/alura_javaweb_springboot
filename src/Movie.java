public class Movie {
    String name;
    int releaseYear;
    boolean includedInPlan;
    double sumOfRating;
    int totalRatings;
    int durationInMinutes;

    void displayTechnicalDetails() {
        System.out.println("Name: " + name);
        System.out.println("Release Year: " + releaseYear);
        // System.out.println("Included in Plan: " + includedInPlan);
        // System.out.println("Rating: " + rating);
        // System.out.println("Total Ratings: " + totalRatings);
        System.out.println("Duration (minutes): " + durationInMinutes);
    }

    void addRating(double newRating) {
        // double totalScore = this.sumOfRating * this.totalRatings;
        this.sumOfRating += newRating;
        this.totalRatings++;
        // this.sumOfRating = totalScore / this.totalRatings;
    }

    double getAverageRating() {
        if (totalRatings == 0) {
            return 0;
        }
        
        return sumOfRating / totalRatings;
    }
}
