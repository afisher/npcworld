/**
 * @author Ashley Fisher (fish.ash@gmail.com)
 */
public interface World {
    public Dna crossover(Dna d1, Dna d2);
    public Dna mutate(Dna d);

    public Population getPopulation();

    public void step();
    public void reproduce();

    public Individual mate(Individual i1, Individual i2);
}
