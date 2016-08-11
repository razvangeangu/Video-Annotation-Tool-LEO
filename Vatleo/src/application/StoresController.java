package application;

import java.net.URL;
import java.util.ResourceBundle;

import org.eclipse.emf.ecore.EObject;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.util.Callback;
import kcl.ac.uk.xtext.annotationsStores.AnnotationStores;
import kcl.ac.uk.xtext.annotationsStores.ArgumentStore;
import kcl.ac.uk.xtext.annotationsStores.ChallengeStore;
import kcl.ac.uk.xtext.annotationsStores.CommitmentStore;
import kcl.ac.uk.xtext.annotationsStores.ProposalStore;
import kcl.ac.uk.xtext.annotationsStores.QuestionStore;

public class StoresController implements Initializable {
	
	@FXML private TableView<EObject> tableView;
	@FXML private CheckBox historyCheckBox;
	
	private TableColumn<EObject, String> nameColumn;
	private TableColumn<EObject, String> scopeColumn;
	private TableColumn<EObject, String> senderColumn;
	private TableColumn<EObject, String> focusColumn;
	private TableColumn<EObject, String> contentColumn;
	private TableColumn<EObject, String> targetColumn;
	private TableColumn<EObject, String> effectColumn;
	private AnnotationStores annotationsStore;
	private String tableDescription;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
	}

	public void setAnnotationsStore(AnnotationStores annotationsStore) {
		this.annotationsStore = annotationsStore;
	}
	
	public void setViewActions() {
		historyCheckBox.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
//				if (hasEffects(tableDescription)) {
					if (historyCheckBox.isSelected()) {
						getEffects(tableDescription);
						hightlightEffects();
						tableView.getColumns().add(effectColumn);
					} else {
						tableView.getColumns().remove(effectColumn);
					}
//				}
			}
		});
	}
	
	@SuppressWarnings("unchecked")
	public void setTableViewData(String storeName) {
		
		tableDescription = storeName;
		
		nameColumn = new TableColumn<>("ID");
		scopeColumn = new TableColumn<>("Scope");
		senderColumn = new TableColumn<>("Sender");
		focusColumn = new TableColumn<>("Focus");
		contentColumn = new TableColumn<>("Content");
		targetColumn = new TableColumn<>("Target");
		effectColumn = new TableColumn<>("Affected by");
		
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
		
		setViewActions();
	}
	
	@SuppressWarnings("unchecked")
	public void hightlightEffects() {
//	    effectColumn.setCellFactory(column -> {
//	        return new TableCell<EObject, String>() {
//	            @Override
//	            protected void updateItem(String item, boolean empty) {
//	                super.updateItem(item, empty);
//
//	                setText(empty ? "" : getItem().toString());
//	                setGraphic(null);
//
//					TableRow<EObject> currentRow = getTableRow();
//
//	                if (!isEmpty()) {
//	                    if(item != null || empty) {
//	                    	System.out.println(item);
//	                        currentRow.setStyle("-fx-background-color:lightcoral");
//	                    } else {
//	                        currentRow.setStyle("-fx-background-color:lightgreen");
//	                    }
//	                }
//	            }
//	        };
//	    });
	}
	
	private void getEffects(String storeName) {
			switch (storeName) {
			case "Proposal store": {
				for (ProposalStore element: annotationsStore.getProposalElements()) {
					if (element.getEffect() != null) {
						effectColumn.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<EObject, String>, ObservableValue<String>>() {
						    @Override
						    public ObservableValue<String> call(TableColumn.CellDataFeatures<EObject, String> p) {
						        if (((ProposalStore)p.getValue()).getEffect() != null) {
						            return new SimpleStringProperty(((ProposalStore)p.getValue()).getEffect().getAffectedBy());
						        } else {
						            return new SimpleStringProperty("<no effect>");
						        }
						    }
						});
					}
				}
			break;
			}
			
			case "Question store": {
				for (QuestionStore element: annotationsStore.getQuestionElements()) {
					if (element.getEffect() != null) {
						effectColumn.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<EObject, String>, ObservableValue<String>>() {
						    @Override
						    public ObservableValue<String> call(TableColumn.CellDataFeatures<EObject, String> p) {
						        if (((QuestionStore)p.getValue()).getEffect() != null) {
						            return new SimpleStringProperty(((QuestionStore)p.getValue()).getEffect().getAffectedBy());
						        } else {
						            return new SimpleStringProperty("<no effect>");
						        }
						    }
						});
					}
				}
			break;
			}
			
			case "Challenge store": {
				for (ChallengeStore element: annotationsStore.getChallengeElements()) {
					if (element.getEffect() != null) {
						effectColumn.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<EObject, String>, ObservableValue<String>>() {
						    @Override
						    public ObservableValue<String> call(TableColumn.CellDataFeatures<EObject, String> p) {
						        if (((ChallengeStore)p.getValue()).getEffect() != null) {
						            return new SimpleStringProperty(((ChallengeStore)p.getValue()).getEffect().getAffectedBy());
						        } else {
						            return new SimpleStringProperty("<no effect>");
						        }
						    }
						});
					}
				}
			break;
			}
			
			case "Commitment store": {
				for (CommitmentStore element: annotationsStore.getCommitmentElements()) {
					if (element.getEffect() != null) {
						effectColumn.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<EObject, String>, ObservableValue<String>>() {
						    @Override
						    public ObservableValue<String> call(TableColumn.CellDataFeatures<EObject, String> p) {
						        if (((CommitmentStore)p.getValue()).getEffect() != null) {
						            return new SimpleStringProperty(((CommitmentStore)p.getValue()).getEffect().getAffectedBy());
						        } else {
						            return new SimpleStringProperty("<no effect>");
						        }
						    }
						});
					}
				}
			break;
			}
			
			case "Argument store": {
				for (ArgumentStore element: annotationsStore.getArgumentElements()) {
					if (element.getEffect() != null) {
						effectColumn.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<EObject, String>, ObservableValue<String>>() {
						    @Override
						    public ObservableValue<String> call(TableColumn.CellDataFeatures<EObject, String> p) {
						        if (((ArgumentStore)p.getValue()).getEffect() != null) {
						            return new SimpleStringProperty(((ArgumentStore)p.getValue()).getEffect().getAffectedBy());
						        } else {
						            return new SimpleStringProperty("<no effect>");
						        }
						    }
						});
					}
				}
			break;
			}
		}
	}
}