# AEMX-Angular Project
## Project Description:

The "aemx-angular" project is an Adobe Experience Manager (AEM) project that utilizes Angular to style its components and provide a modern user interface. This project includes a custom AEM component that displays a list of countries. The country data is fetched from an external API provided by the **aemx-quarkus** project, passed through Sling Model, and rendered using Angular in the AEM component.

## Key Features:

* Utilizes Angular for styling and providing a responsive user interface.
* Custom AEM component to display a list of countries.
* Fetches country data from the "aemx-quarkus" project through an API.
* Data is passed through Sling Model to the Angular-powered AEM component for rendering.

## Usage Guide
### Prerequisites:
* JAVA 8 and AEM instance (utilities)

### Run an instance of aem(utilities folder)
    java -Xrunjdwp:transport=dt_socket,server=y,address=30303,suspend=n  -jar cq-quickstart-6.5.0.jar

### Once instance is running on localhost:4502, Install project:
    mvn clean install -PautoInstallSinglePackage -Pclassic

### Navigate to the SPA Page Template at
    http://localhost:4502/editor.html/conf/wknd-spa-angular/settings/wcm/templates/spa-page-template/structure.html
* Update the Layout Container’s policy to add **Country Selector Component** as an allowed component.

* Navigate to http://localhost:4502/editor.html/content/wknd-spa-angular/us/en/home.html

* In Edit mode, add the **Country Selector Component**  to the Layout Container.