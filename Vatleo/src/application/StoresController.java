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
import javafx.scene.control.TableCell;
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

	/**
	 * A setter for the annotationsStore.
	 * @param annotationsStore An annotation store to be set for the local variable.
	 */
	public void setAnnotationsStore(AnnotationStores annotationsStore) {
		this.annotationsStore = annotationsStore;
	}
	
	/**
	 * A method that checks if the store has effects and sets the
	 * text and the actions correctly for the history check box.
	 */
	public void setViewActions() {
		if (!hasEffects(tableDescription)) {
			historyCheckBox.setDisable(true);
			historyCheckBox.setText("Show history (No changes to be shown)");
		} else {
			historyCheckBox.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent event) {
					if (historyCheckBox.isSelected()) {
						getEffects(tableDescription);
						hightlightEffects();
						tableView.getColumns().add(effectColumn);
					} else {
						unhighlightEffects();
						tableView.getColumns().remove(effectColumn);
					}
				}
			});
		}
	}
	
	/**
	 * A method to get the data from the EObjects to
	 * the table view based on the store name.
	 * @param storeName A string that represents the name of the store.
	 */
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
	
	/**
	 * a method to highlight the effects from the table view.
	 */
	public void hightlightEffects() {
	    effectColumn.setCellFactory(column -> {
	        return new TableCell<EObject, String>() {
	            @Override
	            protected void updateItem(String item, boolean empty) {
	                super.updateItem(item, empty);
	                
	                setText(empty ? "" : getItem().toString());

	                if (item == null || empty) {
	                    setText(null);
	                    setStyle("");
	                } else {
	                	if (!item.isEmpty() && !item.equals("<no effect>") && getTableRow() != null) {
	                        getTableRow().setStyle("-fx-background-color:lightcoral");
	                    } else {
	                        setStyle("");
	                    }
	                }
	            }
	        };
	    });
	}
	
	/**
	 * A method to unhighlight the effects from the table view.
	 */
	public void unhighlightEffects() {
	    effectColumn.setCellFactory(column -> {
	        return new TableCell<EObject, String>() {
	            @Override
	            protected void updateItem(String item, boolean empty) {
	                super.updateItem(item, empty);
	                
	                setText(empty ? "" : getItem().toString());

	                if (item == null || empty) {
	                    setText(null);
	                    setStyle("");
	                }
	            }
	        };
	    });
	}
	
	/**
	 * A method to put the effects from EObjects to the table view.
	 * @param storeName The name of the store from which to collect
	 * the effects.
	 */
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
	
	/**
	 * A method that checks if a store has effects by
	 * checking the instance and then verifying if there is
	 * any effect in the list of elements.
	 * @param storeName A string that represents the name of the store.
	 * @return True if the store has at least one effect, false otherwise.
	 */
	public boolean hasEffects(String storeName) {
		switch (storeName) {
			case "Proposal store": {
				for (ProposalStore element: annotationsStore.getProposalElements()) {
					if (element.getEffect() != null) {
						return true;
					}
				}
				break;
			}
			case "Challenge store": {
				for (ProposalStore element: annotationsStore.getProposalElements()) {
					if (element.getEffect() != null) {
						return true;
					}
				}
				break;
			}
			case "Question store": {
				for (QuestionStore element: annotationsStore.getQuestionElements()) {
					if (element.getEffect() != null) {
						return true;
					}
				}
				break;
			}
			case "Commitment store": {
				for (CommitmentStore element: annotationsStore.getCommitmentElements()) {
					if (element.getEffect() != null) {
						return true;
					}
				}
				break;
			}
			case "Argument store": {
				for (ArgumentStore element: annotationsStore.getArgumentElements()) {
					if (element.getEffect() != null) {
						return true;
					}
				}
				break;
			}
		}
		return false;
	}
	
}