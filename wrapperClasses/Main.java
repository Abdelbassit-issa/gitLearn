import g.GuessingGame;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

<<<<<<< HEAD
    public interface B {
        String run(String r);

    }
=======
  // public interface B {
  // String run(String r);

  // }
>>>>>>> new-wrappewr-classes

  public static void main(final String[] args) {

<<<<<<< HEAD
System.out.println(file.exists());
        B b = (s) -> s + "!";
        stingFormat("Hello", b);
        // GuessingGame g = new GuessingGame();
        // g.playGame();
    }

    public static void stingFormat(String val, B b) {
        String result = b.run(val);
        System.out.println(result);
    }
=======
    try {

      final FileWriter myWriter = new FileWriter("../detailed outline.for.a.horror.store.txt.txt");
      myWriter.write(
          """
                            Setting:  Cur rickety antique shop called "The Whispering Attic" on the outskirts of a forgotten town. Dust motes dance in the faint sunlight filtering through grime-coated windows. An unsettling silence hangs heavy in the air.

              Main Character:  Elena, a young woman drawn to the shop by an irresistible pull, despite an aura of unease. She's searching for a specific antique (you choose the object).

              Progression (First 400 Lines):

              Entrance: Elena pushes open the creaking door, a cold gust of stale air swirling around her. The shop is a labyrinth of cluttered aisles, shrouded in shadows. An assortment of unsettling objects line the shelves: a cracked porcelain doll with vacant eyes, a tarnished silver locket whispering faint lullabies.
              The Shopkeeper: A hunched figure emerges from the back, shrouded in darkness. Their face is obscured by shadows, voice raspy and ancient. The shopkeeper seems unnervingly familiar with Elena's specific object, offering cryptic hints about its location deep within the store.
              Exploration: Elena delves deeper, the air growing colder with each step. Strange whispers seem to emanate from the objects, urging her closer. As she searches, she stumbles upon hidden diaries detailing tragic events linked to specific antiques. These hint at a dark past and curses associated with the items.
              The Object Found: Finally, Elena locates her desired antique (replace with your chosen object). But an unsettling realization dawns - the object appears older, more worn than described. A sense of dread creeps in.
              Shifting Reality: As she reaches for the object, the shop seems to distort. Walls shift, shadows lengthen, and whispers intensify. Elena feels an unseen presence draw closer.
              Climax and Resolution (Next 300 Lines):

              The Shopkeeper's Motive: The shopkeeper's true form is revealed - a malevolent entity bound to the store, feeding on the despair of those lured by cursed objects. The object Elena seeks is the key to breaking free.
              The Choice: Elena has a choice: relinquish the object or unleash the entity on the world. Diaries reveal past victims made similar choices, leading to their demise.
              Desperate Struggle: If Elena chooses to keep the object, a physical and psychological struggle ensues. The entity attacks with chilling visions and spectral tendrils.
              Hidden Power: Elena discovers an inscription on the object, revealing its power to trap malevolent spirits. Gathering her courage, she uses the object to confront the entity.
              Ending (Final 300 Lines):

              Two Possible Endings:
              Good Ending (200 Lines):
              Elena successfully traps the entity within the object, restoring peace to the shop. The air warms, whispers fade, and the shop seems less menacing. Elena escapes, forever changed by the experience.
              Bad Ending (100 Lines):
              Overwhelmed by the entity's power, Elena succumbs. The shop engulfs her, and her screams echo through the night. The entity breaks free, ready to unleash its darkness upon the world.
              Final Scene: The story ends with a chilling image – Elena's chosen object, now adorned with a faint, malicious glint, displayed prominently on a shelf in "The Whispering Attic."
              Horror Elements:

              Unease and Dread: Build an atmosphere of apprehension from the start, with unsettling details and foreshadowing.
              The Supernatural: Introduce the malevolent entity and its connection to the cursed objects for a constant sense of threat.
              Psychological Horror: Focus on Elena's internal struggle, the fear of the unknown, and the desperation of her situation.
              Ambiguous Ending: Leave the reader questioning the true outcome, adding a layer of lingering dread.
              Remember:

              Replace "your chosen object" in the outline with a specific antique that aligns with your desired horror theme.
              Flesh out the details and character motivations to create a truly captivating horror story.
              Utilize vivid descriptions and a suspenseful writing style to evoke fear and a sense of unease in the reader.
              This outline provides a framework for a 1000-line horror story.  Remember, the details and execution are what make a horror story truly terrifying.
                                        """);
      myWriter.close();

    } catch (final IOException e) {

      e.printStackTrace();
    }

    // B b = (s) -> s + "!";
    // stingFormat("Hello", b);
    // GuessingGame g = new GuessingGame();
    // g.playGame();
  }

  // public static void stingFormat(String val, B b) {
  // String result = b.run(val);
  // System.out.println(result);
  // }
>>>>>>> new-wrappewr-classes
}
