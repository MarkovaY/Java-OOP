package Lab.SOLID.DependencyInversion.Worker;

public class Manager {

    public Manager() {
        Worker worker = new Worker();
        worker.work();
    }
}
