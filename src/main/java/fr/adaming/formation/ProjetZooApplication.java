package fr.adaming.formation;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjetZooApplication implements CommandLineRunner {

//	@Autowired
//	IRoleService roleService;
//	@Autowired
//	IUserService userService;
//	@Autowired
//	ITacheService tacheService;
//	@Autowired
//	IEtatService etatService;
//	@Autowired
//	ISecteurService secteurService;
//	@Autowired
//	IEnclosService enclosService;
//	@Autowired
//	IAnimalService animalService;
//	@Autowired
//	INourritureService nourritureService;

	public static void main(String[] args) {
		SpringApplication.run(ProjetZooApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		// OBJETS TESTS
//		Role r1 = new Role("roleTestmodif");
//		Role r2 = new Role("roleTest2");
//		Etat et1 = new Etat("etatTest1modif");
//		Etat et2 = new Etat("etatTest2");
//		Secteur s1 = new Secteur("secteurTest1modif");
//		Secteur s2 = new Secteur("secteurTest2");
//		User u1 = new User("TOTOmodif", "toto", "test", "test", "test", r1, s1);
//		User u2 = new User("TITI", "titi", "test", "test", "test", r2, s2);
//		Tache t1 = new Tache("test1modif", 2, null, "test", u1, et1);
//		Tache t2 = new Tache("test2", 4, null, "test", u2, et2);
//		Nourriture n1 = new Nourriture("test1modif", 20.55);
//		Nourriture n2 = new Nourriture("test2", 40.68);
//		Enclos en1 = new Enclos(10, "test1modif", s1);
//		Enclos en2 = new Enclos(5, "test2", s2);
//		Animal a1 = new Animal("test1modif", "test", 15, en1, n1);
//		Animal a2 = new Animal("test2", "test", 20, en2, n2);

		// AJOUT => OK
//		roleService.saveRole(r1);
//		roleService.saveRole(r2);
//		etatService.saveEtat(et1);
//		etatService.saveEtat(et2);
//		secteurService.saveSecteur(s1);
//		secteurService.saveSecteur(s2);
//		userService.saveUser(u1);
//		userService.saveUser(u2);
//		tacheService.saveTache(t1);
//		tacheService.saveTache(t2);
//		nourritureService.saveNourriture(n1);
//		nourritureService.saveNourriture(n2);
//		enclosService.saveEnclos(en1);
//		enclosService.saveEnclos(en2);
//		animalService.saveAnimal(a1);
//		animalService.saveAnimal(a2);

		// GET ONE => OK
//		System.err.println(roleService.getOneRole(1));
//		System.err.println(etatService.getOneEtat(1));
//		System.err.println(secteurService.getOneSecteur(1));
//		System.err.println(userService.getOneUser(1));
//		System.err.println(tacheService.getOneTache(1));
//		System.err.println(nourritureService.getOneNourriture(1));
//		System.err.println(enclosService.getOneEnclos(1));
//		System.err.println(animalService.getOneAnimal(1));

		// GET ALL => OK
//		System.err.println(roleService.getAllRole());
//		System.err.println(etatService.getAllEtat());
//		System.err.println(secteurService.getAllSecteur());
//		System.err.println(userService.getAllUser());
//		System.err.println(tacheService.getAllTache());
//		System.err.println(nourritureService.getAllNourriture());
//		System.err.println(enclosService.getAllEnclos());
//		System.err.println(animalService.getAllAnimal());

		// UPDATE => OK (sur role)
//		Role roletest = new Role();
//		roletest = roleService.getOneRole(1);
//		roletest.setLibelleRole("modification");
//		roleService.updateRole(roletest);

		// DELETE => OK
//		animalService.deleteAnimal(1);
//		enclosService.deleteEnclos(1);
//		nourritureService.deleteNourriture(1);
//		tacheService.deleteTache(1);
//		userService.deleteUser(1);
//		secteurService.deleteSecteur(1);
//		etatService.deleteEtat(1);
//		roleService.deleteRole(1);

	}

}