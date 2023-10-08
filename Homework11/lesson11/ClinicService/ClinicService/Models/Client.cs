namespace ClinicService.Models
{

    public class Client
    {
        public Client() {}

        public Client(Document document, SurName surName, FirstName firstName, Patronymic patronymic) {
            this.Document = document;
            this.SurName = surName;
            this.FirstName = firstName;
            this.Patronymic = patronymic;
        }
    
        public int ClientId { get; set; }

        public string Document { get; set; }


        public string SurName { get; set; }


        public string FirstName { get; set; }

        public string? Patronymic { get; set; }

        public DateTime Birthday { get; set; }
    }
}
