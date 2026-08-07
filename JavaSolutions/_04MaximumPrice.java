public class _04MaximumPrice {
    public static void main(String[] args) {
        // String arr[] = {
        // "150:Beauty",
        // "500:Electronics",
        // "200:Sports",
        // "400:Electronics",
        // "100:Beauty",
        // "300:Electronics"
        // };
        // int k = 2;
        // int n = 4;
        String arr[] = { "600:Electronics", "350:Sports", "250:Beauty", "150:Books" };
        int k = 1;
        int n = 3;

        String[] category = new String[arr.length];
        int[] price = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            String[] parts = arr[i].split(":");
            price[i] = Integer.parseInt(parts[0]);
            category[i] = parts[1];
        }

        // sorting on price in descending
        for (int i = 0; i < price.length - 1; i++) {
            for (int j = 0; j < price.length - i - 1; j++) {
                if (price[j] < price[j + 1]) {

                    int tempPrice = price[j];
                    price[j] = price[j + 1];
                    price[j + 1] = tempPrice;

                    String tempCategory = category[j];
                    category[j] = category[j + 1];
                    category[j + 1] = tempCategory;
                }
            }
        }
        int sum = 0;
        int count = 0;
        int i = 0;
        while (i < price.length && count < n) {
            String currentCategory = category[i];
            int taken = 0;
            while (i < price.length && category[i].equals(currentCategory) && taken < k && count < n) {
                sum += price[i];
                i++;
                taken++;
                count++;
            }
            // skip if required amount of category is taken i.e. taken > k
            while (i < price.length && category[i].equals(currentCategory)) {
                i++;
            }
        }
        System.out.println(sum);
    }
}
