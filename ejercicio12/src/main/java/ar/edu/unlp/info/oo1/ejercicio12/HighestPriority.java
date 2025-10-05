package ar.edu.unlp.info.oo1.ejercicio12;

public class HighestPriority extends JobScheduler {

  public HighestPriority() {
    super();
  }

  @Override
  public JobDescription next() {
    JobDescription nextJob = jobs.stream()
        .max((j1, j2) -> Double.compare(j1.getPriority(), j2.getPriority()))
        .orElse(null);
    this.unschedule(nextJob);
    return nextJob;
  }
}
