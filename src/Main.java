public class Main {
    public static void main(String[] args) {
        int ticketPrice = 12758; // Стоимость билета
        int bonus = 20; // Количество рублей для 1 мили
        if (ticketPrice > bonus) {
            System.out.println("Бонусные мили: " + ticketPrice / bonus);
        } else {
            System.out.println("Бонусные мили: 0");
        }
    }
}
