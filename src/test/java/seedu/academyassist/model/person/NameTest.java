package seedu.academyassist.model.person;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static seedu.academyassist.testutil.Assert.assertThrows;

import org.junit.jupiter.api.Test;

public class NameTest {

    @Test
    public void constructor_null_throwsNullPointerException() {
        assertThrows(NullPointerException.class, () -> new Name(null));
    }

    @Test
    public void constructor_invalidName_throwsIllegalArgumentException() {
        String invalidName = "";
        assertThrows(IllegalArgumentException.class, () -> new Name(invalidName));
    }

    @Test
    public void isValidName() {
        // null name
        assertThrows(NullPointerException.class, () -> Name.isValidName(null));

        // invalid name
        assertFalse(Name.isValidName("")); // empty string
        assertFalse(Name.isValidName(" ")); // spaces only
        assertFalse(Name.isValidName(" peter")); // starting with a space
        assertFalse(Name.isValidName("^")); // only alphabets allowed
        assertFalse(Name.isValidName("peter*")); // contains non-alphabet characters
        assertFalse(Name.isValidName("12345")); // numbers only
        assertFalse(Name.isValidName("peter the 2nd")); // contains numbers characters
        /* 256 characters long */
        assertFalse(Name.isValidName("David Peter ethan evans jacky marty edric roger edwin bryan brian "
                + "David Peter ethan evans jacky marty edric roger edwin bryan brian "
                + "David Peter ethan evans jacky marty edric roger edwin bryan brian "
                + "David Peter ethan evans jacky marty edric roger edwin royy"));

        // valid name
        assertTrue(Name.isValidName("peter jack")); // alphabets only
        assertTrue(Name.isValidName("Capital Tan")); // with capital letters
        assertTrue(Name.isValidName("David Roger Jackson Ray Jr")); // long names
        /* 255 characters long */
        assertTrue(Name.isValidName("David Peter ethan evans jacky marty edric roger edwin bryan brian "
                + "David Peter ethan evans jacky marty edric roger edwin bryan brian "
                + "David Peter ethan evans jacky marty edric roger edwin bryan brian "
                + "David Peter ethan evans jacky marty edric roger edwin roy"));
    }

    @Test
    public void equals() {
        Name name = new Name("Valid Name");

        // same values -> returns true
        assertTrue(name.equals(new Name("Valid Name")));

        // same object -> returns true
        assertTrue(name.equals(name));

        // null -> returns false
        assertFalse(name.equals(null));

        // different types -> returns false
        assertFalse(name.equals(5.0f));

        // different values -> returns false
        assertFalse(name.equals(new Name("Other Valid Name")));
    }
}
