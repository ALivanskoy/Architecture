namespace ClinicDesctop

static class ConsoleView : IView<Client> {

    private ClinicClient clinicClient;
    private ArrayList <Client> clients;

    {
        clinicClient = new ClinicClient("http://localhost:5076/", new HttpClient());
        clients = (ArrayList) clinicClient.ClientGetAllAsync().Result;
    }

    void startApp () {


        bool isContinue = true;

        while (isContinue)
        {
            
            try {
            Console.WriteLine("Главное меню:");
            Console.WriteLine("1. Показать список клиентов");
            Console.WriteLine("2. Добавить клиента");
            Console.WriteLine("3. Удалить клиента");
            Console.WriteLine("0. Выход");
            Console.WriteLine("Ожидается ввод:");
            choose = Convert.ToInt32(Console.ReadLine());

            switch (choose)
            {
                case 1: 
                showAll (this.clients);
                break;
                case 2: 
                addClient ();
                break;
                case 3:
                Console.WriteLine("Введите ID клиента:"); 
                int choose = Convert.ToInt32(Console.ReadLine());
                
                if (deleteClient (clientId)) Console.WriteLine("Клиент удалён"); 
                else Console.WriteLine("Ошибка удаления клиента"); 

                break;
                case 4: 
                isContinue = false;
                break;
                default: 
            }


            } catch {
                Console.WriteLine("Ошибка ввода!");

            }

        }

    }

    private void showAll (ICollection<Client>) {

        foreach (Clinic client : clients) {
            Console.WriteLine("############# "+ client.getClientId+" ##############");
            Console.WriteLine("Client id: "+ client.getClientId);
            Console.WriteLine("Client document: "+ client.getDocument);
            Console.WriteLine("Client SurName: "+ client.getSurName);
            Console.WriteLine("Client FirstName: "+ client.getFirstName);
            Console.WriteLine("Client Patronymic: "+ client.getPatronymic);
            Console.WriteLine("Client Birthday: "+ client.Birthday);
            Console.WriteLine("##############################");
        }

    }
    private void addClient () {

        try
        {
            Console.WriteLine("Добавление клиента:");
            Console.WriteLine("Введите номер документа, удостоверяющего личность:");
            string document = Console.ReadLine();
            Console.WriteLine("Введите фамилию клиента:");
            string surName = Console.ReadLine();
            Console.WriteLine("Введите имя клиента:");
            string firstName = Console.ReadLine();
            Console.WriteLine("Введите отчество клиента:");
            string patronymic = Console.ReadLine();

            clients.Add(new ClinicService.Models.Client(document, surName, firstName, patronymic))
        }
        catch 
        {
            Console.WriteLine("Ошибка ввода!");
        }

    }

    private bool deleteClient (int clientId) {
        foreach (Clinic client : clients) {
            if(client.getClientId == clientId) { clients.Remove(client)
            return true;
            }
        }
        return false;
    }
    
}