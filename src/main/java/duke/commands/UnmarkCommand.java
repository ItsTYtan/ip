package duke.commands;

import duke.Exceptions.InvalidTaskIndexException;
import duke.Storage;
import duke.TaskList;

public class UnmarkCommand extends Command {
    private int unmarkIdx;

    public UnmarkCommand(int unmarkIdx) {
        this.unmarkIdx = unmarkIdx;
    }

    @Override
    public void execute(TaskList taskList, Storage storage) {
        try {
            taskList.getTask(this.unmarkIdx - 1).unMarkDone();
            System.out.println("OK, I've marked this task as not done yet:");
            System.out.println("\t" + taskList.getTask(this.unmarkIdx - 1));
        } catch (InvalidTaskIndexException ex) {
            System.out.println(ex);
        }
    }
}
