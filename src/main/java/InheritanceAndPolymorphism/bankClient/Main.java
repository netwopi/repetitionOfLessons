package InheritanceAndPolymorphism.bankClient;

public class Main {
    public static void main(String[] args) {
        Individual individual = new Individual(1000,50);
        System.out.println(individual.cashWithdrawal());
        System.out.println(individual.replenishmentСash());
        System.out.println(individual.getCheckMoney());
        EgalEntities egalEntities = new EgalEntities(1000 , 50);
        System.out.println(egalEntities.cashWithdrawal());
        IndividualEntrepreneur individualEntrepreneur = new IndividualEntrepreneur(1000 , 50 );
        System.out.println(individualEntrepreneur.replenishmentСash());
        IndividualEntrepreneur individualEntrepreneur1 = new IndividualEntrepreneur(1000 , 5000 );
        System.out.println(individualEntrepreneur1.replenishmentСash());
    }
}
