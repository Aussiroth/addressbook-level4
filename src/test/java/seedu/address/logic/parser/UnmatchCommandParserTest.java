package seedu.address.logic.parser;

import static seedu.address.commons.core.Messages.MESSAGE_INVALID_COMMAND_FORMAT;
import static seedu.address.logic.parser.CommandParserTestUtil.assertParseFailure;
import static seedu.address.logic.parser.CommandParserTestUtil.assertParseSuccess;
import static seedu.address.testutil.TypicalIndexes.INDEX_FIRST_PERSON;

import org.junit.Test;

import seedu.address.logic.commands.UnmatchCommand;

public class UnmatchCommandParserTest {
    private UnmatchCommandParser parser = new UnmatchCommandParser();

    @Test
    public void parse_validArgs_returnsUnmatchCommand() {
        assertParseSuccess(parser, "1", new UnmatchCommand(INDEX_FIRST_PERSON));
    }

    @Test
    public void parse_invalidArgs_throwsParseException() {
        assertParseFailure(parser, "a", String.format(MESSAGE_INVALID_COMMAND_FORMAT, UnmatchCommand.MESSAGE_USAGE));
    }
}
