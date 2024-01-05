package lessons.lambdas;

import java.util.ArrayList;
import java.util.List;

public class Example2 {

    public static void main(String[] args) {
        List<Client> clients = new ArrayList<>();

        {
            clients.add(new Client("Harry Caster", 15, true));
            clients.add(new Client("Adam Atkinson", 5, true));
            clients.add(new Client("ABobby Robertson", 15, true));
            clients.add(new Client("Liam Ellis Robertson", 10, true));
        }

//        for (Client client: clients) {
//            client.setSum(client.getSum() - 1);  // может быть перебор всех элементов, может быть
//        }
//
//        clients.forEach(client -> client.setSum(client.getSum() - 1));

//Давайте рассчитаем какой у нас баланс у клиентов:
        int pay = clients.stream()
                .filter(client -> client.getSum() > 5)
                .filter(client -> client.isActive)
                .reduce(0, (sum, client) -> sum + client.getSum(), Integer::sum);
        System.out.println(pay);
    }

}
