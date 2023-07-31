# Usage Guide
### Installation / Startup
* PREREQUISITES: JAVA 8 and AEM instance (utilities)
*  Run an instance of aem(utilities folder) : **java -Xrunjdwp:transport=dt_socket,server=y,address=30303,suspend=n  -jar cq-quickstart-6.5.0.jar -r "nosamplecontent,local,author,crx3,crx3tar"**
* Once instance is running on localhost:4502, Install project with : **mvn clean install -PautoInstallSinglePackage -Pclassic**
* Navigate to the SPA Page Template at http://localhost:4502/editor.html/conf/wknd-spa-angular/settings/wcm/templates/spa-page-template/structure.html.
* Update the Layout Container’s policy to add **Country Selector Component** as an allowed component.
* Navigate to http://localhost:4502/editor.html/content/wknd-spa-angular/us/en/home.html
* In Edit mode, add the **Country Selector Component**  to the Layout Container.