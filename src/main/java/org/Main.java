public class Main {
    public static void main(String[] args) {
        Hero[] heroes = { new Magic(100, 20, "Teleportation"),
                new Medic(120, 15, "Healing", 50),
                new Warrior(150, 25, "Critical Damage") };

        for (Hero hero : heroes) {
            hero.applySuperAbility();
            if (hero instanceof Medic) {
                ((Medic) hero).increaseExperience(); // Увеличение опыта лечения медика
                System.out.println("Опыт лечения увеличен до " + ((Medic) hero).getHealPoints());
            }
        }
    }
}

