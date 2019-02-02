package terrails.statskeeper.api.capabilities;

public interface IHealth {

    boolean isHealthEnabled();
    void setHealthEnabled(boolean val);

    boolean hasAdditionalHealth();

    void setAdditionalHealth(int health);
    int getAdditionalHealth();

    int getMaxHealth();
    void setMaxHealth(int health);

    int getMinHealth();
    void setMinHealth(int health);

}
