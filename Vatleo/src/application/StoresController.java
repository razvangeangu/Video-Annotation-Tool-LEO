package application;

import java.net.URL;
import java.util.ResourceBundle;

import org.eclipse.emf.ecore.EObject;

import javafx.beans.property.SimpleStringProperty;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import kcl.ac.uk.xtext.annotationsStores.AnnotationStores;
import kcl.ac.uk.xtext.annotationsStores.ArgumentStore;
import kcl.ac.uk.xtext.annotationsStores.ChallengeStore;
import kcl.ac.uk.xtext.annotationsStores.CommitmentStore;
import kcl.ac.uk.xtext.annotationsStores.ProposalStore;
import kcl.ac.uk.xtext.annotationsStores.QuestionStore;

public class StoresController implements Initializable {
	
	@FXML private TableView<EObject> tableView;
	@FXML private CheckBox historyCheckBox;
	
	private AnnotationStores annotationsStore;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		//
	}

	public void setAnnotationsStore(AnnotationStores annotationsStore) {
		this.annotationsStore = annotationsStore;
	}
	
	@SuppressWarnings("unchecked")
	public void setTableViewData(String storeName) {
		
		TableColumn<EObject, String> nameColumn = new TableColumn<>("ID");
		TableColumn<EObject, String> scopeColumn = new TableColumn<>("Scope");
		TableColumn<EObject, String> senderColumn = new TableColumn<>("Sender");
		TableColumn<EObject, String> focusColumn = new TableColumn<>("Focus");
		TableColumn<EObject, String> contentColumn = new TableColumn<>("Content");
		TableColumn<EObject, String> targetColumn = new TableColumn<>("Target");
		
		switch (storeName) {
		
			case "Proposal store": {
				tableView.getItems().addAll(annotationsStore.getProposalElements());
				tableView.getColumns().clear();
				
				nameColumn.setCellValueFactory(c-> new SimpleStringProperty(((ProposalStore)c.getValue()).getName()));
				scopeColumn.setCellValueFactory(c-> new SimpleStringProperty(((ProposalStore)c.getValue()).getScope().getScope()));
				focusColumn.setCellValueFactory(c-> new SimpleStringProperty(((ProposalStore)c.getValue()).getFocus().getFocus()));
				contentColumn.setCellValueFactory(c-> new SimpleStringProperty(((ProposalStore)c.getValue()).getContent()));
				
				tableView.getColumns().addAll(nameColumn, scopeColumn, focusColumn, contentColumn);
				break;
			}
			
			case "Question store": {
				tableView.getItems().addAll(annotationsStore.getQuestionElements());
				tableView.getColumns().clear();
				
				nameColumn.setCellValueFactory(c-> new SimpleStringProperty(((QuestionStore)c.getValue()).getName()));
				scopeColumn.setCellValueFactory(c-> new SimpleStringProperty(((QuestionStore)c.getValue()).getScope().getScope()));
				senderColumn.setCellValueFactory(c-> new SimpleStringProperty(((QuestionStore)c.getValue()).getSender()));
				focusColumn.setCellValueFactory(c-> new SimpleStringProperty(((QuestionStore)c.getValue()).getFocus().getFocus()));
				contentColumn.setCellValueFactory(c-> new SimpleStringProperty(((QuestionStore)c.getValue()).getContent()));
				
				tableView.getColumns().addAll(nameColumn, scopeColumn, senderColumn, focusColumn, contentColumn);
				break;
			}
			
			case "Challenge store": {
				tableView.getItems().addAll(annotationsStore.getChallengeElements());
				tableView.getColumns().clear();
				
				nameColumn.setCellValueFactory(c-> new SimpleStringProperty(((ChallengeStore)c.getValue()).getName()));
				senderColumn.setCellValueFactory(c-> new SimpleStringProperty(((ChallengeStore)c.getValue()).getSender()));				
				targetColumn.setCellValueFactory(c-> new SimpleStringProperty(((ChallengeStore)c.getValue()).getTarget()));
				
				tableView.getColumns().addAll(nameColumn, senderColumn, targetColumn);
				break;
			}
			
			case "Commitment store": {
				tableView.getItems().addAll(annotationsStore.getCommitmentElements());
				tableView.getColumns().clear();
				
				nameColumn.setCellValueFactory(c-> new SimpleStringProperty(((CommitmentStore)c.getValue()).getName()));
				scopeColumn.setCellValueFactory(c-> new SimpleStringProperty(((CommitmentStore)c.getValue()).getScope().getScope()));
				focusColumn.setCellValueFactory(c-> new SimpleStringProperty(((CommitmentStore)c.getValue()).getFocus().getFocus()));
				contentColumn.setCellValueFactory(c-> new SimpleStringProperty(((CommitmentStore)c.getValue()).getContent()));
				
				tableView.getColumns().addAll(nameColumn, scopeColumn, focusColumn, contentColumn);
				break;
			}
			
			case "Argument store": {
				tableView.getItems().addAll(annotationsStore.getArgumentElements());
				tableView.getColumns().clear();
				
				nameColumn.setCellValueFactory(c-> new SimpleStringProperty(((ArgumentStore)c.getValue()).getName()));
				scopeColumn.setCellValueFactory(c-> new SimpleStringProperty(((ArgumentStore)c.getValue()).getScope().getScope()));
				focusColumn.setCellValueFactory(c-> new SimpleStringProperty(((ArgumentStore)c.getValue()).getFocus().getFocus()));
				contentColumn.setCellValueFactory(c-> new SimpleStringProperty(((ArgumentStore)c.getValue()).getContent()));
				targetColumn.setCellValueFactory(c-> new SimpleStringProperty(((ArgumentStore)c.getValue()).getTarget()));
				
				tableView.getColumns().addAll(nameColumn, scopeColumn, focusColumn, contentColumn, targetColumn);
				break;
			}
		}
	}
}