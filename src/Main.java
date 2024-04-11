public class Main {
    public static void main(String[] args) {

        String[] products = {
                "Яблоки, 800 тг, 100",
                "Бананы, 1200 тг, 100",
                "Молоко, 650 тг, 50",
                "Хлеб, 300 тг, 80",
                "Сахар, 2500 тг, 30"
        };
        String longestWord = "";
        String longestPrice = "";
        for (String product : products) {
            String[] elements = product.split(", ");
            String element = elements[0];
            String priceName = elements[1];
            if (element.length() > longestWord.length()) {
                longestWord = element;
            }
            if (priceName.length() > longestPrice.length()) {
                longestPrice = priceName;
            }

        }

        System.out.printf("%-" + longestWord.length() + "s %s     %s\n", "Продукты", "Цена", "Количество");


        int totalAmount = 0;
        int productPrice = 0;
        int productAmount = 0;
        for (String product : products) {
            String[] elements = product.split(", ");
            if (elements.length < 3) {
                continue;
            }
            String productName = elements[0];
            String price = elements[1].replaceAll("[^0-9]", "");
            String amount = elements[2].replaceAll("[^0-9]", "");
            productPrice = Integer.parseInt(price);
            productAmount = Integer.parseInt(amount);
            totalAmount +=productPrice * productAmount;
            System.out.printf("%-" + longestWord.length() + "s   %-" + longestPrice.length() + "s  %s\n", productName, price, amount);
        }
        System.out.printf("         %-" + longestWord.length() + "s  %s", "Итого: ", totalAmount);
    }
}
