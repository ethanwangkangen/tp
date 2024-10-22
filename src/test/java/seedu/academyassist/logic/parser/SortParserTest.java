package seedu.academyassist.logic.parser;

import static seedu.academyassist.logic.Messages.MESSAGE_INVALID_COMMAND_FORMAT;

import static seedu.academyassist.logic.parser.CommandParserTestUtil.assertParseFailure;
import static seedu.academyassist.logic.parser.CommandParserTestUtil.assertParseSuccess;


import org.junit.jupiter.api.Test;


import seedu.academyassist.logic.commands.SortCommand;
import seedu.academyassist.model.sort.SortParam;

public class SortParserTest {

    private static final String MESSAGE_INVALID_FORMAT =
            String.format(MESSAGE_INVALID_COMMAND_FORMAT, SortCommand.MESSAGE_USAGE);

    private SortCommandParser parser = new SortCommandParser();

    @Test
    public void parse_missingField_failure() {
        // no field specified
        assertParseFailure(parser, "", MESSAGE_INVALID_FORMAT);
    }

    @Test
    public void parse_invalidField_failure() {
        // no field specified
        assertParseFailure(parser, "s/invalid", MESSAGE_INVALID_FORMAT);
    }

    @Test
    public void parse_allFieldsSpecified_success() {
        assertParseSuccess(parser, " s/class", new SortCommand(new SortParam("class")));
        assertParseSuccess(parser, " s/class", new SortCommand(new SortParam("class")));
        assertParseSuccess(parser, " s/class", new SortCommand(new SortParam("class")));
    }
}
