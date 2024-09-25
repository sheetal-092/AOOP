package practical2Aweek3Inlab1;

public class Game {
	public static void main(String[] args) {
        GameState gameState = GameState.getInstance();
        
        
        gameState.setLevel("Medium");
        Enemy enemy = EnemyFactory.createEnemy(gameState.getLevel());
        GameFactory factory = new MediumGameFactory();
        Weapon weapon = factory.createWeapon();
        PowerUp powerUp = factory.createPowerUp();
        
        enemy.attack();
        weapon.use();
        powerUp.activate();
        
     
        gameState.setLevel("Hard");
        enemy = EnemyFactory.createEnemy(gameState.getLevel());
        factory = new HardGameFactory();
        weapon = factory.createWeapon();
        powerUp = factory.createPowerUp();

        enemy.attack();
        weapon.use();
        powerUp.activate();
    }
}
