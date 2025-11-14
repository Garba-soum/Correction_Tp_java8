package Traitement;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import Model.Employe;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Employe> employe = new ArrayList<Employe>(); 
		
		
		Employe employe1 = new Employe();
		Employe employe2 = new Employe();
		Employe employe3 = new Employe();
		Employe employe4 = new Employe(); 
		
		
		employe1.Employe(1, "Ib", 20000.0, LocalDate.of(2019, 11, 13));
		employe2.Employe(2, "Mickael", 30000.0, LocalDate.of(2023, 5, 14));
		employe3.Employe(3, "Ulrich", 1000., LocalDate.of(2024, 07, 8));
		employe4.Employe(4, "Mouba", 1500, LocalDate.of(2020, 9, 12));
		
		
		employe.add(employe1);
		employe.add(employe2);
		employe.add(employe3);
		employe.add(employe4); 
		
		
		  System.out.println(employe);
		  
		  List<Employe> res1 = employe.stream()
				  .filter(e -> e.getSalaire() > 3000)
				  .collect(Collectors.toList()); 
		  res1.forEach(System.out :: println);
		 
		
		
		  List<Employe> res2 = employe.stream() 
				  .sorted(Comparator.comparing(Employe :: getDateEmbauche)) 
				  .collect(Collectors.toList()); 
		  res2.forEach(System.out ::println);
		 
		
		
		  List<String> res3 = employe.stream() 
				  .map(Employe :: getNom)
				  .collect(Collectors.toList()); 
		  res3.forEach(System.out :: println);
		 
		
		Employe res4 = employe.stream()
				.max(Comparator.comparing(Employe :: getSalaire))
				.get();
		System.out.println(res4);
		
		
	}

}
