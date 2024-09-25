package practical2Aweek3Inlab1;

public class GameState {
	private static GameState instance = null;
    private String level;

    private GameState() {
        this.level = "Easy";  
    }

    public static GameState getInstance() {
        if (instance == null) {
            instance = new GameState();
        }
        return instance;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
        System.out.println("Game Level set to: " + level);
    }
}


abstract class Enemy {
    public abstract void attack();
}

class EasyEnemy extends Enemy {
    public void attack() {
        System.out.println("Easy Enemy attacks with low damage.");
    }
}

class MediumEnemy extends Enemy {
    public void attack() {
        System.out.println("Medium Enemy attacks with moderate damage.");
    }
}

class HardEnemy extends Enemy {
    public void attack() {
        System.out.println("Hard Enemy attacks with high damage.");
    }
}

class EnemyFactory {
    public static Enemy createEnemy(String level) {
        switch (level) {
            case "Easy":
                return new EasyEnemy();
            case "Medium":
                return new MediumEnemy();
            case "Hard":
                return new HardEnemy();
            default:
                return new EasyEnemy();
        }
    }
}


interface GameFactory {
    Weapon createWeapon();
    PowerUp createPowerUp();
}

class EasyGameFactory implements GameFactory {
    public Weapon createWeapon() {
        return new WeakWeapon();
    }

    public PowerUp createPowerUp() {
        return new SmallPowerUp();
    }
}

class MediumGameFactory implements GameFactory {
    public Weapon createWeapon() {
        return new MediumWeapon();
    }

    public PowerUp createPowerUp() {
        return new MediumPowerUp();
    }
}

class HardGameFactory implements GameFactory {
    public Weapon createWeapon() {
        return new StrongWeapon();
    }

    public PowerUp createPowerUp() {
        return new LargePowerUp();
    }
}


interface Weapon {
    void use();
}

interface PowerUp {
    void activate();
}

class WeakWeapon implements Weapon {
    public void use() {
        System.out.println("Using Weak Weapon with low power.");
    }
}

class MediumWeapon implements Weapon {
    public void use() {
        System.out.println("Using Medium Weapon with moderate power.");
    }
}

class StrongWeapon implements Weapon {
    public void use() {
        System.out.println("Using Strong Weapon with high power.");
    }
}

class SmallPowerUp implements PowerUp {
    public void activate() {
        System.out.println("Activating Small Power-Up with small boost.");
    }
}

class MediumPowerUp implements PowerUp {
    public void activate() {
        System.out.println("Activating Medium Power-Up with moderate boost.");
    }
}

class LargePowerUp implements PowerUp {
    public void activate() {
        System.out.println("Activating Large Power-Up with big boost.");
    }
}
