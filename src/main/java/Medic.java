class Medic extends Hero{
    private int healPoints;
    public Medic(int health, int damage, String superAbility, int healPoints){
        super(health, damage, superAbility);
        this.healPoints = healPoints;
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Medic применил суперспособность: " + superAbility);
    }
    public void increaseExperience() {
        healPoints += healPoints * 0.1; //Увеличение на 10%
    }
    public int getHealPoints(){
        return healPoints;
    }
}
