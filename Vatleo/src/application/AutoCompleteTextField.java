package application;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Side;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.CustomMenuItem;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class AutoCompleteTextField extends TextField {
	private SortedSet<String> entries;
	private SortedSet<String> idEntries;
	private SortedSet<String> senderEntries;
	private SortedSet<String> typeEntries;
	private SortedSet<String> scopeEntries;
	private SortedSet<String> focusEntries;
	private SortedSet<String> contentEntries;
	private SortedSet<String> targetEntries;
	private ContextMenu entriesPopup;

	public AutoCompleteTextField() {
		super();
		
		entries = new TreeSet<>();
		
		idEntries = new TreeSet<>();
		
		senderEntries = new TreeSet<>();
		
		typeEntries = new TreeSet<>();
		typeEntries.addAll(Arrays.asList("propose", "question", "challenge","justify", "withdraw", "accept", "reject", "commit", "uncommit"));
		
		scopeEntries = new TreeSet<>();
		scopeEntries.addAll(Arrays.asList("feature", "rating", "criteria", "topic"));
		
		focusEntries = new TreeSet<>();
		focusEntries.addAll(Arrays.asList("R", "S", "G", "V"));
		
		contentEntries = new TreeSet<>();
		
		targetEntries = new TreeSet<>();
		
		entriesPopup = new ContextMenu();
		
		textProperty().addListener(new ChangeListener<String>() {
			@Override
			public void changed(ObservableValue<? extends String> observableValue, String s, String s2) {
				
				if (getText().length() == 0) {
					entriesPopup.hide();
				} else {
					switch (countNumberOfCommas(getText()))
					{
						case 0: {
							entries = idEntries;
							break;
						}
						case 1: {
							entries = senderEntries;
							break;
						}
						case 2: {
							entries = typeEntries;
							break;
						}
						case 3: {
							entries = scopeEntries;
							break;
						}
						case 4: {
							entries = focusEntries;
							break;
						}
						case 5: {
							entries = contentEntries;
							break;
						}
						case 6: {
							entries = targetEntries;
							break;
						}
					}
					
					LinkedList<String> searchResult = new LinkedList<>();
//					searchResult.addAll(entries.subSet(getText(), getText() + Character.MAX_VALUE));
					String newText = getText().substring(getLastCommaIndex(getText()) + 1);
					newText = newText.replace(" ", "");
					searchResult.addAll(entries.subSet(newText, newText + Character.MAX_VALUE));
					
					if (entries.size() > 0) {
						populatePopup(searchResult);
						if (!entriesPopup.isShowing()) {
							entriesPopup.show(AutoCompleteTextField.this, Side.BOTTOM, getWidth() / 2 + getCaretPosition() * 3, - getHeight() / 2);
						}
					} else {
						entriesPopup.hide();
					}
				}
			}
		});

		focusedProperty().addListener(new ChangeListener<Boolean>() {
			@Override
			public void changed(ObservableValue<? extends Boolean> observableValue, Boolean aBoolean,
					Boolean aBoolean2) {
				entriesPopup.hide();
			}
		});

	}

	private void populatePopup(List<String> searchResult) {
		List<CustomMenuItem> menuItems = new LinkedList<>();
		
		int maxEntries = 15;
		int count = Math.min(searchResult.size(), maxEntries);
		for (int i = 0; i < count; i++) {
			final String result = searchResult.get(i);
			Label entryLabel = new Label(result);
			CustomMenuItem item = new CustomMenuItem(entryLabel, true);
			item.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent actionEvent) {
					setText(getText().substring(0,getLastCommaIndex(getText()) + 1).concat(" " + result));
					positionCaret(getText().length());
					entriesPopup.hide();
				}
			});
			menuItems.add(item);
		}
		entriesPopup.getItems().clear();
		entriesPopup.getItems().addAll(menuItems);
	}
	
	private int countNumberOfCommas(String text) {
		int commas = 0;
		
		for(int i = 0; i < text.length(); i++) {
		    if(text.charAt(i) == ',') commas++;
		}

		return commas;
	}
	
	private int getLastCommaIndex(String text) {
		int index = 0;
		
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == ',') index = i;
		}
		
		return index;
	}

	public SortedSet<String> getIdEntries() {
		return idEntries;
	}

	public SortedSet<String> getSenderEntries() {
		return senderEntries;
	}

	public SortedSet<String> getContentEntries() {
		return contentEntries;
	}

	public SortedSet<String> getTargetEntries() {
		return targetEntries;
	}
}