package comparable;

class Movie implements Comparable<Movie>{
    private String name;
    private double rating;
    private int year;

    @Override
    public int compareTo(Movie movie) {
        return this.getYear() - movie.getYear();
    }

    public Movie(String name, double rating, int year) {
        this.name = name;
        this.rating = rating;
        this.year = year;
    }

    public double getRating() {
        return this.rating;
    }

    public String getName() {
        return this.name;
    }

    public int getYear() {
        return this.year;
    }
}
