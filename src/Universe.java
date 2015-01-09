import java.util.ArrayList;

/**
 * Executable game which contains all objects in the game universe
 * 
 * @author Max Highsmith and Tien Tran
 * @version 12/4
 *
 */
public class Universe 
{
	public static void main (String [] args)
	{
		
		/**
		 * Character
		 */
		Main_Character character = new Main_Character();
		
		/**
		 *   Items
		*/
				
			// non portable items
		Fixed_Item cauldron = new Fixed_Item(Descriptions.CAULDRON_NAME, Descriptions.CAULDRON_DESC);
		Fixed_Item couch = new Fixed_Item(Descriptions.COUCH_NAME, Descriptions.COUCH_DESC);
		Fixed_Item chair = new Fixed_Item(Descriptions.CHAIR_NAME, Descriptions.CHAIR_DESC);
		Fixed_Item bookshelf = new Fixed_Item(Descriptions.BOOKSHELF_NAME, Descriptions.BOOKSHELF_DESC);
		Fixed_Item dresser = new Fixed_Item(Descriptions.DRESSER_NAME, Descriptions.DRESSER_DESC);
		Fixed_Item ceilingFan = new Fixed_Item(Descriptions.CEILINGFAN_NAME, Descriptions.CEILINGFAN_DESC);
		Fixed_Item heater = new Fixed_Item(Descriptions.HEATER_NAME, Descriptions.HEATER_DESC);
		Fixed_Item airConditioner = new Fixed_Item(Descriptions.AIRCON_NAME, Descriptions.AIRCON_DESC);
		Fixed_Item hippo = new Fixed_Item(Descriptions.HIPPO_NAME, Descriptions.HIPPO_DESC);
		Fixed_Item elephant = new Fixed_Item(Descriptions.ELEPHANT_NAME, Descriptions.ELEPHANT_DESC);
		Fixed_Item mirror = new Fixed_Item(Descriptions.MIRROR_NAME, Descriptions.MIRROR_DESC);
		Fixed_Item anvil = new Fixed_Item(Descriptions.ANVIL_NAME, Descriptions.ANVIL_DESC);
		Fixed_Item stain = new Fixed_Item(Descriptions.STAIN_NAME, Descriptions.STAIN_DESC);
		
			// key items
		Key_Item usb = new Key_Item(Descriptions.USB_NAME, Descriptions.USB_DESC);
		Key_Item laptop = new Key_Item(Descriptions.LAPTOP_NAME, Descriptions.LAPTOP_DESC);
		Key_Item charger = new Key_Item(Descriptions.CHARGER_NAME, Descriptions.CHARGER_DESC);
		Key_Item textbook = new Key_Item(Descriptions.TEXTBOOK_NAME, Descriptions.TEXTBOOK_DESC);
		Key_Item cd = new Key_Item(Descriptions.CD_NAME, Descriptions.CD_DESC);
		Key_Item hardrive = new Key_Item(Descriptions.HARDRIVE_NAME, Descriptions.HARDRIVE_DESC);
			
			// quest items
		Quest_Item magicKey = new Quest_Item(Descriptions.MAGICKEY_NAME, Descriptions.MAGICKEY_DESC);
		Quest_Item spellBook = new Quest_Item(Descriptions.SPELLBOOK_NAME, Descriptions.SPELLBOOK_DESC);
		Quest_Item backpack = new Quest_Item(Descriptions.BACKPACK_NAME, Descriptions.BACKPACK_DESC);
		Quest_Item pen = new Quest_Item(Descriptions.PEN_NAME, Descriptions.PEN_DESC);
		Quest_Item pencil = new Quest_Item(Descriptions.PENCIL_NAME, Descriptions.PENCIL_DESC);
		Quest_Item pokeball = new Quest_Item(Descriptions.POKEBALL_NAME, Descriptions.POKEBALL_DESC);
		Quest_Item clock = new Quest_Item(Descriptions.CLOCK_NAME, Descriptions.CLOCK_DESC);
		Quest_Item frisbee = new Quest_Item(Descriptions.FRISBEE_NAME, Descriptions.FRISBEE_DESC);
		Quest_Item iPhone = new Quest_Item(Descriptions.IPHONE_NAME, Descriptions.IPHONE_DESC);
		Quest_Item drumStick = new Quest_Item(Descriptions.DRUMSTICK_NAME, Descriptions.DRUMSTICK_DESC);
		Quest_Item tablet = new Quest_Item(Descriptions.TABLET_NAME, Descriptions.TABLET_DESC);
		Quest_Item cookie = new Quest_Item(Descriptions.COOKIE_NAME, Descriptions.COOKIE_DESC);
		Quest_Item eraser = new Quest_Item(Descriptions.ERASER_NAME, Descriptions.ERASER_DESC);
		Quest_Item highlighter = new Quest_Item(Descriptions.HIGHLIGHTER_NAME, Descriptions.HIGHLIGHTER_DESC);
		Quest_Item scissors = new Quest_Item(Descriptions.SCISSORS_NAME, Descriptions.SCISSORS_DESC);
		Quest_Item keyboard = new Quest_Item(Descriptions.KEYBOARD_NAME, Descriptions.KEYBOARD_DESC);
		Quest_Item knife = new Quest_Item(Descriptions.KNIFE_NAME, Descriptions.KNIFE_DESC);
		Quest_Item socks = new Quest_Item(Descriptions.SOCKS_NAME, Descriptions.SOCKS_DESC);
		Quest_Item ps4 = new Quest_Item(Descriptions.PS4_NAME, Descriptions.PS4_DESC);
		Quest_Item coffee = new Quest_Item(Descriptions.COFFEE_NAME, Descriptions.COFFEE_DESC);
		Quest_Item waterBottle = new Quest_Item(Descriptions.WATERBOTTLE_NAME, Descriptions.WATERBOTTLE_DESC);
		
		/**
		 * Knowledge
		 */
		
		Knowledge knowledge1 = new Knowledge(Descriptions.KNOWLEDGE_1);
		Knowledge knowledge2 = new Knowledge(Descriptions.KNOWLEDGE_2);
		Knowledge knowledge3 = new Knowledge(Descriptions.KNOWLEDGE_3);
		Knowledge knowledge4 = new Knowledge(Descriptions.KNOWLEDGE_4);
		Knowledge knowledge5 = new Knowledge(Descriptions.KNOWLEDGE_5);
			
		
		/**
		 * Questions
		 */
		
		Question question1 = new Question(Descriptions.QUES1_QUESTION, Descriptions.QUES1_ANSWER);
		Question question2 = new Question(Descriptions.QUES2_QUESTION, Descriptions.QUES2_ANSWER);
		Question question3 = new Question(Descriptions.QUES3_QUESTION, Descriptions.QUES3_ANSWER);
		Question question4 = new Question(Descriptions.QUES4_QUESTION, Descriptions.QUES4_ANSWER);
		Question question5 = new Question(Descriptions.QUES5_QUESTION, Descriptions.QUES5_ANSWER);
		
		
		/**
		 * Monsters
		 */
		
			// character arrays
			ArrayList<Holdable> dr_Neitzke_Items = new ArrayList<Holdable>();
			ArrayList<Holdable> dr_Halma_Items = new ArrayList<Holdable>();
			ArrayList<Holdable> dr_Matthews_Items = new ArrayList<Holdable>();
			ArrayList<Holdable> dr_Seifert_Items = new ArrayList<Holdable>();
			ArrayList<Holdable> jackie_Items = new ArrayList<Holdable>();
			
			ArrayList<Holdable> max_Items = new ArrayList<Holdable>();
			ArrayList<Holdable> tien_Items = new ArrayList<Holdable>();
			ArrayList<Holdable> harryPotter_Items = new ArrayList<Holdable>();
			
			// fill character arrays
			dr_Neitzke_Items.add(knowledge1);
			dr_Neitzke_Items.add(laptop);
			dr_Matthews_Items.add(charger);
			dr_Seifert_Items.add(knowledge2);
			dr_Halma_Items.add(textbook);
			dr_Halma_Items.add(knowledge3);
			jackie_Items.add(knowledge4);
			
			max_Items.add(socks);
			tien_Items.add(magicKey);
			harryPotter_Items.add(knowledge5);
			
			// harry add knowledge5
			
			//teachers
		Teacher dr_Neitzke = new Teacher(Descriptions.TEACHER1_NAME, Descriptions.TEACHER1_DIAL, question1, dr_Neitzke_Items);
		Teacher dr_Halma = new Teacher(Descriptions.TEACHER2_NAME, Descriptions.TEACHER2_DIAL, question2, dr_Halma_Items);
		Teacher dr_Matthews = new Teacher(Descriptions.TEACHER3_NAME, Descriptions.TEACHER3_DIAL, question3, dr_Matthews_Items);
		Teacher dr_Seifert = new Teacher(Descriptions.TEACHER4_NAME, Descriptions.TEACHER4_DIAL, question4, dr_Seifert_Items);
		Teacher jackie = new Teacher(Descriptions.TEACHER5_NAME, Descriptions.TEACHER5_DIAL, question5, jackie_Items);
		
			//students
		Student maxHighsmith = new Student(Descriptions.STUDENT1_NAME, Descriptions.STUDENT1_DIAL,max_Items);
		Student tienTran = new Student(Descriptions.STUDENT2_NAME, Descriptions.STUDENT2_DIAL, tien_Items);
		Student harryPotter = new Student(Descriptions.STUDENT3_NAME, Descriptions.STUDENT3_DIAL,harryPotter_Items);
		
			//animal
		Animal squirel = new Animal(Descriptions.ANIMAL1_NAME, Descriptions.ANIMAL1_NOISE);
		Animal snake = new Animal(Descriptions.SNAKE_NAME, Descriptions.SNAKE_DESC);
		Animal rat = new Animal(Descriptions.ANIMAL2_NAME, Descriptions.ANIMAL2_NOISE);
		/**
		 * Locations
		 */
		
			// Monster arrays
		ArrayList<Monster> mgRoom1Monsters = new ArrayList<Monster>();
		ArrayList<Monster> mgRoom2Monsters = new ArrayList<Monster>();
		ArrayList<Monster> mcRoom1Monsters = new ArrayList<Monster>();
		ArrayList<Monster> mcRoom2Monsters = new ArrayList<Monster>();
		ArrayList<Monster> viRoom1Monsters = new ArrayList<Monster>();
		ArrayList<Monster> viRoom2Monsters = new ArrayList<Monster>();
		ArrayList<Monster> liRoom1Monsters = new ArrayList<Monster>();
		ArrayList<Monster> liRoom2Monsters = new ArrayList<Monster>();
		
		ArrayList<Monster> magruderMonsters = new ArrayList<Monster>();
		ArrayList<Monster> mcclainMonsters = new ArrayList<Monster>();
		ArrayList<Monster> violetteMonsters = new ArrayList<Monster>();
		ArrayList<Monster> libraryMonsters = new ArrayList<Monster>();
		ArrayList<Monster> quadMonsters = new ArrayList<Monster>();
		
			// Items arrays
		ArrayList<Item> mgRoom1Items = new ArrayList<Item>();
		ArrayList<Item> mgRoom2Items = new ArrayList<Item>();
		ArrayList<Item> mcRoom1Items = new ArrayList<Item>();
		ArrayList<Item> mcRoom2Items = new ArrayList<Item>();
		ArrayList<Item> viRoom1Items = new ArrayList<Item>();
		ArrayList<Item> viRoom2Items = new ArrayList<Item>();
		ArrayList<Item> liRoom1Items = new ArrayList<Item>();
		ArrayList<Item> liRoom2Items = new ArrayList<Item>();
		
		ArrayList<Item> magruderItems = new ArrayList<Item>();
		ArrayList<Item> mcclainItems = new ArrayList<Item>();
		ArrayList<Item> violetteItems = new ArrayList<Item>();
		ArrayList<Item> libraryItems = new ArrayList<Item>();
		ArrayList<Item> quadItems = new ArrayList<Item>();
		
			//Location arrays
		ArrayList<Location> magruderLocations = new ArrayList<Location>();
		ArrayList<Location> mcclainLocations = new ArrayList<Location>();
		ArrayList<Location> violetteLocations = new ArrayList<Location>();
		ArrayList<Location> libraryLocations = new ArrayList<Location>();
		ArrayList<Location> quadLocations = new ArrayList<Location>();
		
			//rooms
		Room mgRoom1 = new Room(Descriptions.MAG1_NAME, Descriptions.MAG1_DESC, mgRoom1Monsters, mgRoom1Items, null);
		Room mgRoom2 = new Room(Descriptions.MAG2_NAME, Descriptions.MAG2_DESC, mgRoom2Monsters, mgRoom2Items, null);
		Room mcRoom1 = new Room(Descriptions.MCC1_NAME, Descriptions.MCC1_DESC, mcRoom1Monsters, mcRoom1Items, null);
		Room mcRoom2 = new Room(Descriptions.MCC2_NAME, Descriptions.MCC2_DESC, mcRoom2Monsters, mcRoom2Items, null);
		Room viRoom1 = new Room(Descriptions.VIO1_NAME, Descriptions.VIO1_DESC, viRoom1Monsters, viRoom1Items, null);
		Room viRoom2 = new Room(Descriptions.VIO2_NAME, Descriptions.VIO2_DESC, viRoom2Monsters, viRoom2Items, null);
		Room liRoom1 = new Room(Descriptions.LIB1_NAME, Descriptions.LIB1_DESC, liRoom1Monsters, liRoom1Items, null);
		Room liRoom2 = new Room(Descriptions.LIB2_NAME, Descriptions.LIB2_DESC, liRoom2Monsters, liRoom2Items, null);
		
			//buildings
		Location magruder = new Location(Descriptions.MAGRUDER_NAME, Descriptions.MAGRUDER_DESC, magruderMonsters, magruderItems, magruderLocations);
		Location mcclain = new Location(Descriptions.MCCLAIN_NAME, Descriptions.MCCLAIN_DESC, mcclainMonsters, mcclainItems, mcclainLocations);
		Location violette = new Location(Descriptions.VIOLETTE_NAME, Descriptions.VIOLETTE_DESC, violetteMonsters, violetteItems, violetteLocations);
		Location library = new Location(Descriptions.LIBRARY_NAME, Descriptions.LIBRARY_DESC, libraryMonsters, libraryItems, libraryLocations);
			//Quad
		Location quad = new Location(Descriptions.QUADNAME, Descriptions.QUADDESCRIPTION, quadMonsters, quadItems, quadLocations);
		quad.giveWeather();
		
		
		/**Fill arrays */
		
		//fill Monster array
			quadMonsters.add(squirel);
			magruderMonsters.add(dr_Neitzke);
			mgRoom1Monsters.add(jackie);
			mgRoom1Monsters.add(snake);
			mgRoom2Monsters.add(rat);
			mcRoom1Monsters.add(tienTran);
			mcRoom2Monsters.add(dr_Halma);
			violetteMonsters.add(dr_Matthews);
			liRoom1Monsters.add(dr_Seifert);
			libraryMonsters.add(maxHighsmith);
			libraryMonsters.add(harryPotter);
			
		//fill Item arrays
			magruderItems.add(dresser);
			
			mgRoom1Items.add(usb);
			mgRoom1Items.add(cauldron);
			mgRoom1Items.add(backpack);
			mgRoom1Items.add(pen);
			
			mgRoom2Items.add(couch);
			mgRoom2Items.add(pencil);
			mgRoom2Items.add(clock);
			mgRoom2Items.add(frisbee);

			violetteItems.add(tablet);
			
			viRoom1Items.add(chair);
			viRoom1Items.add(ceilingFan);
			viRoom1Items.add(pokeball);
			viRoom1Items.add(iPhone);
			
			viRoom2Items.add(cd);
			viRoom2Items.add(bookshelf);
			viRoom2Items.add(drumStick);
			viRoom2Items.add(cookie);
			
			mcclainItems.add(mirror);
			
			mcRoom1Items.add(stain);
			mcRoom1Items.add(eraser);
			mcRoom1Items.add(highlighter);
			mcRoom1Items.add(scissors);
			
			mcRoom2Items.add(heater);
			mcRoom2Items.add(airConditioner);
			mcRoom2Items.add(keyboard);
			mcRoom2Items.add(knife);
			
			libraryItems.add(elephant);
			
			liRoom1Items.add(hardrive);
			liRoom1Items.add(anvil);
			liRoom1Items.add(ps4);
			
			liRoom2Items.add(hippo);
			liRoom2Items.add(coffee);
			liRoom2Items.add(waterBottle);
			
					
		//fill Location arrays;
			quadLocations.add(magruder);
			quadLocations.add(mcclain);
			quadLocations.add(violette);
			quadLocations.add(library);
			magruderLocations.add(mgRoom1);
			magruderLocations.add(mgRoom2);
			mcclainLocations.add(mcRoom1);
			mcclainLocations.add(mcRoom2);
			violetteLocations.add(viRoom1);
			violetteLocations.add(viRoom2);
			libraryLocations.add(liRoom1);
			libraryLocations.add(liRoom2);
			
		
		//addLocks
			mgRoom1.setEntryRequirement(magicKey);
			
		
		
		//graduation requirement
			ArrayList<Holdable> gradRequirements = new ArrayList<Holdable>();
			gradRequirements.add(knowledge1);
			gradRequirements.add(knowledge2);
			gradRequirements.add(knowledge3);
			gradRequirements.add(knowledge4);
			gradRequirements.add(knowledge5);
			gradRequirements.add(usb);
			gradRequirements.add(laptop);
			gradRequirements.add(charger);
			gradRequirements.add(textbook);
			gradRequirements.add(cd);
			gradRequirements.add(hardrive);
			character.setGraduationRequirement(gradRequirements);
		
		
		character.enterLocation(quad);
		
		character.recieveMessage(Descriptions.STARTOFGAME);
		character.gatherMessage();
		
		while(true)
		{
			character.checkWhereYouAre();
		}
		
		
	}
	
}
