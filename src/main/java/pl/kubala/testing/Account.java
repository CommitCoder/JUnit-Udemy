package pl.kubala.testing;

public class Account {

    private boolean isActive;

    public Account() {
        this.isActive = false;
    }

    public void activate(){
        isActive = true;
    }

    public boolean isActive() {
        return isActive;
    }
}
