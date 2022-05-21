import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import lombok.AllArgsConstructor;
import lombok.Data;

public class First {
	public static void main(String[] args) {
		List<Personne> personnesList = Arrays.asList(
				new Personne("Houssem", "BEN", Arrays.asList("hoos","hoosii"), 140, new Date(), 937483848411L),
				new Personne("Achref", "Lam", Arrays.asList("barred","chroofa"), 150, new Date(), 432229348422L),
				new Personne("Ahmed", "Bat", Arrays.asList("bohmid","batikh"), 160, new Date(), 676933848433L)						
				);
		
		if(personnesList.stream().anyMatch(per -> per.getTaille() > 100))
			System.out.println("YES : Boolean : test if exist");
		
		List<Personne> personLong = personnesList.stream().filter(per -> per.getTaille() >= 150).collect(Collectors.toList());
			
		personLong.forEach(per -> System.out.println(per.getNom()));
	}

	@Data
	@AllArgsConstructor
	public static class Personne {
		String nom;
		String prenom;
		List<String> autresPrenomList;
		Integer taille;
		Date dateNainssance;
		Long numSocial;
	}
}
