package stratergy;

public class MachineGun extends Gun {
    public MachineGun() {
        setFireType(new BurstFire());
    }
}
