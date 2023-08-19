public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHp(100);
        boss.setDamage(10);
        Weapon weapon=new Weapon(WeaponType.HEAVY_WEAPON,   "Hammer");
        boss.setWeapon(weapon);
        System.out.println("Boss Health: " + boss.getHp());
        System.out.println("Boss Damage: " + boss.getDamage());
        System.out.println("Boss Weapon Type: " + boss.getWeapon().getWeaponType());
        System.out.println("Boss Weapon Name: " + boss.getWeapon().getWeaponName());
    }
}