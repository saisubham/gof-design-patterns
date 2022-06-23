package stratergy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GunTest {

    @Test
    void setFireTypeAndShoot() {
        Gun pistol = new Pistol();
        Gun machineGun = new MachineGun();

        assertNotEquals(pistol.shoot(), machineGun.shoot());

        machineGun.setFireType(new SingleFire());
        
        assertEquals(pistol.shoot(), machineGun.shoot());
    }
}