package Exercise4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<News> newsList = new ArrayList<>();
        while (true) {
            System.out.println("1 - Insert news\n" +
                    "2 - View list news\n" +
                    "3 - Average rate\n" +
                    "4 - Exit");
            int index = input.nextInt();
            switch (index) {
                case 1:
                    input.nextLine();
                    News news = new News();
//                news.setId(input.nextInt());
                    System.out.print("Input title: ");
                    news.setTitle(input.nextLine());
                    System.out.print("Input publish date: ");
                    news.setPublishDate(input.nextLine());
                    System.out.print("Input author: ");
                    news.setAuthor(input.nextLine());
                    System.out.print("Input content: ");
                    news.setContent(input.nextLine());
                    System.out.print("Input 3 reviews: ");
                    int review1 = input.nextInt();
                    int review2 = input.nextInt();
                    int review3 = input.nextInt();
                    int[] rateList = {review1, review2, review3};
                    news.setRateList(rateList);
                    newsList.add(news);
                    break;
                case 2:
                    newsList.stream().forEach(value -> value.display());
                    break;
                case 3:
                    newsList.stream().forEach(value -> {
                        value.calculate();
                        value.display();
                    });
                    break;
                case 4:
                    System.exit(0);
            }
        }
    }
}
