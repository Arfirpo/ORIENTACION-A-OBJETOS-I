package ar.edu.unlp.info.oo1.ejercicio12;

public class MostEffort extends JobScheduler {

  public MostEffort() {
    super();
  }

  @Override
  public JobDescription next() {
    JobDescription nextJob = jobs.stream()
        .max((j1, j2) -> Double.compare(j1.getEffort(), j2.getEffort()))
        .orElse(null);
    this.unschedule(nextJob);
    return nextJob;
  }
}
