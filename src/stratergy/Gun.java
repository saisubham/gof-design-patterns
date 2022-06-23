package stratergy;

public class Gun {
    private Fire fireType;

    public Gun() {
    }

    public Fire getFireType() {
        return fireType;
    }

    public void setFireType(Fire fireType) {
        this.fireType = fireType;
    }

    public String shoot() {
        return fireType.fire();
    }
}
