
/**
 * Class containing constant String literals utilized throughout game
 * 
 * @author Tien Tran
 * @version 12/4/2014
 *
 */
public class Descriptions 
{
	
	//start of game
	
	public static final String STARTOFGAME = "Hello Adventurer! Welcome to 'The Truman Game' " +
			"In this game you will explore Truman State, gather knowledge, and hopefully graduate. \n" +
			"However that will not be an easy task.  To graduate you must acquire enough knowledge and key Items. \n" +
			"Along the way you will encounter monsters who will ask you questions, and assist you. \n" +
			"if at any point you believe you have acquired enough key items and knowledge to graduate type 'graduate'" +
			"if you are ever unsure what to do just enter the word 'help'.  \n" +
			" When you are ready to begin playing type 'begin' ";
	
	
	public static final String QUADDESCRIPTION = "a wide open field.";
	public static final String QUADNAME = " the Quad";
	public static final String UPONENTER = " You are in";
	public static final String BLANKBUFFER = "                               ";
	 
	
	
	/*Command String
	 */
	public static final String HELP = "help";
	public static final String ENTERLOCATIONCOMMAND = "enter";
	public static final String TALKCOMMAND = "talk to";
	public static final String EXAMINECOMMAND = "examine";
	public static final String EXIT = "exit";
	public static final String OBSERVE = "observe surroundings";
	public static final String INVENTORY ="inventory";
	public static final String GRADUATE = "graduate";
	
	/*Command string helpers*/
	public static final String MISUNDERSTOODCOMMAND = "I'm sorry I don't understand what you are trying to do please try again";
	public static final String KEYITEMSOWNED = " key Items = ";
	public static final String QUESTITEMSOWNED = " quest Items = ";
	public static final String KNOWLEDGEOWNED = " Knowledge = ";
	public static final String GRADUATEACCEPTED = "Congratulations you have graduated Truman.  You Win!";
	public static final String GRADUATEDENIED = " Oh you haven't quite learned enough yet. Maybe next semester";
	/* Basic interface Strings
	 */
	
	public static final String 	ITEMINSTRUCTIONS = "If you would like to examine an item type \n" +
			"'examine <insert item>'";
	
	public static final String  MONSTERINSTRUCTIONS ="if you would like to talk to a monster type \n" +
	"'talk to <insert monster>'";
	
	public static final String 	LOCATIONINSTRUCTIONS ="if you would like to enter a door type \n" +
	"'enter <insert room>'";
	public static final String EXITINSTRUCTIONS = "To leave this location \n type 'exit'";
	public static final String OBSERVEINSTRUCTIONS= "To observe your surroundings \n" +
			"type 'observe surroundings' ";
	public static final String INVENTORYINSTRUCTIONS = "To observe your inventory \n " +
			"type'inventory'";
	
	public static final String GRADUATEINSTRUCTION = " if you think you are ready to graduate \n" +
			"type 'graduate";
			
	
	public static final String 	PICKUPQUESTION1 = " would you like to pick up ";
	public static final String 	PICKUPQUESTION2 = "?  [answer 'yes' or 'no']";
	
	public static final String MONSTERSINSIDE = " contains the following Monsters";
	public static final String ITEMSINSIDE = " contains the following Items";
	public static final String LOCATIONSINSIDE = " contains doors to the follow";

	public static final String RESTRICTEDENTRY = " Sorry. you cannot enter this room without first finding";
 
	
	
	/* Buildings' names */
	public static final String MAGRUDER_NAME = " Magruder";
	public static final String VIOLETTE_NAME = " Violette";
	public static final String MCCLAIN_NAME = " McClain";
	public static final String LIBRARY_NAME = " Library";
	
	/* Buildings' descriptions */
	public static final String MAGRUDER_DESC = " A huge building with lots of lab for Chemistry and Physics";
	public static final String VIOLETTE_DESC = " Well-known for being the place of Math, CS, and Bussiness majors";
	public static final String MCCLAIN_DESC = " The building where you pay your tution fee";
	public static final String LIBRARY_DESC = " A building full of bookworms";
	
	/* Rooms' names */
	public static final String MAG1_NAME = " Reptile Room";
	public static final String MAG2_NAME = " Magruder Class Room";
	public static final String MCC1_NAME = " Cashier Room";
	public static final String MCC2_NAME = " Registrar";
	public static final String VIO1_NAME = " Violette Room 1";
	public static final String VIO2_NAME = " Violette Room 2";
	public static final String LIB1_NAME = " Upstairs";
	public static final String LIB2_NAME = " Library Room 2";
	
	/* Rooms' descriptions */
	public static final String MAG1_DESC = " A room with strange smell of animals";
	public static final String MAG2_DESC = " A room full of rats";
	public static final String MCC1_DESC = " The Cashier room";
	public static final String MCC2_DESC = " On the floor inside the room is a carpet made of 10-dollar bills";
	public static final String VIO1_DESC = " This room has all of its walls made from Gummybear";
	public static final String VIO2_DESC = " People stand inside this room will forget what they were doing after each 1 minute";
	public static final String LIB1_DESC = " The room is entirely made of  transparent glass, you can see everything outside of this room";
	public static final String LIB2_DESC = " The carpet on the floor is made from natural grass with a smell of blood";
	
	/* Portable Items' names */
	public static final String LAPTOP_NAME =" Laptop";
	public static final String BACKPACK_NAME = " Backpack";
	public static final String PEN_NAME = " Pen";
	public static final String PENCIL_NAME = " Pencil";
	public static final String POKEBALL_NAME =" Pokeball";
	public static final String CLOCK_NAME = " Clock";
	public static final String FRISBEE_NAME = " Frisbee";
	public static final String IPHONE_NAME = " iPhone";
	public static final String DRUMSTICK_NAME = " Drum Stick";
	public static final String TABLET_NAME = " Tablet";
	public static final String COOKIE_NAME = " Cookie";
	public static final String ERASER_NAME = " Eraser";
	public static final String HIGHLIGHTER_NAME = " Highlighter";
	public static final String SCISSORS_NAME = " Scissors";
	public static final String KEYBOARD_NAME = " Keyboard";
	public static final String KNIFE_NAME = " Knife";
	public static final String SOCKS_NAME = " Socks";
	public static final String PS4_NAME = " PS4";
	public static final String COFFEE_NAME = " Coffee";
	public static final String SNAKE_NAME = " Snake";
	public static final String WATERBOTTLE_NAME = " Water Bottle";
	
	/* Key Items' names */
	public static final String USB_NAME = " USB";
	public static final String CHARGER_NAME = " Charger";
	public static final String TEXTBOOK_NAME = " Textbook";
	public static final String CD_NAME = " CD";
	public static final String HARDRIVE_NAME = " Hardrive";
	
	/* Quest Items' names */
	public static final String MAGICKEY_NAME = " Magic Key";
	public static final String SPELLBOOK_NAME = " Spell Book";
	
	/* Fixed Items' names */
	public static final String COUCH_NAME = " Couch";
	public static final String CHAIR_NAME = " Chair";
	public static final String BOOKSHELF_NAME = " Bookshelf";
	public static final String DRESSER_NAME = " Dresser";
	public static final String CEILINGFAN_NAME = " Ceiling Fan";
	public static final String HEATER_NAME = " Heater";
	public static final String AIRCON_NAME = " Air-Conditioning";
	public static final String HIPPO_NAME = " Hippo";
	public static final String CAULDRON_NAME = " Cauldron";
	public static final String ELEPHANT_NAME = " Elephant";
	public static final String MIRROR_NAME = " Mirror";
	public static final String ANVIL_NAME = " Anvil";
	public static final String STAIN_NAME = " Mysterious Stain";
	
	
	/* Portable Items' descriptions */
	public static final String LAPTOP_DESC = " A great device for homework. and other recreational activities...";
	public static final String BACKPACK_DESC = " A very sturdy backpack made of military-grade material";
	public static final String PEN_DESC = " This is not an ordinary pen. It can produce a laser beam strong enough to cut through glass";
	public static final String PENCIL_DESC = " This pencil always stay sharp as new, there is no need to sharpen it";
	public static final String POKEBALL_DESC =" If you want to catch Pokemon, this is what you're looking for";
	public static final String CLOCK_DESC = " A strange rectangular clock";
	public static final String FRISBEE_DESC = " A normal Frisbee with the Truman bulldog logo";
	public static final String IPHONE_DESC = " An iPhone 5S without the home button";
	public static final String DRUMSTICK_DESC = " Drum Stick made up Oreo";
	public static final String TABLET_DESC = " A ordinary tablet that will explode if one enters wrong passcode three times";
	public static final String COOKIE_DESC = " A cookie with lots of chocolate chips";
	public static final String ERASER_DESC = " An eraser with the ability to remove ink";
	public static final String HIGHLIGHTER_DESC = " A rainbow-color highlighter";
	public static final String SCISSORS_DESC = " A pair of scissors that can cut steel wire";
	public static final String KEYBOARD_DESC = " A wireless keyboard with glowing keys. The keyboard seems to control some sort of secret door";
	public static final String KNIFE_DESC = " A normal plastic knife";
	public static final String SOCKS_DESC = " Socks that can be used to kill zombies";
	public static final String PS4_DESC = " The best-selling console in 2014";
	public static final String COFFEE_DESC = " A cup of Americano coffee";
	public static final String SNAKE_DESC = " The famous venomous snake, King Cobra";
	public static final String WATERBOTTLE_DESC = " A bottle filled with purple liquid";
	
	/* Key Items' descriptions */
	public static final String USB_DESC = " A USB with Transformer logo on it";
	public static final String CHARGER_DESC = " A charger made from chocolate";
	public static final String TEXTBOOK_DESC = " A textbook with the title \"How to steal a girl's heart\"";
	public static final String CD_DESC = " The CD is enclosed inside a colorful envelope";
	public static final String HARDRIVE_DESC = " The hardrive floats inside a transperant plastic tube";
	
	/* Quest Items' descriptions */
	public static final String MAGICKEY_DESC = " A neon glowing key with magic aura around it";
	public static final String SPELLBOOK_DESC = " The spell book will take 2 years of life from those who open it";
	
	/* Fixed Items' descriptions */
	public static final String COUCH_DESC = " A really big couch that at least 6 people can sit on comfortably";
	public static final String CHAIR_DESC = " A talking chair which curse at people who sit on him";
	public static final String BOOKSHELF_DESC = " A bookshelf filled with comic books";
	public static final String DRESSER_DESC = " An ancient dresser made from dragon's bone";
	public static final String CEILINGFAN_DESC = " A ceiling fan that only blows hot air";
	public static final String HEATER_DESC = " A heater with a fixed temperature of 115 degrees";
	public static final String AIRCON_DESC = " an air-conditioner runs only on ice";
	public static final String HIPPO_DESC = " A hippo with his big open mouth waiting to be fed";
	public static final String CAULDRON_DESC = " The cauldron is boiling some kind of love potion";
	public static final String ELEPHANT_DESC = " An strangely white elephant with the size of a dog";
	public static final String MIRROR_DESC = " The mirror will only tell people what they want to hear";
	public static final String ANVIL_DESC = " An anvil made from gummybear";
	public static final String STAIN_DESC = " The mysterious stain can't be removed by any kind of chemical";
	
	
	/* Questions and answers */
	/* */
	public static final String WRONG  = "Oh, so close but not quite";
	public static final String RIGHT = "Thats Correct!" ;
	
	public static final String QUES1_QUESTION = " Which of the following is my hobby?\nA. Drinking\nB. Baking\nC. Clubbing\nD. Freestyle Rapping";
	public static final String QUES1_ANSWER = "B";
	public static final String QUES2_QUESTION = " What does two plus two equal?\nA. 4\nB. (3 + 2) - 1\nC. 4 * 0 + 4\nD. All of the above";
	public static final String QUES2_ANSWER = "D";
	public static final String QUES3_QUESTION = " The 3rd president of the United States is Thomas Jefferson. True or False?";
	public static final String QUES3_ANSWER = "True";
	public static final String QUES4_QUESTION = " How many states are there in the United States?";
	public static final String QUES4_ANSWER = "50";
	public static final String QUES5_QUESTION = " What year was Rush Hour 1 released?";
	public static final String QUES5_ANSWER = "1998";
	
	/* Teachers' names */
	public static final String TEACHER1_NAME = " Dr. Neitzke";
	public static final String TEACHER2_NAME = " Dr. Halma";
	public static final String TEACHER3_NAME = " Dr. Matthews";
	public static final String TEACHER4_NAME = " Dr. Seifert";
	public static final String TEACHER5_NAME = " Jackie Chan";
	
	/* Teachers' dialogues */
	public static final String TEACHER1_DIAL = " Hey, how are you doing?";
	public static final String TEACHER2_DIAL = " Want to hear something cool?";
	public static final String TEACHER3_DIAL = " I know you want something from me!";
	public static final String TEACHER4_DIAL = " Are you ready for a challenge? Here we go.";
	public static final String TEACHER5_DIAL = " The correctness of your answer will decide if you can walk out of here or not";
	
	/* Students' names */
	public static final String STUDENT1_NAME = " Max Highsmith";
	public static final String STUDENT2_NAME = " Tien Tran";
	public static final String STUDENT3_NAME = " Harry Potter";
	
	/* Students' dialogues */
	public static final String STUDENT1_DIAL = " Is your name Alice? Because I thought I was in Wonderland";
	public static final String STUDENT2_DIAL = " I wish you were my integral, so I can be the area under your curve";
	public static final String STUDENT3_DIAL = " Would you like to try my wand?";
	
	/* Animals' names */
	public static final String ANIMAL1_NAME = " Squirrel";
	public static final String ANIMAL2_NAME = " Rat";
	
	/* Animals' noise */
	public static final String ANIMAL1_NOISE = "Hey buddy, want some nuts?";
	public static final String ANIMAL2_NOISE = "whats the wise idea?";
	
	/* Knowledge */
	public static final String KNOWLEDGE_1 = " Object Oriented Strategy";
	public static final String KNOWLEDGE_2 = " Quality Liberal Arts Education";
	public static final String KNOWLEDGE_3 = " The appreciation of hard work";
	public static final String KNOWLEDGE_4 = " business connections";
	public static final String KNOWLEDGE_5 = " love of learning";

}
