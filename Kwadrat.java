class Kwadrat {

    private double bok;


    public Kwadrat(double bok) {
        this.bok = bok;
    }

    public double obliczObwod() {
        return 4 * bok;
    }

    public double obliczPole() {
        return bok * bok;
    }
}

