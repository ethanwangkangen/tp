package seedu.academyassist.testutil;

import static seedu.academyassist.logic.commands.CommandTestUtil.VALID_ADDRESS_AMY;
import static seedu.academyassist.logic.commands.CommandTestUtil.VALID_ADDRESS_BOB;
import static seedu.academyassist.logic.commands.CommandTestUtil.VALID_EMAIL_AMY;
import static seedu.academyassist.logic.commands.CommandTestUtil.VALID_EMAIL_BOB;
import static seedu.academyassist.logic.commands.CommandTestUtil.VALID_IC_ALICE;
import static seedu.academyassist.logic.commands.CommandTestUtil.VALID_NAME_AMY;
import static seedu.academyassist.logic.commands.CommandTestUtil.VALID_NAME_BOB;
import static seedu.academyassist.logic.commands.CommandTestUtil.VALID_PHONE_AMY;
import static seedu.academyassist.logic.commands.CommandTestUtil.VALID_PHONE_BOB;
import static seedu.academyassist.logic.commands.CommandTestUtil.VALID_TAG_FRIEND;
import static seedu.academyassist.logic.commands.CommandTestUtil.VALID_TAG_HUSBAND;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import seedu.academyassist.model.AcademyAssist;
import seedu.academyassist.model.person.Person;

/**
 * A utility class containing a list of {@code Person} objects to be used in tests.
 */
public class TypicalPersons {

    public static final Person ALICE = new PersonBuilder().withName("Alice Pauline")
            .withAddress("123, Jurong West Ave 6, #08-111").withEmail("alice@example.com")
            .withPhone("94351253").withIc(VALID_IC_ALICE).withSubjects("English").withTags("friends").build();
    public static final Person BENSON = new PersonBuilder().withName("Benson Meier")
            .withAddress("311, Clementi Ave 2, #02-25").withSubjects("Maths").withEmail("johnd@example.com")
            .withPhone("98765432").withIc("F1264567X").withTags("owesMoney", "friends").build();
    public static final Person CARL = new PersonBuilder().withName("Carl Kurz").withPhone("95352563")
            .withEmail("heinz@example.com").withAddress("wall street").withIc("F1254567X")
            .withSubjects("Science").build();
    public static final Person DANIEL = new PersonBuilder().withName("Daniel Meier").withPhone("87652533")
            .withEmail("cornelia@example.com").withAddress("10th street").withIc("F1234569X")
            .withTags("friends").withSubjects("English").build();
    public static final Person ELLE = new PersonBuilder().withName("Elle Meyer").withPhone("9482224")
            .withEmail("werner@example.com").withAddress("michegan ave").withIc("F2238567X").withSubjects("English")
            .build();
    public static final Person FIONA = new PersonBuilder().withName("Fiona Kunz").withPhone("9482427")
            .withEmail("lydia@example.com").withAddress("little tokyo").withIc("F1334567X").withSubjects("English")
            .build();
    public static final Person GEORGE = new PersonBuilder().withName("George Best").withPhone("9482442")
            .withEmail("anna@example.com").withAddress("4th street").withIc("F1294667X").withSubjects("Science")
            .build();

    // Manually added
    public static final Person HOON = new PersonBuilder().withName("Hoon Meier").withPhone("8482424")
            .withEmail("stefan@example.com").withAddress("little india").withIc("F1236667X").withSubjects("English")
            .build();
    public static final Person IDA = new PersonBuilder().withName("Ida Mueller").withPhone("8482131")
            .withEmail("hans@example.com").withAddress("chicago ave").withIc("F1888567X").withSubjects("Science")
            .build();

    // Manually added - Person's details found in {@code CommandTestUtil}
    public static final Person AMY = new PersonBuilder().withName(VALID_NAME_AMY).withPhone(VALID_PHONE_AMY)
            .withEmail(VALID_EMAIL_AMY).withAddress(VALID_ADDRESS_AMY).withTags(VALID_TAG_FRIEND).build();
    public static final Person BOB = new PersonBuilder().withName(VALID_NAME_BOB).withPhone(VALID_PHONE_BOB)
            .withEmail(VALID_EMAIL_BOB).withAddress(VALID_ADDRESS_BOB).withTags(VALID_TAG_HUSBAND, VALID_TAG_FRIEND)
            .build();

    public static final String KEYWORD_MATCHING_MEIER = "Meier"; // A keyword that matches MEIER

    private TypicalPersons() {} // prevents instantiation

    /**
     * Returns an {@code AcademyAssist} with all the typical persons.
     */
    public static AcademyAssist getTypicalAcademyAssist() {
        AcademyAssist ab = new AcademyAssist();
        for (Person person : getTypicalPersons()) {
            ab.addPerson(person);
        }
        return ab;
    }

    public static List<Person> getTypicalPersons() {
        return new ArrayList<>(Arrays.asList(ALICE, BENSON, CARL, DANIEL, ELLE, FIONA, GEORGE));
    }
}