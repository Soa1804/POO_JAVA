public class ContactList {
	private Contact[] contacts;
	private int count; 
	
	public ContactList() {
		this.contacts = new Contact[2];
		this.count = 0;
	}
	
	public void add(Contact c) {
		if (count == contacts.length) {
			System.out.println("Capacidade atingida! Criando array com tamanho " + (contacts.length * 2));
			
			Contact[] newArray = new Contact[contacts.length*2];
			
			for (int i = 0; i < contacts.length; i++) {
				newArray[i] = contacts[i];
			}
			this.contacts = newArray;
			System.out.println("Contatos copiados!");
		}
		contacts[count] = c;
		count++;
	} /*Nesse caso, toda vez que a lista de contato atingir a capacidade máxima, ela vai duplicar, sempre aumentando o tamanho do array */
	
	
	public void printAll() {
    System.out.println("📒 Lista de contatos:");
    for (int i = 0; i < count; i++) {
        System.out.printf("-> %s | %s\n", contacts[i].name, contacts[i].phone);
    }
    System.out.println("=================\n");
}

public void showReferences() {
    System.out.println("🔗 Referências dos objetos em memória:");
    for (int i = 0; i < count; i++) {
        System.out.println("Contato " + (i+1) + ": " + contacts[i]);
    }
    System.out.println("=================\n");
}

	// função pra printar todas as referencias da memoria dos contatos
	
	public static void main(String[] args) {
		ContactList List = new ContactList(); 
		
		// adicionando os contatos
		Contact c1 = new Contact("Ana", "1234-0986");
        Contact c2 = new Contact("Beto", "1567-8233");
        Contact c3 = new Contact("Carla", "1782-2289");
        Contact c4 = new Contact("Daniel", "9864-0076");
        Contact c5 = new Contact("Eduarda", "5400-9113");
        
        List.add(c1);
        List.add(c2);
        List.printAll();
        List.showReferences();
        
        List.add(c3);
        List.add(c4);
        System.out.println(List.contacts.length);
        
        List.add(c5);
        System.out.println(List.contacts.length);
        List.printAll();
        List.showReferences();
	}
}