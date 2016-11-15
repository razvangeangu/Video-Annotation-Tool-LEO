# Video Annotation Tool LEO

This is an application that tries to respond to the needs of the TAFA paper (Towards Agent Dialogue as a Tool for Capturing Software Design Discussions) written by Elizabeth Black, Peter McBurney, and Steffen Zschaler | Department of Informatics, King’s College London.

Check the research experience report here: [KURF Report](https://www.dropbox.com/s/8v78phod017cbut/Razvan_Geangu_Report_KURF.pdf?dl=0)

![Report Poster](https://photos-3.dropbox.com/t/2/AADrFbkuBm_C0u8YehjoyAPewV2LdKUV8VUQAJ2tR0w-Wg/12/57929798/jpeg/32x32/1/_/1/2/Poster.jpg/EOuF4CwY-soCIAcoBw/OTWsDJQaPQoAnwvVGuwb0_2uAKEcB9Vo0IIA0ynLox0?size=2048x1536&size_mode=3)

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.

### Prerequisities

The project uses XText and JavaFX plugins within Eclipse and it also includes code written in Xtend and Java 8. It is recomended to have the latest version of Java JDK and Eclipse installed as well as the following libraries.

XText:
```
https://eclipse.org/Xtext/download.html
```

JavaFX:
```
https://eclipse.org/efxclipse/install.html
```

### Installing

"Run Configurations" might be necessary as XText and JavaFX are using common libraries. *Search for duplicate source file path* needs to be checked in the *Source* tab of "Run Configurations" for the following projects: *Vatleo*, *kcl.ac.uk.xtext.VideoAnnotationsDSL* and *kcl.ac.uk.xtext.AnnotationsStores*

## How to use
1. Open the application
```
Everything is disabled except for the **Open** button found in **File menu**
```
2. Open an *.mp4* video.
```
File format for video is *.mp4.
```
3. Either *add* or *import* annotations.
```
File format for annotations is *.videoannotationsdsl
```
4. Interpret annotations.

## More information
### Features
* Pressing on the **Add annotation** button will print the time stamp into **from time** text field first and then into **to time** text field.
* Right clicking an item from the table view opens a popup menu. There are 4 available options:
    1. Open a popup with the full description of the annotation.
    2. Remove an annotation.
    3. **Add** or **Remove** a comment for an annotation.
    4. Edit a comment for an annotation.
* Double clicking an item from the table view opens the full description of the annotation.
* Edit menu item contains two check items with the following effects:
    1. Edit annotations - if checked, when selecting an item from the table view, the text fields are filled with the annotation data and the **add annotation** button becomes **edit** button.
    2. View annotations - if checked, when selecting an item from the table view, the video seeks to the start time of the annotation.
* Clicking on the **backward** / **forward** buttons will seek the video 1 second backward or forward.
* The **time stamp** from the media player is a text field which can be edited. Pressing enter will seek to the time entered which can be from 00:00 to the end of the video.
* Clicking on the **interpret button** opens a window to select the store to be viewed.
* In the **store viewer** *(the window after pressing interpret button)* if there are any *effects* caused by annotations the window will have an *enabled* check box in the right corner which will highlight the *effects* by coloring red the lines that are removed and adding a new column **Affected by** which *specifies the id of the annotation which caused the removal*.

### Annotation syntax
```
from fromTime to toTime annotate (ID, Sender, Type, Scope, Focus, "Content-Label", "Content", Target) #"comment"#
```
**Where fromTime and toTime are the time in seconds for where the annotation starts and ends.*

## Built With

* Eclipse
* XText
* JavaFX
* SceneBuilder

## Versioning

This is version **1.0.0**.

## Authors

* **Razvan-Gabriel Geangu** - *King's Undergraduate Research Fellow* - [GitHub](https://github.com/RazvanGeangu)

See also the list of [contributors](https://github.kcl.ac.uk/videoAnnotation/Vatleo/contributors) who participated in this project.

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details.

## Acknowledgments

* [TAFA Paper](http://steffen-zschaler.de/publications/tafa2013.pdf)
