package politeworker;

public class Worker {

    private String name;
    private boolean active;

    public Worker(String name, boolean active) {
        this.name = name;
        this.active = active;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public synchronized void work(SharedResource sharedResource, Worker otherWorker) {
        while (active) {
            if (sharedResource.getOwner() != this) {
                try {
                    wait(10);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
                continue;
            }
            if(otherWorker.isActive()){
                System.out.println("Other worker:" + getName()+ " " + otherWorker.getName());
                sharedResource.setOwner(otherWorker);
                continue;
            }
            System.out.println(getName() + ": work");
            active =false;
            sharedResource.setOwner(otherWorker);
        }
    }
}
