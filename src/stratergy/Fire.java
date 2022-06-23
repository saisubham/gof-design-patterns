package stratergy;

public interface Fire {
    public String fire();
}

class SingleFire implements Fire {

    @Override
    public String fire() {
        return "Single shot fired.";
    }
}

class BurstFire implements Fire {

    @Override
    public String fire() {
        return "Burst shots fired.";
    }
}