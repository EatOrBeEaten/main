package seedu.address.ui;

import javafx.fxml.FXML;

import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Region;
import seedu.address.model.cca.Cca;

/**
 * An UI component that displays information of a {@code Cca}.
 *
 * @author ericyjw
 */
public class CcaCard extends UiPart<Region> {

    private static final String FXML = "CcaListCard.fxml";

    /**
     * Note: Certain keywords such as "location" and "resources" are reserved keywords in JavaFX.
     * As a consequence, UI elements' variable names cannot be set to such keywords
     * or an exception will be thrown by JavaFX during runtime.
     *
     * @see <a href="https://github.com/se-edu/addressbook-level4/issues/336">The issue on AddressBook level 4</a>
     */

    public final Cca cca;

    @FXML
    private HBox cardPane;
    @FXML
    private Label ccaName;
    @FXML
    private Label id;

    public CcaCard(Cca cca, int displayedIndex) {
        super(FXML);
        this.cca = cca;
        id.setText(displayedIndex + ". ");
        ccaName.setText(cca.getCcaName());
    }

//    @Override
//    public boolean equals(Object other) {
//        // short circuit if same object
//        if (other == this) {
//            return true;
//        }
//
//        // instanceof handles nulls
//        if (!(other instanceof CcaCard)) {
//            return false;
//        }
//
//        // state check
//        CcaCard card = (CcaCard) other;
//        return id.getText().equals(card.id.getText())
//            && cca.equals(card.cca);
//    }
}
