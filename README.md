#Responsibility Model Editor

Contributors

  * Robbie Simpson (robbies)
    University of Glasgow
    Email: r.simpson.3@research.gla.ac.uk
   
  * Tim Storer (twsswt/tws)
    University of Glasgow.
    Email: timothy.storer@glasgow.ac.uk

##Installing the Plugin in Eclipse or Obeo

An update site for the Responsibility Model Editor is available at:

    http://www.dcs.gla.ac.uk/~tws/resme-update-site/
    
In your IDE, choose Help -> Install New Software and click Add... to add a new update site.  Enter a name for the site (e.g. Responsibility Model Editor) and the URL above.  Now follow the instructions in the wizard for installing the Responsibility Model Editor feature from the site.

##Building the Update Site from Source

An Ant script is provided for constructing an update site from source.  This 
needs to be executed from within Eclipse, since it depends on a number of 
custom Eclipse tasks.  To do this, execute the following command line arguments:

    %>cd <resme>/update-site
    %>eclipse -noSplash -data . -application org.apache.ant.core.antRunner clean create-plugins

This will create an update site in <pre><resme>/update-site/target/update-site</pre>.  This can then be opened in an Eclipse project to install the Responsibility Model Editor features.

##How to create a new Responsibility Model:

  1. Create a new Modelling Project (File -> New -> Modelling Project or File -> New -> Other and choose Modelling Project).
  2. In that project, go to New-> Other -> Example EMF Model Creation Wizards -> ResponsibilityMetaModel Model/
  3. Click Next.
  4. Select `Scenario' as the Model Object. Finish.  This should create a responsibilitymodel file.
  5. Right click on the project and select `Viewpoints Selection'.
  6. Select `Responsibility Model'
  7. Right click on the project and select `Create Representation'
  8. Select 'Responsibility Diagram'
  9. Select the appropriate model file and Scenario object.
  10. Finish
  11. Name the representation file (default is 'Responsibility Model').


