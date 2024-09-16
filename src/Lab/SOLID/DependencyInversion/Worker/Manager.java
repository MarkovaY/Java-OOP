package Lab.SOLID.DependencyInversion.Worker;

public class Manager {

    private Worker worker;

    public Manager(Worker worker) {
        this.worker = worker;
        this.worker.work();
    }
}
