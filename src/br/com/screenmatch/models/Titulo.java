package br.com.screenmatch.models;

public class Titulo {
    private String name;
    private int releaseYear;
    private boolean includedInPlan;
    private double sumOfRating;
    private int totalRatings;
    private int durationInMinutes;

    public void displayTechnicalDetails() {
        System.out.println("Name: " + name);
        System.out.println("Release Year: " + releaseYear);
        // System.out.println("Included in Plan: " + includedInPlan);
        // System.out.println("Rating: " + rating);
        // System.out.println("Total Ratings: " + totalRatings);
        System.out.println("Duration (minutes): " + durationInMinutes);
    }

    public void addRating(double newRating) {
        // double totalScore = this.sumOfRating * this.totalRatings;
        this.sumOfRating += newRating;
        this.totalRatings++;
        // this.sumOfRating = totalScore / this.totalRatings;
    }

    public double getAverageRating() {
        if (totalRatings == 0) {
            return 0;
        }
        
        return sumOfRating / totalRatings;
    }

    public int getTotalOfRating() {
        return totalRatings;
    }

    public String getName() {
        return name;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public boolean isIncludedInPlan() {
        return includedInPlan;
    }

    public double getSumOfRating() {
        return sumOfRating;
    }

    public int getTotalRatings() {
        return totalRatings;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void setIncludedInPlan(boolean includedInPlan) {
        this.includedInPlan = includedInPlan;
    }

    public void setSumOfRating(double sumOfRating) {
        this.sumOfRating = sumOfRating;
    }

    public void setTotalRatings(int totalRatings) {
        this.totalRatings = totalRatings;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public void showFichaTecnica() {
        System.out.println("Nome: " + name);
        System.out.println("Ano de Lançamento: " + releaseYear);
        // System.out.println("Duração em minutos: " + durationInMinutes);
    }   
}
